package com.example.sharedtransition

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(
    resId: Int,
    text: String,
    desp: String,

    ) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(22.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = resId),
            contentDescription = "Image",
            modifier = Modifier
                .aspectRatio(16 / 9f)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = text,
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.W600,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = desp,
            fontSize = 20.sp,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.W300,
            modifier = Modifier.padding(horizontal = 8.dp)
        )


    }
}
