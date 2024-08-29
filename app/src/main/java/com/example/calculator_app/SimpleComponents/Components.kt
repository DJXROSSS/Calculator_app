package com.example.calculator_app.SimpleComponents

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopButton(){
    Button(modifier = Modifier
        .width(80.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF303136)
        ),
        onClick = { /*TODO*/ }) {
    }
}

@Composable
fun SquareButton(){
    Button(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier.size(80.dp).aspectRatio(1f)
    ) {}
}