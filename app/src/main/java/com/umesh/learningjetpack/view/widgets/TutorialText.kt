package com.umesh.learningjetpack.view.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun TutorialTextScreen() {
    TutorialContent()
}

@Composable
fun TutorialContent() {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            TutorialTextHeader(text = "Text")

            TutorialTextSubHeading(text = "Font Color")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextColor(text = "Red", color = Color.Red)
                TutorialTextColor(text = "Black", color = Color.Black)
                TutorialTextColor(text = "Blue", color = Color.Blue)
                TutorialTextColor(text = "Cyan", color = Color.Cyan)
                TutorialTextColor(text = "Green", color = Color.Green)
                TutorialTextColor(text = "Magenta", color = Color.Magenta)
            }

            TutorialTextSubHeading(text = "Font Size")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextFont(text = "14sp", fontSize = 14.sp)
                TutorialTextFont(text = "18sp", fontSize = 18.sp)
                TutorialTextFont(text = "30sp", fontSize = 30.sp)
                TutorialTextFont(text = "40sp", fontSize = 40.sp)
            }

            TutorialTextSubHeading(text = "Font Style")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextFontStyle(text = "Italic", fontStyle = FontStyle.Italic)
                TutorialTextFontStyle(text = "Normal", fontStyle = FontStyle.Normal)
            }

            TutorialTextSubHeading(text = "Font Weight")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextFontWeight(text = "Thin", fontWeight = FontWeight.Thin)
                TutorialTextFontWeight(text = "Extra Light", fontWeight = FontWeight.ExtraLight)
                TutorialTextFontWeight(text = "Light", fontWeight = FontWeight.Light)
                TutorialTextFontWeight(text = "Normal", fontWeight = FontWeight.Normal)
                TutorialTextFontWeight(text = "Medium", fontWeight = FontWeight.Medium)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextFontWeight(text = "Semi Bold", fontWeight = FontWeight.SemiBold)
                TutorialTextFontWeight(text = "Bold", fontWeight = FontWeight.Bold)
                TutorialTextFontWeight(text = "Extra Bold", fontWeight = FontWeight.ExtraBold)
                TutorialTextFontWeight(text = "Black", fontWeight = FontWeight.Black)
            }

            TutorialTextSubHeading(text = "Font Family")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextFontFamily(text = "Default", fontFamily = FontFamily.Default)
                TutorialTextFontFamily(text = "Cursive", fontFamily = FontFamily.Cursive)
                TutorialTextFontFamily(text = "Monospace", fontFamily = FontFamily.Monospace)
                TutorialTextFontFamily(text = "Serif", fontFamily = FontFamily.Serif)
                TutorialTextFontFamily(text = "SansSerif", fontFamily = FontFamily.SansSerif)
            }

            TutorialTextSubHeading(text = "Letter Spacing")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextLetterSpacing(text = "0.4sp", letterSpacing = 0.4.sp)
                TutorialTextLetterSpacing(text = "1sp", letterSpacing = 1.sp)
                TutorialTextLetterSpacing(text = "4sp", letterSpacing = 4.sp)
                TutorialTextLetterSpacing(text = "8sp", letterSpacing = 8.sp)
            }

            TutorialTextSubHeading(text = "Text Decoration")

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextDecoration(text = "None", textDecoration = TextDecoration.None)
                TutorialTextDecoration(
                    text = "LineThrough",
                    textDecoration = TextDecoration.LineThrough
                )
                TutorialTextDecoration(
                    text = "Underline",
                    textDecoration = TextDecoration.Underline
                )
                TutorialTextDecoration(
                    text = "Combine", textDecoration = TextDecoration.combine(
                        listOf(
                            TextDecoration.Underline, TextDecoration.LineThrough
                        )
                    )
                )
            }


            TutorialTextSubHeading(text = "Text Align")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextAlign(text = "Start", textAlign = TextAlign.Start)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "Center", textAlign = TextAlign.Center)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "End", textAlign = TextAlign.End)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "Left", textAlign = TextAlign.Left)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "Right", textAlign = TextAlign.Right)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(
                    text = "Justify: Stretch lines of text that end with a soft line break to fill the width of the container.",
                    textAlign = TextAlign.Justify
                )
            }

            TutorialTextSubHeading(text = "Line Height")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextLineHeight(text = "This text has line height of 15 sp. Line height for the Paragraph in TextUnit unit, e.g. SP or EM.", lineHeight = 15.sp)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "This text has line height of 15 sp. Line height for the Paragraph in TextUnit unit, e.g. SP or EM.", textAlign = TextAlign.Center)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "End", textAlign = TextAlign.End)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "Left", textAlign = TextAlign.Left)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(text = "Right", textAlign = TextAlign.Right)
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextAlign(
                    text = "Justify: Stretch lines of text that end with a soft line break to fill the width of the container.",
                    textAlign = TextAlign.Justify
                )
            }

            TutorialTextSubHeading(text = "Text OverFlow")
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray),
            ) {
                TutorialTextOverFlow(
                    text = "Clip the overflowing text to fix its container. Clip the overflowing text to fix its container.",
                    textOverflow = TextOverflow.Clip
                )
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextOverFlow(
                    text = "Use an ellipsis to indicate that the text has overflowed. Use an ellipsis to indicate that the text has overflowed",
                    textOverflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                Divider(thickness = 1.dp, color = Color.Black)
                TutorialTextOverFlow(
                    text = "Display all text, even if there is not enough space in the specified bounds. When overflow is visible, text may be rendered outside the bounds of the composable displaying the text. This ensures that all text is displayed to the user, and is typically the right choice for most text display.",
                    textOverflow = TextOverflow.Visible,
                )
            }
        }
    }
}

@Composable
fun TutorialTextHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    )
}

@Composable
fun TutorialTextSubHeading(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        fontSize = 18.sp,
        fontWeight = FontWeight.Black
    )
}

@Composable
fun TutorialTextColor(text: String, color: Color) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 18.sp,
        color = color
    )
}

@Composable
fun TutorialTextFont(text: String, fontSize: TextUnit) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = fontSize,
    )
}

@Composable
fun TutorialTextFontStyle(text: String, fontStyle: FontStyle) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 18.sp,
        fontStyle = fontStyle,
    )
}

@Composable
fun TutorialTextFontWeight(text: String, fontWeight: FontWeight) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 18.sp,
        fontWeight = fontWeight
    )
}

@Composable
fun TutorialTextFontFamily(text: String, fontFamily: FontFamily) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 15.sp,
        fontFamily = fontFamily
    )
}

@Composable
fun TutorialTextLetterSpacing(text: String, letterSpacing: TextUnit) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 15.sp,
        letterSpacing = letterSpacing
    )
}

@Composable
fun TutorialTextDecoration(text: String, textDecoration: TextDecoration) {
    Text(
        text = text,
        modifier = Modifier
            .wrapContentWidth()
            .padding(10.dp),
        fontSize = 18.sp,
        textDecoration = textDecoration
    )
}

@Composable
fun TutorialTextAlign(text: String, textAlign: TextAlign) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        fontSize = 18.sp,
        textAlign = textAlign
    )
}

@Composable
fun TutorialTextLineHeight(text: String, lineHeight: TextUnit) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        fontSize = 18.sp,
        lineHeight = lineHeight
    )
}

@Composable
fun TutorialTextOverFlow(text: String, textOverflow: TextOverflow, maxLines: Int = Int.MAX_VALUE) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        fontSize = 18.sp,
        overflow = textOverflow,
        maxLines = maxLines
    )
}