package com.example.tiptimecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipTimeScreen()
        }
    }
}

@Composable
fun TipTimeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

    }
    Text(
        text = stringResource(id = R.string.calculate_tip),
        fontSize = 24.sp
    )
    Spacer(modifier = Modifier.height(16.dp))
    EditNumberfield()
}

@Composable
fun EditNumberfield() {
    TextField(value = "", onValueChange = {})
}

@Preview(showBackground = true)
@Composable
fun Preview() {

}



































