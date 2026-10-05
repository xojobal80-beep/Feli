package com.example.data.model

import androidx.compose.ui.graphics.Color

enum class HymnThemePreset(
    val title: String,
    val backgroundColor: Long,
    val textColor: Long,
    val chordColor: Long,
    val secondaryTextColor: Long,
    val isDark: Boolean
) {
    PARCHMENT(
        title = "Papiro / Clásico",
        backgroundColor = 0xFFFDFBF7,
        textColor = 0xFF1C1917,
        chordColor = 0xFFB45309, // Amber Brown
        secondaryTextColor = 0xFF78716C,
        isDark = false
    ),
    SEPIA(
        title = "Sepia Cálido",
        backgroundColor = 0xFFF4ECD8,
        textColor = 0xFF3D2E1E,
        chordColor = 0xFF9A3412, // Rich Burnt Amber
        secondaryTextColor = 0xFF7C6F5B,
        isDark = false
    ),
    PURE_WHITE(
        title = "Blanco Puro",
        backgroundColor = 0xFFFFFFFF,
        textColor = 0xFF0F172A,
        chordColor = 0xFF2563EB, // Royal Blue
        secondaryTextColor = 0xFF64748B,
        isDark = false
    ),
    NIGHT_DARK(
        title = "Modo Noche",
        backgroundColor = 0xFF121824,
        textColor = 0xFFF1F5F9,
        chordColor = 0xFFFBBF24, // Warm Gold
        secondaryTextColor = 0xFF94A3B8,
        isDark = true
    ),
    OLED_BLACK(
        title = "Negro OLED",
        backgroundColor = 0xFF000000,
        textColor = 0xFFE2E8F0,
        chordColor = 0xFF38BDF8, // Light Sky
        secondaryTextColor = 0xFF64748B,
        isDark = true
    ),
    FOREST_DARK(
        title = "Verde Selva",
        backgroundColor = 0xFF0F201B,
        textColor = 0xFFECFDF5,
        chordColor = 0xFF34D399, // Emerald
        secondaryTextColor = 0xFF6EE7B7,
        isDark = true
    )
}

data class ReaderSettings(
    val fontSizeSp: Float = 18f,
    val zoomFactor: Float = 1.0f,
    val themePreset: HymnThemePreset = HymnThemePreset.PARCHMENT,
    val customTextColor: Long? = null,
    val customBgColor: Long? = null,
    val customChordColor: Long? = null,
    val showChords: Boolean = true,
    val showChordDiagrams: Boolean = false,
    val highlightChords: Boolean = true,
    val boldLyrics: Boolean = false,
    val twoPageMode: Boolean = false
) {
    fun currentBgColor(): Color =
        if (customBgColor != null) Color(customBgColor) else Color(themePreset.backgroundColor)

    fun currentTextColor(): Color =
        if (customTextColor != null) Color(customTextColor) else Color(themePreset.textColor)

    fun currentChordColor(): Color =
        if (customChordColor != null) Color(customChordColor) else Color(themePreset.chordColor)

    fun currentSecondaryTextColor(): Color =
        if (themePreset.isDark) Color(0xFF94A3B8) else Color(0xFF78716C)
}
