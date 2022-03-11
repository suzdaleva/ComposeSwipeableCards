package com.manicpixie.composeswipeablecards.presentation


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.manicpixie.composeswipeablecards.presentation.Constants.cornerRadiusBig
import com.manicpixie.composeswipeablecards.presentation.Constants.normalElevation
import com.manicpixie.composeswipeablecards.ui.theme.PrimaryBlack
import com.manicpixie.composeswipeablecards.ui.theme.urbanistFont


@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    cardIndex: Int,
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(cornerRadiusBig),
        elevation = normalElevation
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = cardIndex.toString(),
                style = TextStyle(
                    fontFamily = urbanistFont,
                    fontWeight = FontWeight.Medium,
                    color = PrimaryBlack,
                    fontSize = 40.sp
                ),

                )
        }

    }
}