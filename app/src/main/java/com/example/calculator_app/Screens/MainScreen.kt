package com.example.calculator_app.Screens

import android.widget.GridView
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculator_app.SquareButton
import com.example.calculator_app.TopButton

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
            ){
//pass
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(modifier = Modifier
                .background(color = Color.Black)){
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp)
                    ) {
                        TopButton()
                        TopButton()
                        TopButton()
                        TopButton()
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp)
                    ) {
                        SquareButton()
                        SquareButton()
                        SquareButton()
                        SquareButton() 
                    }
                }
            }
        }

    }
}