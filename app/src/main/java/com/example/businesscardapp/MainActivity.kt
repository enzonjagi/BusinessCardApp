package com.example.businesscardapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardPreview()
                }
            }
        }
    }
}

@SuppressLint("PrivateResource")
@Composable
fun TitleSection(modifier: Modifier = Modifier) {
    //val customPainter = painterResource(id = android.R.drawable.btn_dialog)
    val iconPainter = painterResource(id = androidx.core.R.drawable.ic_call_answer)
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Icon(
            painter = iconPainter,
            contentDescription = "null"
        )
        Text(
            text = "FULL NAME",
            modifier = modifier,
            fontSize = 48.sp
        )
        Text(
            text = "Title",
            modifier = modifier,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@SuppressLint("PrivateResource")
@Composable
fun ContactSection(modifier: Modifier = Modifier) {
    val iconPainter = painterResource(id = androidx.core.R.drawable.ic_call_answer)
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Icon(painter = iconPainter, contentDescription = null )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = stringResource(R.string.number))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Icon(painter = iconPainter, contentDescription = null )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = stringResource(R.string.socialmediahandle))
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            Icon(painter = iconPainter, contentDescription = null )
            Spacer(modifier = Modifier.width(20.dp))
            Text(text = stringResource(R.string.email))
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TitleSection(Modifier)
            Spacer(modifier = Modifier.height(200.dp))
            ContactSection(Modifier)
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}