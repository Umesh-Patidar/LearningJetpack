package com.umesh.learningjetpack.view.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TutorialBasic() {
    TutorialBasicContent()
}

@Composable
private fun TutorialBasicContent() {
    LazyColumn(Modifier.fillMaxSize()) {
        item {
            val modifierRow = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .background(Color.LightGray)

            TutorialHeader(text = "Row")
            TutorialSubHeader(text = "Arrangement.Start")

            Row(horizontalArrangement = Arrangement.Start, modifier = modifierRow) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.Center")

            Row(horizontalArrangement = Arrangement.Center, modifier = modifierRow) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.End")

            Row(horizontalArrangement = Arrangement.End, modifier = modifierRow) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceEvenly")

            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = modifierRow) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceAround")

            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = modifierRow) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceBetween")

            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = modifierRow) {
                ItemTexts()
            }

            val modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.LightGray)

            TutorialHeader(text = "Column")
            TutorialSubHeader(text = "Arrangement.Top")
            Column(verticalArrangement = Arrangement.Top, modifier = modifier) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.Center")
            Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.Bottom")
            Column(verticalArrangement = Arrangement.Bottom, modifier = modifier) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceAround")
            Column(verticalArrangement = Arrangement.SpaceAround, modifier = modifier) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceEvenly")
            Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = modifier) {
                ItemTexts()
            }

            TutorialSubHeader(text = "Arrangement.SpaceBetween")
            Column(verticalArrangement = Arrangement.SpaceBetween, modifier = modifier) {
                ItemTexts()
            }

            TutorialHeader(text = "Column")
        }
    }
}

@Composable
private fun ItemTexts() {
    Text(
        text = "Item1", modifier = Modifier
            .background(color = Color.Green)
            .padding(10.dp)
    )
    Text(
        text = "Item2", modifier = Modifier
            .background(color = Color.Cyan)
            .padding(10.dp)
    )
    Text(
        text = "Item3", modifier = Modifier
            .background(color = Color.Magenta)
            .padding(10.dp)
    )
}

@Composable
private fun TutorialHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .wrapContentWidth()
            .padding(10.dp),
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
}

@Composable
private fun TutorialSubHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .wrapContentWidth()
            .padding(10.dp),
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 15.sp
    )
}


@Preview(showBackground = true, device = Devices.PIXEL_2)
@Composable
private fun PreviewBasic() {
    TutorialBasic()
}