package com.example.calculator_app.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator_app.ComplexComponents.CompoudRow_1
import com.example.calculator_app.ComplexComponents.FunctionRow
import com.example.calculator_app.ComplexComponents.TopRow

@Preview
@Composable
fun MainScreen(){
    Box (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)){
        Column {
            Box(modifier = Modifier
                .background(color = Color.Black)
                .fillMaxWidth()
                .height(300.dp)
            ){}
            Spacer(modifier = Modifier.height(10.dp))
            Box(modifier = Modifier
                .background(color = Color.Black)){
                Column {
                    TopRow()
                    Spacer(modifier = Modifier.height(15.dp))
                    FunctionRow()
                    Spacer(modifier = Modifier.height(10.dp))
                    CompoudRow_1()
//                    Row (
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(start = 10.dp, end = 100.dp)
//                    ) {
//                        SquareButton()
//                        SquareButton()
//                        SquareButton()
//                    }
//                    Spacer(modifier = Modifier.height(10.dp))
//                    Row (
//                        verticalAlignment = Alignment.CenterVertically,
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(start = 10.dp, end = 100.dp)
//                    ) {
//                        SquareButton()
//                        SquareButton()
//                        SquareButton()
//                    }
                }
            }
        }

    }
}