package com.example.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.viewmodel.MetronomeState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MetronomeBottomSheet(
    state: MetronomeState,
    onTogglePlay: () -> Unit,
    onBpmChanged: (Int) -> Unit,
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
                .padding(bottom = 36.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Metrónomo para Cantos",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Beat indicators
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
                for (i in 0 until state.beatsPerMeasure) {
                    val isActive = state.isPlaying && state.beat == i
                    val isFirstBeat = i == 0
                    val scale by animateFloatAsState(
                        targetValue = if (isActive) 1.35f else 1.0f,
                        animationSpec = tween(durationMillis = 100),
                        label = "beatScale"
                    )

                    val color = when {
                        isActive && isFirstBeat -> MaterialTheme.colorScheme.primary
                        isActive -> MaterialTheme.colorScheme.tertiary
                        else -> MaterialTheme.colorScheme.surfaceVariant
                    }

                    Box(
                        modifier = Modifier
                            .scale(scale)
                            .size(if (isFirstBeat) 28.dp else 22.dp)
                            .clip(CircleShape)
                            .background(color)
                    )
                }
            }

            // BPM display
            Surface(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth(0.6f)
            ) {
                Column(
                    modifier = Modifier.padding(vertical = 12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "${state.bpm}",
                        fontSize = 38.sp,
                        fontWeight = FontWeight.Black,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Text(
                        text = "BPM (Pulsos por minuto)",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // BPM Slider and Stepper
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FilledIconButton(
                    onClick = { onBpmChanged(state.bpm - 2) },
                    modifier = Modifier.size(44.dp)
                ) {
                    Icon(imageVector = Icons.Default.Remove, contentDescription = "Reducir tempo")
                }

                Slider(
                    value = state.bpm.toFloat(),
                    onValueChange = { onBpmChanged(it.toInt()) },
                    valueRange = 40f..200f,
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 12.dp)
                        .testTag("metronome_bpm_slider")
                )

                FilledIconButton(
                    onClick = { onBpmChanged(state.bpm + 2) },
                    modifier = Modifier.size(44.dp)
                ) {
                    Icon(imageVector = Icons.Default.Add, contentDescription = "Aumentar tempo")
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Play/Pause button
            Button(
                onClick = onTogglePlay,
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(52.dp)
                    .testTag("metronome_play_button"),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (state.isPlaying) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
                ),
                shape = RoundedCornerShape(26.dp)
            ) {
                Icon(
                    imageVector = if (state.isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = if (state.isPlaying) "DETENER" else "INICIAR RITMO",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}
