package com.umesh.learningjetpack.common.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TutorialHeader(text: String, modifier: Modifier = Modifier) {
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
fun TutorialSubHeader(text: String, modifier: Modifier = Modifier) {
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

@Composable
fun FullWidthRow(
    modifier: Modifier = Modifier,
    horizontal: Arrangement.Horizontal = Arrangement.Start,
    vertical: Alignment.Vertical = Alignment.Top,
    content: @Composable () -> Unit
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = horizontal,
        verticalAlignment = vertical
    ) {
        content()
    }
}