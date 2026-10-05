package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.HymnLine
import com.example.data.model.HymnSection
import com.example.data.model.ReaderSettings
import com.example.data.model.SectionType
import com.example.util.ChordTransposer

@Composable
fun HymnSectionView(
    section: HymnSection,
    semitoneOffset: Int,
    settings: ReaderSettings,
    modifier: Modifier = Modifier
) {
    val scaledFontSize = (settings.fontSizeSp * settings.zoomFactor).coerceIn(10f, 48f)
    val chordFontSize = (scaledFontSize * 0.85f).coerceIn(9f, 40f)
    val textColor = settings.currentTextColor()
    val chordColor = settings.currentChordColor()

    val isChorus = section.type == SectionType.CHORUS

    Column(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (isChorus) {
                    Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(chordColor.copy(alpha = 0.08f))
                        .padding(start = 14.dp, end = 12.dp, top = 10.dp, bottom = 10.dp)
                } else {
                    Modifier.padding(vertical = 6.dp)
                }
            )
    ) {
        if (isChorus) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .width(4.dp)
                        .height(16.dp)
                        .background(chordColor, RoundedCornerShape(2.dp))
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = "CORO",
                    color = chordColor,
                    fontSize = (scaledFontSize * 0.75f).sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.5.sp
                )
            }
        } else if (section.sectionNumber != null) {
            Text(
                text = "${section.sectionNumber}.",
                color = chordColor.copy(alpha = 0.9f),
                fontSize = (scaledFontSize * 0.8f).sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        section.lines.forEach { line ->
            HymnLineItem(
                line = line,
                semitoneOffset = semitoneOffset,
                settings = settings,
                scaledFontSize = scaledFontSize,
                chordFontSize = chordFontSize,
                textColor = textColor,
                chordColor = chordColor,
                isChorus = isChorus
            )
        }
    }
}

@Composable
fun HymnLineItem(
    line: HymnLine,
    semitoneOffset: Int,
    settings: ReaderSettings,
    scaledFontSize: Float,
    chordFontSize: Float,
    textColor: Color,
    chordColor: Color,
    isChorus: Boolean
) {
    val transposedChords = if (line.chords.isNotBlank()) {
        ChordTransposer.transposeChordLine(line.chords, semitoneOffset)
    } else ""

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
    ) {
        // Show Chords if present and enabled
        if (settings.showChords && transposedChords.isNotBlank()) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                if (settings.highlightChords) {
                    Surface(
                        color = chordColor.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.padding(bottom = 2.dp)
                    ) {
                        Text(
                            text = transposedChords,
                            color = chordColor,
                            fontSize = chordFontSize.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Monospace,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                } else {
                    Text(
                        text = transposedChords,
                        color = chordColor,
                        fontSize = chordFontSize.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier.padding(bottom = 2.dp)
                    )
                }
            }
        }

        // Lyrics
        Text(
            text = line.lyrics,
            color = textColor,
            fontSize = scaledFontSize.sp,
            lineHeight = (scaledFontSize * 1.35f).sp,
            fontWeight = if (settings.boldLyrics || isChorus) FontWeight.SemiBold else FontWeight.Normal,
            fontStyle = if (isChorus) FontStyle.Italic else FontStyle.Normal,
            modifier = Modifier.fillMaxWidth()
        )
    }
}
