package com.example.developersbreach.widgets


import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomSheetContent(){
    Surface(
        modifier = Modifier.height(300.dp),
        color = Color(0xff9c7ca5)
    ) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Modal Bottom Sheet", fontSize = 20.sp, modifier = Modifier.padding(10.dp),
            color = Color.White, fontWeight = FontWeight.ExtraBold)
            Divider(modifier = Modifier.padding(5.dp), color = Color.White)
            Text(text = "Modal Bottom sheets screen.",
                fontSize = 15.sp,
                fontStyle = FontStyle.Italic,
                color = Color.White,
            modifier = Modifier.padding(10.dp))
        }
    }
}

