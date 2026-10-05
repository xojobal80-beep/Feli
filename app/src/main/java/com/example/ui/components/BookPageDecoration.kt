package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BookPageBackground(
    bgColor: Color,
    isDark: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(bgColor)
    ) {
        content()

        // Subtle left book-spine shadow
        val shadowColor = if (isDark) Color.Black.copy(alpha = 0.35f) else Color(0xFF4A3B2C).copy(alpha = 0.08f)
        Box(
            modifier = Modifier
                .align(Alignment.CenterStart)
                .width(16.dp)
                .fillMaxHeight()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(shadowColor, Color.Transparent)
                    )
                )
        )

        // Subtle right page edge reflection
        val rightEdgeColor = if (isDark) Color.Black.copy(alpha = 0.25f) else Color(0xFF4A3B2C).copy(alpha = 0.04f)
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .width(10.dp)
                .fillMaxHeight()
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(Color.Transparent, rightEdgeColor)
                    )
                )
        )
    }
}
