package com.focusbeat.nativeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "FocusBeat",
                            fontSize = 32.sp
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Focus better. Achieve more.",
                            fontSize = 16.sp
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        Button(onClick = {}) {
                            Text("Start Focusing")
                        }
                    }
                }
            }
        }
    }
}
