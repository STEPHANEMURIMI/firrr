package com.example.shoplenty.ui.theme.screens



import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.shoplenty.R
import com.example.shoplenty.navigation.LOGIN_URL
import com.example.shoplenty.ui.theme.WazitoECommerceTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController:NavHostController) {
    Column(modifier = Modifier

        .fillMaxSize()

        .paint(
            painterResource(id = R.drawable.bannn),
            contentScale = ContentScale.FillBounds
        )
        , horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ) {
        val coroutine = rememberCoroutineScope()

        coroutine.launch {
            delay(5000)
            navController.navigate(LOGIN_URL)

        }



        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row {
                Image(painter = painterResource(id = R.drawable.img) ,
                    contentDescription = "",



                    )
                Text(
                    text = "ShoPlenty",
                    fontSize = 40.sp,
                    fontFamily = FontFamily.Cursive,

                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold


                )

            }
        }

        Text(
            text = " UNLOCKING INFINATE POSSIBILITIES",
            fontSize = 20.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Cursive
            , fontWeight = FontWeight.ExtraBold


        )

    }



}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    WazitoECommerceTheme {
        SplashScreen(navController = rememberNavController())
    }
}
