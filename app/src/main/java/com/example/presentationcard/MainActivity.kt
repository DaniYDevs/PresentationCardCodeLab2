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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
                    color = Color(0xd2e8d4)
                ) {
                    Presentation(name = getString(R.string.presentation_name),
                        subp = getString(R.string.presentation_subtitle),
                        phone = getString(R.string.presentation_phone),
                        share = getString(R.string.presentation_share),
                        email = getString(R.string.presentation_email)                    )
                }
            }
        }
    }
}

@Composable
fun Presentation(name: String, subp: String, phone: String,
                     share: String, email: String, modifier: Modifier = Modifier) {
    val logo = painterResource(R.drawable.android_logo)
    val phonei = painterResource(R.drawable.baseline_local_phone_24)
    val sharei = painterResource(R.drawable.baseline_share_24)
    val emaili = painterResource(R.drawable.baseline_email_24)
    Box(contentAlignment = Alignment.Center,
    modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFD2E8D4))) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            //modifier = modifier.background(Color(0xd2e8d4))
        ) {
            Box(contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(150.dp, 150.dp)
                    .background(Color(0xFF073042))) {
                Image(
                    painter = logo,
                    contentDescription = null,
                    //contentScale = ContentScale.Crop,
                    //alpha = 0.5F
                    modifier = Modifier.size(130.dp)
                )
            }
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
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.size(230.dp, 150.dp)) {
            Box(contentAlignment = Alignment.CenterStart) {
                Column() {
                    Image(
                        painter = phonei,
                        contentDescription = null,
                        //contentScale = ContentScale.Crop,
                        //alpha = 0.5F
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 16.dp)
                    )
                    Image(
                        painter = sharei,
                        contentDescription = null,
                        //contentScale = ContentScale.Crop,
                        //alpha = 0.5F
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 16.dp)
                    )
                    Image(
                        painter = emaili,
                        contentDescription = null,
                        //contentScale = ContentScale.Crop,
                        //alpha = 0.5F
                        modifier = Modifier
                            .size(40.dp)
                            .padding(bottom = 16.dp)
                    )
                }
            }

            Box(contentAlignment = Alignment.BottomCenter) {
                Column(verticalArrangement = Arrangement.Bottom) {
                    Text(
                        text = phone,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        //fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(bottom = 20.dp)
                        //.align(alignment = Alignment.Start)
                    )
                    Text(
                        text = share,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        //fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(bottom = 17.dp)
                        //.align(alignment = Alignment.Start)
                    )
                    Text(
                        text = email,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(bottom = 46.dp)
                        //.align(alignment = Alignment.Start)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    PresentationCardTheme() {
        Presentation(name = stringResource(R.string.presentation_name),
            subp = stringResource(R.string.presentation_subtitle),
            phone = stringResource(R.string.presentation_phone),
            share = stringResource(R.string.presentation_share),
            email = stringResource(R.string.presentation_email))
    }
}