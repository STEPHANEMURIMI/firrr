package com.example.shoplenty.ui.theme.screens.dashboard


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.shoplenty.R
import com.example.shoplenty.ui.theme.WazitoECommerceTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashScreen(navController:NavHostController) {
    Column (modifier = Modifier.fillMaxSize()


    ){
        val mContext = LocalContext.current


//Topappbar
        TopAppBar(
            title = { Text(text = "Find my shop",
                color = Color.Blue,
fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold
                ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {

                }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Menu",
                        tint = Color.Black
                    )
                }

            }
            , actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "share",
                        tint = Color.Black )


                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Menu",
                        tint = Color.Blue )


                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Menu",
                        tint = Color.Black )


                }

            }


        )

//end topbar
        Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {

            Column {
                Text(
                    text = "Shoplenty",
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif
                    , modifier = Modifier.clickable {   }
                )
                Text(
                    text = "Search for any shop",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif
                )
                Text(
                    text = "from A to Z",
                    fontSize = 15.sp,
                    fontFamily = FontFamily.Serif
                )
            }
            //Row ends
            Spacer(modifier = Modifier.width(70.dp))
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "amazon"
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row (  modifier = Modifier
            .height(70.dp)
            .padding(start = 10.dp, end = 10.dp)
            .horizontalScroll(rememberScrollState()),


            ){
Column {
    Box(
    ) {
        Image(painter = painterResource(id = R.drawable.ashera),
            contentDescription = "Monalisa",
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(50.dp),
            contentScale = ContentScale.Crop
        )


    }
    Text(text = "Clothing",
        fontSize = 15.sp

    )
}
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Box(
                ) {
                    Image(painter = painterResource(id = R.drawable.ashera),
                        contentDescription = "Monalisa",
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp),
                        contentScale = ContentScale.Crop
                    )


                }
                Text(text = "Clothing",
                    fontSize = 15.sp

                )
            }
            Spacer(modifier = Modifier.width(10.dp))


        }

Column(  modifier = Modifier
    .padding(start = 15.dp, top = 20.dp, end = 15.dp)
    .verticalScroll(rememberScrollState())) {

    Row {
        Card(modifier = Modifier.size(width = 150.dp, height = 200.dp)
        )
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource( id = R.drawable.img),
                        contentDescription = "errefg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                        contentScale = ContentScale.Crop,





                    )
                }
                Text(
                    text = "Clothing",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }
        Spacer(modifier = Modifier.width(25.dp))

        Card(
            modifier = Modifier
                .paint(painterResource(id = R.drawable.ban),
                    contentScale = ContentScale.FillBounds)
                .size(width = 150.dp, height = 200.dp),
        )
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "bg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                                contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Electronics",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }


    }


    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Card(modifier = Modifier.size(width = 150.dp, height = 200.dp)
        )
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource( id = R.drawable.img),
                        contentDescription = "errefg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                        contentScale = ContentScale.Crop,





                        )
                }
                Text(
                    text = "Clothing",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }
        Spacer(modifier = Modifier.width(25.dp))

        Card(modifier = Modifier

            .size(width = 150.dp, height = 200.dp),)
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "bg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Electronics",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }


    }


    Spacer(modifier = Modifier.height(20.dp))
    Row {
        Card(modifier = Modifier.size(width = 150.dp, height = 200.dp)
        )
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource( id = R.drawable.img),
                        contentDescription = "errefg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                        contentScale = ContentScale.Crop,





                        )
                }
                Text(
                    text = "Clothing",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }
        Spacer(modifier = Modifier.width(25.dp))

        Card(modifier = Modifier

            .size(width = 150.dp, height = 200.dp),)
        {
            Column {

                Box (modifier = Modifier.fillMaxWidth()){
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "bg",
                        modifier = Modifier
                            .padding(start = 25.dp)
                            .size(100.dp),
                        contentScale = ContentScale.Crop
                    )
                }
                Text(
                    text = "Electronics",
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth(),
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center

                )
            }
        }


    }


    Spacer(modifier = Modifier.height(20.dp))


}






    }
}

@Composable
@Preview(showBackground = true)
fun DashScreenPreview(){
    WazitoECommerceTheme {
     DashScreen(navController = rememberNavController())
    }
}
