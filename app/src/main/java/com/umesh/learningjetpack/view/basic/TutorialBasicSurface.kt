package com.umesh.learningjetpack.view.basic

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.umesh.learningjetpack.common.component.TutorialHeader

@Composable
fun TutorialBasicSurface() {
    TutorialContent()
}

@Composable
private fun TutorialContent() {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        item {
            TutorialHeader(text = "Clickable")
            ClickableModifierExample()
            TutorialHeader(text = "Surface")
            SurfaceShapeExample()
            TutorialHeader(text = "Surface with Z Index")
            SurfaceZIndexExample()
            TutorialHeader(text = "Surface content image color")
            SurfaceContentColorExample()
            TutorialHeader(text = "Surface click propagation")
            SurfaceClickPropagationExample()
        }
    }
}

@Composable
fun SurfaceClickPropagationExample() {
    val context = LocalContext.current
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .clickable {
            context.showToastMessage("Box Clicked")
        }) {

        Surface(
            shadowElevation = 10.dp,
            shape = RoundedCornerShape(10.dp),
            color = (Color(0xFFFDD835)),
            modifier = Modifier
                .size(150.dp)
                .padding(12.dp)
                .clickable(onClick = {
                    context.showToastMessage("Surface(Left) inside Box is clicked!")
                })
        ) {
            Surface(
                shape = CircleShape,
                modifier = Modifier
                    .size(80.dp)
                    .offset(x = 50.dp, y = (-20).dp)
                    .clickable {
                        context.showToastMessage("Surface inside surface clicked")
                    },
                shadowElevation = 12.dp,
                color = Color(0xFF26C6DA)
            ) {}
        }

        Surface(
            shape = CutCornerShape(10.dp),
            modifier = Modifier
                .size(110.dp)
                .padding(12.dp)
                .offset(x = 110.dp, y = 20.dp)
                .clickable(onClick = {
                    context.showToastMessage("Surface(Right) inside Box is clicked!")
                }),
            color = (Color(0xFFF4511E)),
            shadowElevation = 8.dp
        ) {}
    }
}

@Composable
fun SurfaceContentColorExample() {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = RoundedCornerShape(10.dp),
        color = Color.Yellow,
        contentColor = Color.Black
    ) {
        Text(
            text = "Text inside Surface uses Surface's content color as a default color.",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun SurfaceZIndexExample() {
    Row {
        val modifier = Modifier
            .aspectRatio(1f)
            .weight(1f)
            .padding(10.dp)
        Surface(
            modifier = modifier,
            shape = RectangleShape,
            color = Color.Black,
            border = BorderStroke(5.dp, color = Color.Yellow),
            shadowElevation = 5.dp
        ) {}
        Surface(
            modifier = modifier,
            shape = RoundedCornerShape(8.dp),
            color = Color.Blue,
            border = BorderStroke(5.dp, color = Color.Green),
            shadowElevation = 8.dp
        ) {}
        Surface(
            modifier = modifier,
            shape = CircleShape,
            color = Color.Yellow,
            border = BorderStroke(5.dp, color = Color.Black),
            shadowElevation = 11.dp
        ) {}
        Surface(
            modifier = modifier,
            shape = CutCornerShape(topEndPercent = 20),
            color = Color.White,
            border = BorderStroke(5.dp, color = Color.Black),
            shadowElevation = 15.dp
        ) {}
    }
}

@Composable
fun SurfaceShapeExample() {
    Row {
        val modifier = Modifier
            .aspectRatio(1f)
            .padding(10.dp)
            .weight(1f)
        Surface(
            shape = RectangleShape,
            modifier = modifier,
            color = Color.Green
        ) {}

        Surface(
            shape = RoundedCornerShape(8.dp),
            modifier = modifier,
            color = Color.Blue
        ) {}

        Surface(
            shape = CircleShape,
            modifier = modifier,
            color = Color.Blue
        ) {}

        Surface(
            shape = CutCornerShape(10.dp),
            modifier = modifier,
            color = Color.Blue
        ) {}
    }
}

@Composable
fun ClickableModifierExample() {
    val context = LocalContext.current
    Row(modifier = Modifier.height(120.dp)) {
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Blue)
                .clickable {
                    context.showToastMessage("Clicked me")
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "Click Me"
            )
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color.Green)
                .clickable {
                    context.showToastMessage("Clicked me")
                },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                text = "Click Me"
            )
        }
    }
}

fun Context.showToastMessage(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}
