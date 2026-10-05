package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.FormatColorFill
import androidx.compose.material.icons.filled.FormatSize
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material.icons.filled.ZoomOut
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.model.HymnThemePreset
import com.example.data.model.ReaderSettings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReaderSettingsBottomSheet(
    settings: ReaderSettings,
    onFontSizeChanged: (Float) -> Unit,
    onZoomChanged: (Float) -> Unit,
    onThemePresetSelected: (HymnThemePreset) -> Unit,
    onToggleChords: () -> Unit,
    onToggleHighlightChords: () -> Unit,
    onCustomColorsChanged: (bgColor: Long?, textColor: Long?, chordColor: Long?) -> Unit,
    sheetState: SheetState,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(bottom = 36.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Ajustes de Lectura y Visualización",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // 1. TEMA Y COLOR DE FONDO / LETRA
            Text(
                text = "Tema y Colores (Fondo / Letra)",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HymnThemePreset.values().take(3).forEach { preset ->
                    ThemePresetCard(
                        preset = preset,
                        isSelected = settings.themePreset == preset && settings.customBgColor == null,
                        onClick = { onThemePresetSelected(preset) },
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                HymnThemePreset.values().drop(3).take(3).forEach { preset ->
                    ThemePresetCard(
                        preset = preset,
                        isSelected = settings.themePreset == preset && settings.customBgColor == null,
                        onClick = { onThemePresetSelected(preset) },
                        modifier = Modifier.weight(1f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Palette options for custom text / chord colors
            Text(
                text = "Color de Acordes Rápido",
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                val chordColors = listOf(
                    0xFFB45309 to "Ámbar",
                    0xFF2563EB to "Azul",
                    0xFFDC2626 to "Rojo",
                    0xFF059669 to "Esmeralda",
                    0xFF7C3AED to "Púrpura",
                    0xFFF59E0B to "Dorado"
                )

                chordColors.forEach { (colorHex, _) ->
                    val isSelected = settings.customChordColor == colorHex ||
                            (settings.customChordColor == null && settings.themePreset.chordColor == colorHex)
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(Color(colorHex))
                            .clickable {
                                onCustomColorsChanged(
                                    settings.customBgColor,
                                    settings.customTextColor,
                                    colorHex
                                )
                            }
                            .border(
                                width = if (isSelected) 3.dp else 1.dp,
                                color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Gray.copy(alpha = 0.3f),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            // 2. TAMAÑO DE LETRA
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.FormatSize,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Tamaño de Letra",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Text(
                    text = "${settings.fontSizeSp.toInt()} pt",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("A", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurfaceVariant)
                Slider(
                    value = settings.fontSizeSp,
                    onValueChange = onFontSizeChanged,
                    valueRange = 14f..32f,
                    steps = 8,
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 12.dp)
                        .testTag("font_size_slider")
                )
                Text("A", fontSize = 26.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            // 3. ZOOM DE TEXTO
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.ZoomIn,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Zoom de Texto",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Text(
                    text = "${(settings.zoomFactor * 100).toInt()}%",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                FilledTonalButton(
                    onClick = { onZoomChanged((settings.zoomFactor - 0.15f).coerceAtLeast(0.7f)) },
                    modifier = Modifier.testTag("zoom_out_button")
                ) {
                    Icon(imageVector = Icons.Default.ZoomOut, contentDescription = "Alejar")
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("-15%")
                }

                FilledTonalButton(
                    onClick = { onZoomChanged(1.0f) },
                    modifier = Modifier.testTag("zoom_reset_button")
                ) {
                    Text("100% (Normal)")
                }

                FilledTonalButton(
                    onClick = { onZoomChanged((settings.zoomFactor + 0.15f).coerceAtMost(2.2f)) },
                    modifier = Modifier.testTag("zoom_in_button")
                ) {
                    Icon(imageVector = Icons.Default.ZoomIn, contentDescription = "Acercar")
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("+15%")
                }
            }

            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            // 4. OPCIONES DE ACORDES
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Mostrar Acordes",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Ver acordes de acompañamiento",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Switch(
                    checked = settings.showChords,
                    onCheckedChange = { onToggleChords() },
                    modifier = Modifier.testTag("show_chords_switch")
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Resaltar Acordes en Caja",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Etiquetas visuales para cada acorde",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Switch(
                    checked = settings.highlightChords,
                    onCheckedChange = { onToggleHighlightChords() },
                    enabled = settings.showChords,
                    modifier = Modifier.testTag("highlight_chords_switch")
                )
            }
        }
    }
}

@Composable
fun ThemePresetCard(
    preset: HymnThemePreset,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .border(
                width = if (isSelected) 2.5.dp else 1.dp,
                color = if (isSelected) MaterialTheme.colorScheme.primary else Color.LightGray.copy(alpha = 0.5f),
                shape = RoundedCornerShape(12.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = Color(preset.backgroundColor)),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "C7 - F",
                color = Color(preset.chordColor),
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = preset.title,
                color = Color(preset.textColor),
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}
