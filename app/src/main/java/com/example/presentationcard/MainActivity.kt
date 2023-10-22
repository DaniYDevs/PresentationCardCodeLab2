package com.example.presentationcard

import android.app.Presentation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = Color(0xd2e8d4)
                ) {
                    PresentationText(name = "Daniel Díaz",
                        subp = "Android Developer Extraordinaire",
                        phone = "+34 601101010",
                        share = "DaniYDevs",
                        email = "danidzm18@gmail.com"
                    )
                    //GreetingImage(message = "Good Night", from = "Hola")
                }
            }
        }
    }
}

@Composable
fun PresentationText(name: String, subp: String, phone: String,
                     share: String, email: String, modifier: Modifier = Modifier) {
    Box(contentAlignment = Alignment.Center,
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFD2E8D4))) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier.background(Color(0xd2e8d4))
        ) {
            Text(
                text = name,
                fontSize = 55.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light
            )
            Text(
                text = subp,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1e7b4c),
                modifier = Modifier
                    .padding(top = 16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }
    Box(contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xd2e8d4))) {
        Column() {
            Text(
                text = phone,
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                //fontWeight = FontWeight.Light,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(alignment = Alignment.Start)
            )
            Text(
                text = share,
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                //fontWeight = FontWeight.Light,
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(alignment = Alignment.Start)
            )
            Text(
                text = email,
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                //fontWeight = FontWeight.Light,
                modifier = Modifier

                    .padding(bottom = 76.dp)
                    .align(alignment = Alignment.Start)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    PresentationCardTheme() {
        //Greeting("Daniel")
        PresentationText(name = "Daniel Díaz",
            subp = "Android Developer Extraordinaire",
            phone = "+34 601101010",
            share = "DaniYDevs",
            email = "danidzm18@gmail.com"
        )
        //GreetingImage(message = "Good Night", from = "Hola")
    }
}