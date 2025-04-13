package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.compose.runtime.Composable
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables.ColorGridComposable

@Composable
fun ColorGridScreen() {
    KoinContext {
        val viewModel = koinViewModel<ColorGridViewModel>()
        val colorList = viewModel.getColorList("Hello World!", 5)
        ColorGridComposable(5, colorList)
    }
}