package dev.dkeyes.soundboardmore

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SoundBoardMoreTheme(content: @Composable () -> Unit) {
    val myColorScheme = ColorScheme(
        primary = Color(0xFF007AFF),
        secondary = Color(0xFFFFCC00),
        onPrimary = Color.White,
        onSecondary = Color.Black,
        onBackground = Color.Black,
        onSurface = Color.Black,
        surface = Color.White,
        error = Color.Red,
        onError = Color.White,
        primaryContainer = Color(0xFF007AFF).copy(alpha = 0.12f),
        onPrimaryContainer = Color(0xFF007AFF),
        inversePrimary = Color(0xFF007AFF).copy(alpha = 0.6f),
        inverseOnSurface = Color.Black,
        inverseSurface = Color.White,
        secondaryContainer = Color(0xFFFFCC00).copy(alpha = 0.12f),
        onSecondaryContainer = Color(0xFFFFCC00),
        surfaceVariant = Color.Gray.copy(alpha = 0.12f),
        onSurfaceVariant = Color.Black.copy(alpha = 0.6f),
        outline = Color.Gray.copy(alpha = 0.6f)

    )
    MaterialTheme(
        colorScheme = myColorScheme,
        typography = MaterialTheme.typography,
        shapes = MaterialTheme.shapes,
        content = content
    )
}