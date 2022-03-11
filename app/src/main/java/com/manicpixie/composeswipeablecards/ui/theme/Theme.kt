package com.manicpixie.composeswipeablecards.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = White,
    onPrimary = PrimaryBlack,
    secondary = Gray,


    )

private val LightColorPalette = lightColors(
    primary = White,
    onPrimary = PrimaryBlack,
    secondary = Gray

)

@Composable
fun ComposeSwipeableCardsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}