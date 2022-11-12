package com.anish.jetpackcomposecurtaineffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.anish.jetpackcomposecurtaineffect.ui.theme.JetpackComposeCurtainEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCurtainEffectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CurtainEffect()
                }
            }
        }
    }
}


@Composable
fun CurtainEffect() {

    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Curtain(
            foldingDuration = 400,
            mainCell = {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    backgroundColor = Color.DarkGray,
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth().padding(16.dp)
                    ) {
                        Text(text = "This is the main cell!", color = Color.White)
                    }
                }
            },
            foldCells = listOf(
                {
                    Card(
                        modifier = Modifier.fillMaxWidth().height(128.dp),
                        backgroundColor = Color.DarkGray,
                        shape = RectangleShape
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        ) {
                            Text(text = "This is the first folded cell!", color = Color.White)
                        }
                    }
                },
                {
                    Card(
                        modifier = Modifier.fillMaxWidth().height(128.dp),
                        backgroundColor = Color.DarkGray,
                        shape = RectangleShape
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        ) {
                            Text(text = "This is the second folded cell!", color = Color.White)
                        }
                    }
                },
                {
                    Card(
                        modifier = Modifier.fillMaxWidth().height(128.dp),
                        backgroundColor = Color.DarkGray,
                        shape = RectangleShape
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(16.dp)
                        ) {
                            Text(text = "This is the third folded cell!", color = Color.White)
                        }
                    }
                }
            )
        )
    }
}
