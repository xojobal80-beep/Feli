package com.example.data.repository

import com.example.data.model.Hymn
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object HymnalRepository {

    private val hymnsInternalList: List<Hymn> by lazy {
        val list = mutableListOf<Hymn>()
        list.addAll(HymnDataProviderPart1.getHymns())
        list.addAll(HymnDataProviderPart2.getHymns())
        list.addAll(HymnDataProviderPart3.getHymns())
        list.addAll(HymnDataProviderPart4.getHymns())
        list.sortedBy { it.number }
    }

    private val _favorites = MutableStateFlow<Set<Int>>(emptySet())
    val favorites: StateFlow<Set<Int>> = _favorites.asStateFlow()

    fun getAllHymns(): List<Hymn> = hymnsInternalList

    fun getHymnByNumber(number: Int): Hymn? {
        return hymnsInternalList.find { it.number == number }
    }

    fun getHymnByIndex(index: Int): Hymn? {
        return hymnsInternalList.getOrNull(index)
    }

    fun getIndexForHymnNumber(number: Int): Int {
        val idx = hymnsInternalList.indexOfFirst { it.number == number }
        return if (idx >= 0) idx else 0
    }

    fun searchHymns(query: String): List<Hymn> {
        val trimmed = query.trim()
        if (trimmed.isEmpty()) return hymnsInternalList

        val numberQuery = trimmed.toIntOrNull()
        if (numberQuery != null) {
            val exactNumberMatch = hymnsInternalList.filter { it.number == numberQuery }
            val startingWithNumber = hymnsInternalList.filter { it.number.toString().startsWith(trimmed) && it.number != numberQuery }
            return exactNumberMatch + startingWithNumber
        }

        return hymnsInternalList.filter { hymn ->
            hymn.title.contains(trimmed, ignoreCase = true) ||
            hymn.crossRef.contains(trimmed, ignoreCase = true) ||
            hymn.fullSearchableText().contains(trimmed, ignoreCase = true)
        }
    }

    fun toggleFavorite(hymnNumber: Int) {
        val current = _favorites.value.toMutableSet()
        if (current.contains(hymnNumber)) {
            current.remove(hymnNumber)
        } else {
            current.add(hymnNumber)
        }
        _favorites.value = current
    }

    fun isFavorite(hymnNumber: Int): Boolean {
        return _favorites.value.contains(hymnNumber)
    }
}
