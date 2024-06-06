package com.example.sharedtransition

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.font.FontWeight.Companion.W600
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ListScreen(onItemClick: (Int, String, String) -> Unit) {
    val allImage = listOf(
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_,
        R.drawable.a80_
    )

    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(50.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        itemsIndexed(allImage) { index, resId ->
            val text = "Image $index"
            val desp =
                "lorem is simply dummy text of the printing and typesetting industry." +
                        "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                        "It has survived not only five centuries, but also the leap into electronic typesetting," +
                        " remaining essentially unchanged." +
                        " It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                        "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. "

            AllItemList(onItemClick = onItemClick, resId, text, desp)
        }
    }
}

@Composable
fun AllItemList(
    onItemClick: (Int, String, String) -> Unit,
    resId: Int,
    text: String,
    desp: String
) {
    Row(
        Modifier
            .fillMaxWidth()
            .clickable { onItemClick(resId, text, desp) }) {
        Image(
            painter = painterResource(id = resId),
            contentDescription = "Image",
            modifier = Modifier
                .aspectRatio(16 / 9f)
                .weight(1f)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.weight(1f)) {

            Text(
                text = text, fontSize = 26.sp, fontWeight = W600,
                modifier = Modifier
            )
            Text(
                text = desp, fontSize = 20.sp, fontWeight = W300, maxLines = 2,
                modifier = Modifier
            )

        }
    }
}























