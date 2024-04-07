package com.umesh.learningjetpack.view.widgets

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.umesh.learningjetpack.common.component.FullWidthRow
import com.umesh.learningjetpack.common.component.TutorialHeader
import com.umesh.learningjetpack.common.component.TutorialSubHeader

@Preview(showBackground = true)
@Composable
fun TutorialButtonScreen() {
    TutorialButtonContent()
}

@Composable
private fun TutorialButtonContent() {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        item {
            val modifier = Modifier.padding(5.dp)
            TutorialHeader(text = "Button")
            TutorialSubHeader(text = "Button with Shape")
            ButtonExample(modifier)
            TutorialSubHeader(text = "Disabled Button")
            DisableButtonExample(modifier)
            TutorialSubHeader(text = "Icon Button")
            ButtonWithIcon(modifier)
            TutorialSubHeader(text = "Button Background")
            ButtonWithBackgroundExample(modifier)
            TutorialSubHeader(text = "Gradient Button")
            GradientButtonExample(modifier)
            TutorialSubHeader(text = "Icon Button")
            IconButtonExample(modifier)
            TutorialSubHeader(text = "Custom Ripple with Icon Button")
            CustomIconButtonExample(modifier)

        }
    }
}

@Composable
fun CustomIconButtonExample(modifier: Modifier) {
    FullWidthRow(modifier = Modifier.padding(horizontal = 30.dp)) {
        Indicating
    }
}

@Composable
fun IconButtonExample(modifier: Modifier) {
    FullWidthRow {
        IconButton(
            onClick = {},
            modifier = modifier
        ) {
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = null)
        }

        var checked by remember {
            mutableStateOf(false)
        }

        IconToggleButton(
            checked = checked,
            onCheckedChange = {
                checked = it
            },
            modifier = modifier
        ) {
          val tint by animateColorAsState(
              targetValue = if (checked) Color(0xffE91E63) else Color(0xffB0BEC5),
              animationSpec = tween(durationMillis = 400), label = ""
          )
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = null, tint = tint )
        }
    }
}

@Composable
fun GradientButtonExample(modifier: Modifier) {
    val horizontalGradientBrush = Brush.horizontalGradient(
        colors = listOf(
            Color(0xffF57F17),
            Color(0xffFFEE58),
            Color(0xffFFF9C4)
        )
    )
    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xff4E342E),
            Color(0xff8D6E63),
            Color(0xffD7CCC8)
        )
    )
    FullWidthRow {
        Column(
            modifier = modifier
                .clip(RoundedCornerShape(20))
                .background(brush = horizontalGradientBrush)
                .clickable { }
                .then(modifier)
        ) {
            Text(text = "Horizontal Gradient")
        }
        Column(
            modifier = modifier
                .clip(RoundedCornerShape(20))
                .background(brush = verticalGradientBrush)
                .clickable { }
                .then(modifier)
        ) {
            Text(text = "Vertical Gradient")
        }
    }
}

@Composable
fun ButtonWithBackgroundExample(modifier: Modifier) {
    FullWidthRow {
        Button(
            onClick = {},
            modifier = modifier,
            colors = ButtonDefaults.run {
                buttonColors(
                    contentColor = Color(0xffB2EBF2),
                    containerColor = Color(0xffF57C00),
                )
            }) {
            Text(text = "Button")
        }

        TextButton(
            onClick = {},
            modifier = modifier,
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xff8BC34A)
            )
        ) {
            Text(text = "TextButton")
        }

        OutlinedButton(
            onClick = {},
            modifier = modifier,
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xff795548)
            )
        ) {
            Text(text = "Outlined")
        }
    }
}

@Composable
fun ButtonWithIcon(modifier: Modifier) {
    FullWidthRow {
        Button(
            onClick = {},
            shape = RoundedCornerShape(20),
            modifier = modifier
        ) {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                modifier = Modifier.padding(start = 4.dp),
                contentDescription = null
            )
        }
        Button(
            onClick = {},
            modifier = modifier
        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(text = "Icon+Text")
            }
        }
        Button(
            onClick = {},
            modifier = modifier
        ) {
            Text(text = "Text+Icon")
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                modifier = Modifier.padding(start = 4.dp),
                contentDescription = null
            )
        }
    }
    FullWidthRow {
        OutlinedButton(
            onClick = {}
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                modifier = Modifier.padding(start = 4.dp, end = 4.dp),
                contentDescription = null
            )
            Text(text = "Icon+Text+Icon")
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                modifier = Modifier.padding(start = 4.dp),
                contentDescription = null
            )
        }
    }
}

@Composable
fun DisableButtonExample(modifier: Modifier) {
    FullWidthRow {
        Button(
            onClick = {},
            modifier = modifier,
            enabled = false
        ) {
            Text(text = "Button")
        }

        TextButton(
            onClick = {},
            modifier = modifier,
            enabled = false
        ) {
            Text(text = "Text Button")
        }

        OutlinedButton(
            onClick = {},
            modifier = modifier,
            enabled = false
        ) {
            Text(text = "Outline Button")
        }
    }
}

@Composable
private fun ButtonExample(modifier: Modifier) {
    FullWidthRow {
        Button(onClick = { }, modifier = modifier) {
            Text(text = "Button")
        }
        TextButton(onClick = { }, modifier = modifier) {
            Text(text = "Text Button")
        }
        OutlinedButton(onClick = { }, modifier = modifier) {
            Text(text = "Outlined")
        }
    }

    FullWidthRow {
        Button(
            onClick = {},
            modifier = modifier,
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Rounded")
        }
        Button(
            onClick = {},
            modifier = modifier,
            shape = RoundedCornerShape(
                topStartPercent = 30,
                topEndPercent = 0,
                bottomStartPercent = 0,
                bottomEndPercent = 0
            )
        ) {
            Text(text = "Rounded")
        }

        Button(
            onClick = { },
            modifier = modifier,
            shape = CutCornerShape(20)
        ) {
            Text(text = "CutCorner")
        }
    }

}
