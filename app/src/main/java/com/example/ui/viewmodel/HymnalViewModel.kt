package com.example.ui.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.model.Hymn
import com.example.data.model.HymnThemePreset
import com.example.data.model.ReaderSettings
import com.example.data.repository.HymnalRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

data class MetronomeState(
    val isPlaying: Boolean = false,
    val bpm: Int = 80,
    val beat: Int = 0,
    val beatsPerMeasure: Int = 4
)

class HymnalViewModel(application: Application) : AndroidViewModel(application) {

    private val prefs = application.getSharedPreferences("hymnal_prefs", Context.MODE_PRIVATE)

    private val _allHymns = MutableStateFlow<List<Hymn>>(emptyList())
    val allHymns: StateFlow<List<Hymn>> = _allHymns.asStateFlow()

    private val _currentHymnIndex = MutableStateFlow(0)
    val currentHymnIndex: StateFlow<Int> = _currentHymnIndex.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _filteredHymns = MutableStateFlow<List<Hymn>>(emptyList())
    val filteredHymns: StateFlow<List<Hymn>> = _filteredHymns.asStateFlow()

    private val _readerSettings = MutableStateFlow(ReaderSettings())
    val readerSettings: StateFlow<ReaderSettings> = _readerSettings.asStateFlow()

    // Map of hymn number to semitone transpose offset (-11 to +11)
    private val _transposeOffsets = MutableStateFlow<Map<Int, Int>>(emptyMap())
    val transposeOffsets: StateFlow<Map<Int, Int>> = _transposeOffsets.asStateFlow()

    private val _favorites = MutableStateFlow<Set<Int>>(emptySet())
    val favorites: StateFlow<Set<Int>> = _favorites.asStateFlow()

    private val _showBookCover = MutableStateFlow(false)
    val showBookCover: StateFlow<Boolean> = _showBookCover.asStateFlow()

    private val _metronomeState = MutableStateFlow(MetronomeState())
    val metronomeState: StateFlow<MetronomeState> = _metronomeState.asStateFlow()

    private var metronomeJob: Job? = null

    init {
        loadData()
        loadSettings()
    }

    private fun loadData() {
        val hymns = HymnalRepository.getAllHymns()
        _allHymns.value = hymns
        _filteredHymns.value = hymns

        // Load favorites from prefs
        val favSet = prefs.getStringSet("favorites", emptySet()) ?: emptySet()
        _favorites.value = favSet.mapNotNull { it.toIntOrNull() }.toSet()

        val lastIndex = prefs.getInt("last_hymn_index", 0)
        if (lastIndex in hymns.indices) {
            _currentHymnIndex.value = lastIndex
        }
    }

    private fun loadSettings() {
        val fontSize = prefs.getFloat("font_size", 18f)
        val zoom = prefs.getFloat("zoom_factor", 1.0f)
        val themeOrdinal = prefs.getInt("theme_preset", HymnThemePreset.PARCHMENT.ordinal)
        val showChords = prefs.getBoolean("show_chords", true)
        val highlightChords = prefs.getBoolean("highlight_chords", true)

        val preset = HymnThemePreset.values().getOrNull(themeOrdinal) ?: HymnThemePreset.PARCHMENT

        _readerSettings.value = ReaderSettings(
            fontSizeSp = fontSize,
            zoomFactor = zoom,
            themePreset = preset,
            showChords = showChords,
            highlightChords = highlightChords
        )
    }

    fun onSearchQueryChanged(query: String) {
        _searchQuery.value = query
        _filteredHymns.value = HymnalRepository.searchHymns(query)
    }

    fun selectHymnByIndex(index: Int) {
        if (index in _allHymns.value.indices) {
            _currentHymnIndex.value = index
            _showBookCover.value = false
            prefs.edit().putInt("last_hymn_index", index).apply()
        }
    }

    fun selectHymnByNumber(number: Int): Boolean {
        val index = HymnalRepository.getIndexForHymnNumber(number)
        if (index >= 0) {
            selectHymnByIndex(index)
            return true
        }
        return false
    }

    fun goToNextHymn() {
        if (_currentHymnIndex.value < _allHymns.value.size - 1) {
            selectHymnByIndex(_currentHymnIndex.value + 1)
        }
    }

