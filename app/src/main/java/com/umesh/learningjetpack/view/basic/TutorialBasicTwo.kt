package com.umesh.learningjetpack.view.basic

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.umesh.learningjetpack.common.component.TutorialHeader
import com.umesh.learningjetpack.common.component.TutorialSubHeader

@Preview
@Composable
fun TutorialBasicTwo() {
    TutorialBasicContent()
}

@Composable
private fun TutorialBasicContent() {
    LazyColumn {
        item {
            val context = LocalContext.current
            val modifier = Modifier
            TutorialHeader(text = "Modifier")

            TutorialSubHeader(text = "Fill Max width")
            Column(modifier = modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
                .height(100.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextSet()
            }

            TutorialSubHeader(text = "Height")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .height(100.dp)) {
                TextSet()
            }

            TutorialSubHeader(text = "Width")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .width(100.dp)) {
                TextSet()
            }

            TutorialSubHeader(text = "Background")

            Column(modifier = modifier.background(MaterialTheme.colorScheme.primary)) {
                TextSet()
            }

            TutorialSubHeader(text = "Background Shape")
            Column(modifier = modifier.background(MaterialTheme.colorScheme.primary, shape = CircleShape)) {
                TextSet()
            }

            TutorialSubHeader(text = "Padding")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(25.dp)) {
                TextSet()
            }

            TutorialSubHeader(text = "Padding Type")
            val sizeModifier = modifier
                .background(MaterialTheme.colorScheme.primary)
            Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
                Column(modifier = sizeModifier.padding(start = 20.dp)) {
                    TextValue(text = "Start")
                }
                Spacer(Modifier.width(5.dp))
                Column(modifier = sizeModifier.padding(top = 20.dp)) {
                    TextValue(text = "Top")
                }
                Spacer(Modifier.width(5.dp))
                Column(modifier = sizeModifier.padding(end = 20.dp)) {
                    TextValue(text = "End")
                }
                Spacer(Modifier.width(5.dp))
                Column(modifier = sizeModifier.padding(bottom = 20.dp)) {
                    TextValue(text = "Bottom")
                }
            }

            TutorialSubHeader(text = "Border after padding")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .padding(25.dp)
                .border(border = BorderStroke(width = 2.dp, color = Color.Green))) {
                TextSet()
            }

            TutorialSubHeader(text = "Border before padding")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .border(border = BorderStroke(width = 2.dp, color = Color.Green))
                .padding(25.dp)
            ) {
                TextSet()
            }

            TutorialSubHeader(text = "Click Event")
            Column(modifier = modifier
                .background(MaterialTheme.colorScheme.primary)
                .border(border = BorderStroke(width = 2.dp, color = Color.Green))
                .padding(25.dp)
                .clickable {
                    context.showToast(text = "Click")
                }
            ) {
                TextSet()
            }
        }
    }
}

@Composable
private fun TextSet() {
    Text(text = "Hello", color = Color.White)
    Text(text = "World", color = Color.White)
}

@Composable
private fun TextValue(text: String) {
    Text(text = text, color = Color.White)
}

fun Context.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}