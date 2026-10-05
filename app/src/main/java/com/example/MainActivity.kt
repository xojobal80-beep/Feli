package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.screens.BookCoverScreen
import com.example.ui.screens.HymnBookPagerScreen
import com.example.ui.screens.HymnListScreen
import com.example.ui.theme.HymnTheme
import com.example.ui.viewmodel.HymnalViewModel

enum class CurrentScreen {
    COVER,
    BOOK_PAGER,
    INDEX_SEARCH
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: HymnalViewModel = viewModel()
            HymnalApp(viewModel = viewModel)
        }
    }
}

@Composable
fun HymnalApp(viewModel: HymnalViewModel) {
    val allHymns by viewModel.allHymns.collectAsStateWithLifecycle()
    val filteredHymns by viewModel.filteredHymns.collectAsStateWithLifecycle()
    val currentHymnIndex by viewModel.currentHymnIndex.collectAsStateWithLifecycle()
    val searchQuery by viewModel.searchQuery.collectAsStateWithLifecycle()
    val readerSettings by viewModel.readerSettings.collectAsStateWithLifecycle()
    val transposeOffsets by viewModel.transposeOffsets.collectAsStateWithLifecycle()
    val favorites by viewModel.favorites.collectAsStateWithLifecycle()
    val metronomeState by viewModel.metronomeState.collectAsStateWithLifecycle()

    var currentScreen by remember { mutableStateOf(CurrentScreen.COVER) }

    // Navigation Back Handling
    BackHandler(enabled = currentScreen != CurrentScreen.COVER) {
        when (currentScreen) {
            CurrentScreen.INDEX_SEARCH -> currentScreen = CurrentScreen.BOOK_PAGER
            CurrentScreen.BOOK_PAGER -> currentScreen = CurrentScreen.COVER
            CurrentScreen.COVER -> { /* exit app */ }
        }
    }

    HymnTheme(darkTheme = readerSettings.themePreset.isDark) {
        Surface(modifier = Modifier.fillMaxSize()) {
            AnimatedContent(
                targetState = currentScreen,
                transitionSpec = { fadeIn() togetherWith fadeOut() },
                label = "ScreenTransition"
            ) { screen ->
                when (screen) {
                    CurrentScreen.COVER -> {
                        BookCoverScreen(
                            totalHymnsCount = allHymns.size,
                            lastOpenedHymn = allHymns.getOrNull(currentHymnIndex),
                            onOpenBook = { currentScreen = CurrentScreen.BOOK_PAGER },
                            onOpenIndex = { currentScreen = CurrentScreen.INDEX_SEARCH },
                            onOpenSearch = { currentScreen = CurrentScreen.INDEX_SEARCH }
                        )
                    }

                    CurrentScreen.INDEX_SEARCH -> {
                        HymnListScreen(
                            hymns = filteredHymns,
                            searchQuery = searchQuery,
                            favorites = favorites,
                            onSearchQueryChanged = viewModel::onSearchQueryChanged,
                            onHymnSelected = { hymn ->
                                viewModel.selectHymnByNumber(hymn.number)
                                currentScreen = CurrentScreen.BOOK_PAGER
                            },
                            onToggleFavorite = viewModel::toggleFavorite,
                            onBackToCover = { currentScreen = CurrentScreen.COVER }
                        )
                    }

                    CurrentScreen.BOOK_PAGER -> {
                        HymnBookPagerScreen(
                            hymns = allHymns,
                            currentIndex = currentHymnIndex,
                            readerSettings = readerSettings,
                            transposeOffsets = transposeOffsets,
                            favorites = favorites,
                            metronomeState = metronomeState,
                            onPageChanged = viewModel::selectHymnByIndex,
                            onToggleFavorite = viewModel::toggleFavorite,
                            onTransposeOffsetChanged = viewModel::setHymnTranspose,
                            onFontSizeChanged = viewModel::updateFontSize,
                            onZoomChanged = viewModel::updateZoom,
                            onThemePresetSelected = viewModel::setThemePreset,
                            onCustomColorsChanged = viewModel::setCustomColors,
                            onToggleChords = viewModel::toggleShowChords,
                            onToggleHighlightChords = viewModel::toggleHighlightChords,
                            onToggleMetronome = viewModel::toggleMetronome,
                            onMetronomeBpmChanged = viewModel::setMetronomeBpm,
                            onOpenIndex = { currentScreen = CurrentScreen.INDEX_SEARCH },
                            onOpenCover = { currentScreen = CurrentScreen.COVER }
                        )
                    }
                }
            }
        }
    }
}
