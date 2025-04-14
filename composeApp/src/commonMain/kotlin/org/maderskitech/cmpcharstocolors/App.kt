package org.maderskitech.cmpcharstocolors

import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.ColorGridScreen

@Composable
@Preview
fun App() {
    MaterialTheme {
        ColorGridScreen(
            modifier = Modifier
                .safeDrawingPadding()
        )
    }
}