package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.FormatListNumbered
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Speed
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material.icons.filled.ZoomOut
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.Hymn
import com.example.data.model.HymnThemePreset
import com.example.data.model.ReaderSettings
import com.example.ui.components.BookPageBackground
import com.example.ui.components.HymnSectionView
import com.example.ui.components.MetronomeBottomSheet
import com.example.ui.components.ReaderSettingsBottomSheet
import com.example.ui.components.TranspositionBottomSheet
import com.example.ui.viewmodel.MetronomeState
import com.example.util.ChordTransposer
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HymnBookPagerScreen(
    hymns: List<Hymn>,
    currentIndex: Int,
    readerSettings: ReaderSettings,
    transposeOffsets: Map<Int, Int>,
    favorites: Set<Int>,
    metronomeState: MetronomeState,
    onPageChanged: (Int) -> Unit,
    onToggleFavorite: (Int) -> Unit,
    onTransposeOffsetChanged: (hymnNumber: Int, offset: Int) -> Unit,
    onFontSizeChanged: (Float) -> Unit,
    onZoomChanged: (Float) -> Unit,
    onThemePresetSelected: (HymnThemePreset) -> Unit,
    onCustomColorsChanged: (bgColor: Long?, textColor: Long?, chordColor: Long?) -> Unit,
    onToggleChords: () -> Unit,
    onToggleHighlightChords: () -> Unit,
    onToggleMetronome: () -> Unit,
    onMetronomeBpmChanged: (Int) -> Unit,
    onOpenIndex: () -> Unit,
    onOpenCover: () -> Unit,
    modifier: Modifier = Modifier
) {
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState(
        initialPage = currentIndex.coerceIn(0, (hymns.size - 1).coerceAtLeast(0)),
        pageCount = { hymns.size }
    )

    // Sync pager state with ViewModel
    LaunchedEffect(currentIndex) {
        if (pagerState.currentPage != currentIndex && currentIndex in hymns.indices) {
            pagerState.animateScrollToPage(currentIndex)
        }
    }

    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            onPageChanged(page)
        }
    }

    var showTransposeSheet by remember { mutableStateOf(false) }
    var showSettingsSheet by remember { mutableStateOf(false) }
    var showMetronomeSheet by remember { mutableStateOf(false) }
    var showPageScrubber by remember { mutableStateOf(false) }

    val currentHymn = hymns.getOrNull(pagerState.currentPage) ?: hymns.firstOrNull()
    val currentHymnNumber = currentHymn?.number ?: 1
    val currentOffset = transposeOffsets[currentHymnNumber] ?: 0

    val currentKey = if (currentHymn != null) {
        ChordTransposer.transposeSingleNote(currentHymn.originalKey, currentOffset)
    } else "C"

    val isDark = readerSettings.themePreset.isDark
    val pageBgColor = readerSettings.currentBgColor()
    val textColor = readerSettings.currentTextColor()
    val chordColor = readerSettings.currentChordColor()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "Himno #${currentHymn?.number ?: ""}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 17.sp,
                            color = textColor
                        )
                        if (currentHymn != null && currentHymn.crossRef.isNotBlank()) {
                            Text(
                                text = currentHymn.crossRef,
                                fontSize = 11.sp,
                                color = readerSettings.currentSecondaryTextColor()
                            )
                        }
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = onOpenCover,
                        modifier = Modifier.testTag("open_cover_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.MenuBook,
                            contentDescription = "Portada",
                            tint = textColor
                        )
                    }
                },
                actions = {
                    // Transposition quick badge / trigger
                    Surface(
                        color = chordColor.copy(alpha = 0.15f),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .clickable { showTransposeSheet = true }
                            .padding(end = 4.dp)
                            .testTag("transpose_badge_button")
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.MusicNote,
                                contentDescription = null,
                                tint = chordColor,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "$currentKey ${if (currentOffset != 0) "(${if (currentOffset > 0) "+$currentOffset" else "$currentOffset"})" else ""}",
                                color = chordColor,
                                fontWeight = FontWeight.Bold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    // Index search icon
                    IconButton(
                        onClick = onOpenIndex,
                        modifier = Modifier.testTag("open_index_top_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Buscar e Índice",
                            tint = textColor
                        )
                    }

                    // Favorite button
                    IconButton(
                        onClick = { onToggleFavorite(currentHymnNumber) },
                        modifier = Modifier.testTag("favorite_button")
                    ) {
                        Icon(
                            imageVector = if (favorites.contains(currentHymnNumber)) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                            contentDescription = "Favorito",
                            tint = if (favorites.contains(currentHymnNumber)) chordColor else textColor
                        )
                    }

                    // Quick Dark / Light toggle
                    IconButton(
                        onClick = {
                            val nextPreset = if (isDark) HymnThemePreset.PARCHMENT else HymnThemePreset.NIGHT_DARK
                            onThemePresetSelected(nextPreset)
                        },
                        modifier = Modifier.testTag("quick_dark_toggle_button")
                    ) {
                        Icon(
                            imageVector = if (isDark) Icons.Default.LightMode else Icons.Default.DarkMode,
                            contentDescription = "Modo Oscuro / Claro",
                            tint = textColor
                        )
                    }

                    // Settings dialog button
                    IconButton(
                        onClick = { showSettingsSheet = true },
                        modifier = Modifier.testTag("reader_settings_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "Ajustes",
                            tint = textColor
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = pageBgColor
                )
            )
        },
        bottomBar = {
            // Book Footer & Page Turning Controls
            Surface(
                color = pageBgColor,
                shadowElevation = 8.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    // Page navigation row
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // Previous Page Button
                        IconButton(
                            onClick = {
                                if (pagerState.currentPage > 0) {
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(pagerState.currentPage - 1)
                                    }
                                }
                            },
                            enabled = pagerState.currentPage > 0,
                            modifier = Modifier.testTag("prev_page_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Himno anterior",
                                tint = if (pagerState.currentPage > 0) textColor else textColor.copy(alpha = 0.3f)
                            )
                        }

                        // Page indicator & Quick Scrubber Toggle
                        Surface(
                            color = chordColor.copy(alpha = 0.1f),
                            shape = RoundedCornerShape(16.dp),
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .clickable { showPageScrubber = !showPageScrubber }
                        ) {
                            Text(
                                text = "Página ${pagerState.currentPage + 1} de ${hymns.size}",
                                color = textColor,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                            )
                        }

                        // Next Page Button
                        IconButton(
                            onClick = {
                                if (pagerState.currentPage < hymns.size - 1) {
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                                    }
                                }
                            },
                            enabled = pagerState.currentPage < hymns.size - 1,
                            modifier = Modifier.testTag("next_page_button")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = "Siguiente himno",
                                tint = if (pagerState.currentPage < hymns.size - 1) textColor else textColor.copy(alpha = 0.3f)
                            )
                        }
                    }

                    // Scrubber slider
                    AnimatedVisibility(visible = showPageScrubber) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Slider(
                                value = pagerState.currentPage.toFloat(),
                                onValueChange = { pageFloat ->
                                    coroutineScope.launch {
                                        pagerState.scrollToPage(pageFloat.toInt())
                                    }
                                },
                                valueRange = 0f..(hymns.size - 1).toFloat(),
                                modifier = Modifier.fillMaxWidth().testTag("page_scrubber_slider")
                            )
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "#${hymns.firstOrNull()?.number ?: 1}",
                                    fontSize = 11.sp,
                                    color = readerSettings.currentSecondaryTextColor()
                                )
                                Text(
                                    text = "Desliza para cambiar de himno",
                                    fontSize = 11.sp,
                                    color = readerSettings.currentSecondaryTextColor()
                                )
                                Text(
                                    text = "#${hymns.lastOrNull()?.number ?: 1}",
                                    fontSize = 11.sp,
                                    color = readerSettings.currentSecondaryTextColor()
                                )
                            }
                        }
                    }
                }
            }
        },
        floatingActionButton = {
            // Floating Metronome Button
            FloatingActionButton(
                onClick = { showMetronomeSheet = true },
                containerColor = if (metronomeState.isPlaying) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary,
                contentColor = Color.White,
                shape = CircleShape,
                modifier = Modifier
                    .size(50.dp)
                    .testTag("fab_metronome")
            ) {
                Icon(
                    imageVector = Icons.Default.Speed,
                    contentDescription = "Metrónomo",
                    modifier = Modifier.size(24.dp)
                )
            }
        },
        modifier = modifier
    ) { paddingValues ->
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .testTag("hymn_horizontal_pager")
        ) { pageIndex ->
            val hymn = hymns.getOrNull(pageIndex)
            if (hymn != null) {
                val offset = transposeOffsets[hymn.number] ?: 0

                // Pinch-to-zoom state
                val transformableState = rememberTransformableState { zoomChange, _, _ ->
                    val newZoom = (readerSettings.zoomFactor * zoomChange).coerceIn(0.6f, 2.5f)
                    onZoomChanged(newZoom)
                }

                BookPageBackground(
                    bgColor = pageBgColor,
                    isDark = isDark
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 24.dp)
                            .transformable(state = transformableState)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Spacer(modifier = Modifier.height(8.dp))

                        // Hymn Header in Book Style
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 12.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "${hymn.number}",
                                fontSize = ((readerSettings.fontSizeSp + 8) * readerSettings.zoomFactor).sp,
                                fontWeight = FontWeight.Black,
                                color = chordColor
                            )

                            Text(
                                text = hymn.title,
                                fontSize = ((readerSettings.fontSizeSp + 4) * readerSettings.zoomFactor).sp,
                                fontWeight = FontWeight.Bold,
                                textAlign = TextAlign.Center,
                                color = textColor,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )

                            if (hymn.crossRef.isNotBlank()) {
                                Text(
                                    text = "(${hymn.crossRef})",
                                    fontSize = ((readerSettings.fontSizeSp - 4) * readerSettings.zoomFactor).sp,
                                    color = readerSettings.currentSecondaryTextColor(),
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                )
                            }
                        }

                        HorizontalDivider(
                            color = chordColor.copy(alpha = 0.2f),
                            thickness = 1.dp,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )

                        // Hymn Verses & Chorus
                        hymn.sections.forEach { section ->
                            HymnSectionView(
                                section = section,
                                semitoneOffset = offset,
                                settings = readerSettings
                            )
                            Spacer(modifier = Modifier.height(10.dp))
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        // Book End Flourish / Footer
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "❦ ❦ ❦",
                                color = chordColor.copy(alpha = 0.5f),
                                fontSize = 16.sp
                            )
                            Text(
                                text = "K'eoj Ta sk'op Chenalho",
                                fontSize = 11.sp,
                                color = readerSettings.currentSecondaryTextColor(),
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(48.dp))
                    }
                }
            }
        }
    }

    // Transposition Modal Bottom Sheet
    if (showTransposeSheet && currentHymn != null) {
        val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
        TranspositionBottomSheet(
            hymn = currentHymn,
            currentOffset = currentOffset,
            onOffsetChanged = { offset ->
                onTransposeOffsetChanged(currentHymn.number, offset)
            },
            sheetState = sheetState,
            onDismiss = { showTransposeSheet = false }
        )
    }

    // Reader Settings Modal Bottom Sheet
    if (showSettingsSheet) {
        val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
        ReaderSettingsBottomSheet(
            settings = readerSettings,
            onFontSizeChanged = onFontSizeChanged,
            onZoomChanged = onZoomChanged,
            onThemePresetSelected = onThemePresetSelected,
            onToggleChords = onToggleChords,
            onToggleHighlightChords = onToggleHighlightChords,
            onCustomColorsChanged = onCustomColorsChanged,
            sheetState = sheetState,
            onDismiss = { showSettingsSheet = false }
        )
    }

    // Metronome Modal Bottom Sheet
    if (showMetronomeSheet) {
        val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
        MetronomeBottomSheet(
            state = metronomeState,
            onTogglePlay = onToggleMetronome,
            onBpmChanged = onMetronomeBpmChanged,
            sheetState = sheetState,
            onDismiss = { showMetronomeSheet = false }
        )
    }
}
