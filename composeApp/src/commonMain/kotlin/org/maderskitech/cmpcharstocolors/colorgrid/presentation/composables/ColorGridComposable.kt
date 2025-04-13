package org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ColorGridComposable(
    columnCount: Int,
    colorIntList: List<Int>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(columnCount),
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = colorIntList
        ) { colorInt ->
            Box(
                modifier = Modifier
                    .aspectRatio(1f)
                    .background(Color(colorInt))
            )
        }
    }
}