package com.example.ejercicios_jetpack_compose


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Ejercicio_01() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = Modifier.weight(1f).background(Color.Cyan).fillMaxHeight(),
                contentAlignment = Alignment.Center)
            {
                Text(
                    "Ejemplo 1"
                )
            }
        }
        Row (Modifier.fillMaxWidth().weight(1f)){
            Box(modifier = Modifier.weight(1f).background(Color.Red).fillMaxHeight(),
                contentAlignment = Alignment.Center)
            {
                Text(
                    "Ejemplo 2"
                )
            }
            Box(modifier = Modifier.weight(1f).background(Color.Green).fillMaxHeight(),
                contentAlignment = Alignment.Center)
            {
                Text(
                    "Ejemplo 3"
                )
            }
        }
        Row(Modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = Modifier.weight(1f).background(Color.Magenta).fillMaxHeight(),
                contentAlignment = Alignment.BottomCenter)
            {
                Text(
                    "Ejemplo 4"
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyPreviewLayouts() {
    Ejercicio_01()
}