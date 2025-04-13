package org.maderskitech.cmpcharstocolors

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.ColorGridScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        ColorGridScreen()
    }
}