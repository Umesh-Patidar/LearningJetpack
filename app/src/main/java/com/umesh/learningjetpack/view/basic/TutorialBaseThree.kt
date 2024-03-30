package com.umesh.learningjetpack.view.basic

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.umesh.learningjetpack.common.component.TutorialHeader

@Preview
@Composable
fun TutorialBasicThree() {
    TutorialBasicContent()
}

@Composable
private fun TutorialBasicContent() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(30.dp)
    ) {
        item {
            TutorialHeader(text = "Box")
            Spacer(Modifier.height(20.dp))
            BoxArea()
            Spacer(Modifier.height(20.dp))
            TutorialHeader(text = "Box with shadow")
            BoxWithShadow()
            TutorialHeader(text = "Box with alignment")
            BoxShadowAndAlignment()
        }
    }
}

@Composable
fun BoxWithShadow() {
    val modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .background(Color.LightGray)
        .padding(20.dp)
    Box(modifier = modifier) {
        Box(modifier = Modifier.shadow(elevation = 8.dp, shape = RoundedCornerShape(10.dp))) {
            Text(
                text = "First",
                modifier = Modifier
                    .background(Color(0xFFFFA000))
                    .size(200.dp)
                    .padding(20.dp),
                color = Color.White
            )
        }
        Box (modifier = Modifier.shadow(elevation = 8.dp, shape = RoundedCornerShape(10.dp)).align(Alignment.TopEnd)){
            Text(
                text = "Second",
                modifier = Modifier
                    .background(Color(0xFFFFC107))
                    .size(180.dp)
                    .padding(20.dp),
                color = Color.White
            )
        }
        Box (modifier = Modifier.shadow(elevation = 8.dp, shape = RoundedCornerShape(10.dp)).align(Alignment.TopEnd)){
            Text(
                text = "Third",
                modifier = Modifier
                    .background(Color(0xE8FFEB3B))
                    .size(100.dp)
                    .padding(20.dp),
                color = Color.White
            )
        }
    }
}

@Composable
fun BoxShadowAndAlignment() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.LightGray)
            .padding(8.dp)
    ) {

        Box(
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            Text(
                text = "First",
                modifier = Modifier
                    .background(Color(0xFFFFA000))
                    .size(200.dp),
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                )
                .align(Alignment.TopEnd)

        ) {
            // This is the one in the middle
            Text(
                text = "Second",
                modifier = Modifier
                    .background(Color(0xFFFFC107))
                    .size(150.dp),
                color = Color.White
            )
        }


        val modifier = Modifier
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp)
            )
            .align(Alignment.BottomStart)

        Box(
            modifier = modifier

        ) {
            // This is the one on top
            Text(
                text = "Third ",
                modifier = Modifier
                    .background(Color(0xFFFFD54F))
                    .size(100.dp),
                color = Color.White
            )
        }
    }
}

@Composable
fun BoxArea() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .height(300.dp)
    ) {

        Text(
            text = "1st",
            modifier = Modifier
                .background(Color.Red)
                .size(250.dp)
                .padding(top = 25.dp, end = 10.dp),
            color = Color.White,
            textAlign = TextAlign.Right
        )

        Text(
            text = "2nd",
            modifier = Modifier
                .background(Color.Blue)
                .size(200.dp)
                .padding(top = 25.dp, end = 10.dp),
            color = Color.White,
            textAlign = TextAlign.Right
        )

        Text(
            text = "3rd",
            modifier = Modifier
                .background(Color.Magenta)
                .size(150.dp)
                .padding(top = 25.dp, end = 10.dp),
            color = Color.White,
            textAlign = TextAlign.Right
        )
    }
}