    fun goToPreviousHymn() {
        if (_currentHymnIndex.value > 0) {
            selectHymnByIndex(_currentHymnIndex.value - 1)
        }
    }

    fun setCoverVisible(visible: Boolean) {
        _showBookCover.value = visible
    }

    fun toggleFavorite(hymnNumber: Int) {
        val current = _favorites.value.toMutableSet()
        if (current.contains(hymnNumber)) {
            current.remove(hymnNumber)
        } else {
            current.add(hymnNumber)
        }
        _favorites.value = current
        prefs.edit().putStringSet("favorites", current.map { it.toString() }.toSet()).apply()
    }

    fun setHymnTranspose(hymnNumber: Int, semitones: Int) {
        val effective = ((semitones % 12) + 12) % 12
        _transposeOffsets.update { map ->
            val mutable = map.toMutableMap()
            if (effective == 0) {
                mutable.remove(hymnNumber)
            } else {
                mutable[hymnNumber] = effective
            }
            mutable
        }
    }

    fun incrementTranspose(hymnNumber: Int) {
        val current = _transposeOffsets.value[hymnNumber] ?: 0
        setHymnTranspose(hymnNumber, current + 1)
    }

    fun decrementTranspose(hymnNumber: Int) {
        val current = _transposeOffsets.value[hymnNumber] ?: 0
        setHymnTranspose(hymnNumber, current - 1)
    }

    fun resetTranspose(hymnNumber: Int) {
        setHymnTranspose(hymnNumber, 0)
    }

    fun updateFontSize(sizeSp: Float) {
        val clamped = sizeSp.coerceIn(12f, 36f)
        _readerSettings.update { it.copy(fontSizeSp = clamped) }
        prefs.edit().putFloat("font_size", clamped).apply()
    }

    fun updateZoom(factor: Float) {
        val clamped = factor.coerceIn(0.6f, 2.5f)
        _readerSettings.update { it.copy(zoomFactor = clamped) }
        prefs.edit().putFloat("zoom_factor", clamped).apply()
    }

    fun setThemePreset(preset: HymnThemePreset) {
        _readerSettings.update {
            it.copy(
                themePreset = preset,
                customBgColor = null,
                customTextColor = null,
                customChordColor = null
            )
        }
        prefs.edit().putInt("theme_preset", preset.ordinal).apply()
    }

    fun setCustomColors(bgColor: Long?, textColor: Long?, chordColor: Long?) {
        _readerSettings.update {
            it.copy(
                customBgColor = bgColor,
                customTextColor = textColor,
                customChordColor = chordColor
            )
        }
    }

    fun toggleShowChords() {
        val newValue = !_readerSettings.value.showChords
        _readerSettings.update { it.copy(showChords = newValue) }
        prefs.edit().putBoolean("show_chords", newValue).apply()
    }

    fun toggleHighlightChords() {
        val newValue = !_readerSettings.value.highlightChords
        _readerSettings.update { it.copy(highlightChords = newValue) }
        prefs.edit().putBoolean("highlight_chords", newValue).apply()
    }

    // Metronome controls
    fun toggleMetronome() {
        val current = _metronomeState.value.isPlaying
        if (current) {
            stopMetronome()
        } else {
            startMetronome()
        }
    }

    fun setMetronomeBpm(bpm: Int) {
        val clamped = bpm.coerceIn(40, 240)
        _metronomeState.update { it.copy(bpm = clamped) }
        if (_metronomeState.value.isPlaying) {
            startMetronome()
        }
    }

    private fun startMetronome() {
        metronomeJob?.cancel()
        _metronomeState.update { it.copy(isPlaying = true) }
        metronomeJob = viewModelScope.launch {
            while (isActive) {
                val delayMs = (60_000L / _metronomeState.value.bpm.toLong()).coerceAtLeast(100L)
                _metronomeState.update {
                    it.copy(beat = (it.beat + 1) % it.beatsPerMeasure)
                }
                delay(delayMs)
            }
        }
    }

    private fun stopMetronome() {
        metronomeJob?.cancel()
        metronomeJob = null
        _metronomeState.update { it.copy(isPlaying = false, beat = 0) }
    }

    override fun onCleared() {
        super.onCleared()
        stopMetronome()
    }
}
