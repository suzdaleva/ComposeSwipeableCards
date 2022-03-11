package com.manicpixie.composeswipeablecards.presentation


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ExperimentalMotionApi

@OptIn(ExperimentalMotionApi::class)
@Composable
fun CardScreen() {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ) {

        CardDeck(dataSource = (0..1999).map { 0 }.toList())
    }
}