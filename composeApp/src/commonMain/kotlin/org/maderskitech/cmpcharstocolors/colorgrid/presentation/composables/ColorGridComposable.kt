package org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import de.drick.compose.hotpreview.HotPreview

@Composable
fun ColorGridComposable(
    columnCount: Int,
    colorList: List<Color>
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(columnCount),
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items = colorList
        ) { color ->
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .aspectRatio(1f)
                    .background(color)
            )
        }
    }
}

@HotPreview(
    name = "phone light", group = "light", widthDp = 411, heightDp = 891,
    fontScale = 1.5f, density = 2.625f, darkMode = false
)
@Composable
fun ColorGridComposablePreview() {
    val colorList = listOf(
        -9926536,
        -6697581,
        -6501196,
        -6501196,
        -16013447,
        -6283040,
        -7090351,
        -16013447,
        -8748482,
        -6501196,
        -9140996,
        -3839625
    ).map { Color(it) }
    ColorGridComposable(5, colorList)
}