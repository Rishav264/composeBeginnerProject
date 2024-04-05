package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    composeArticleApp()
                }
            }
        }
    }
}

@Composable
fun composeArticleApp(){
    composeArticleImage(
        title = "Jetpack Compose tutorial" ,
        shortDiscription ="Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." ,
        longDistription ="In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name." ,
        imagePainter = painterResource(R.drawable.compose_article),
        modifier = Modifier
    )
}

@Composable
fun composeArticleImage(
     title: String,
     shortDiscription :String,
     longDistription :String,
     imagePainter: Painter,
     modifier: Modifier
){
    Column(modifier=modifier) {
        androidx.compose.foundation.Image(painter =imagePainter, contentDescription =null )
        Text(
            text = title,
            modifier=modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDiscription,
            modifier=modifier.padding(start = 16.dp,end=16.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = longDistription,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun composeArticleAppPreview() {
    ComposeArticleTheme {
        composeArticleApp()
    }
}