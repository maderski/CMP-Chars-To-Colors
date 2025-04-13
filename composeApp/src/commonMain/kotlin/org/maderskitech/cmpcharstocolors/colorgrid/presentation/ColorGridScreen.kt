package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ColorGridScreen() {
    KoinContext {
        val viewModel = koinViewModel<ColorGridViewModel>()
        val colorIntList = viewModel.getARGBList("Hello World!")
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(
                items = colorIntList,
            ) { colorInt ->
                Box(
                    modifier = Modifier
                        .width(16.dp)
                        .height(16.dp)
                        .background(Color(colorInt))
                )
            }
        }
    }
}