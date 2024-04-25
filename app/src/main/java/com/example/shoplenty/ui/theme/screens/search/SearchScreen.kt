package com.example.shoplenty.ui.theme.screens.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shoplenty.R
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavHostController) {
    Column (
        modifier = Modifier.fillMaxSize()
    )
    {
        val mContext = LocalContext.current


//Topappbar
        TopAppBar(
            title = {

                 },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = {

                }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Menu",
                        tint = Color.White
                    )
                }

            }
            , actions = {

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Menu",
                        tint = Color.White )


                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Menu",
                        tint = Color.White )


                }

            }


        )

//end topbar
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center


        ){
            Image(painter = painterResource(id = R.drawable.bann),
                contentDescription ="" ,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )






        }
        //end box
        Spacer(modifier = Modifier.height(10.dp))
        var search by remember { mutableStateOf("")}

        OutlinedTextField(
            value = search ,
            onValueChange ={search = it},
            placeholder = {  },
            leadingIcon = { Image(imageVector = Icons.Default.Search, contentDescription = "")},
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp)
                .fillMaxWidth()

        )
//end of search bar
        Spacer(modifier = Modifier.height(10.dp))



        Spacer(modifier = Modifier.height(10.dp))
        Row (
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ){
            //card one
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)




            ) {

                Column() {

                    Box (modifier = Modifier
                        .height(210.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center

                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.african),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop

                        )

                    }


                }

            }
//end card one

            Spacer(modifier = Modifier.width(8.dp))

            //card one
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)




            ) {

                Column() {

                    Box (modifier = Modifier
                        .height(210.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center

                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.african),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop

                        )

                    }


                }

            }
//end card one

            Spacer(modifier = Modifier.width(8.dp))

            //card one
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)




            ) {

                Column() {

                    Box (modifier = Modifier
                        .height(210.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center

                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.african),
                            contentDescription = "",
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.Crop

                        )

                    }




                }

            }
//end card one

            Spacer(modifier = Modifier.width(8.dp))

            //card one
            Card(modifier = Modifier
                .width(200.dp)
                .height(200.dp)




            ) {

                Column() {

                    Box (modifier = Modifier
                        .height(210.dp)
                        .fillMaxWidth(),
                        contentAlignment = Alignment.Center

                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.african),
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop

                        )

                    }


                }

            }
//end card one

            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {


            },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
                , modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)

            ) {



            }

        }
    }


}
@Composable
@Preview(showBackground = true)
fun SearchScreenPreview(){

}