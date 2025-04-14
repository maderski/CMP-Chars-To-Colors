package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import org.koin.compose.KoinContext
import org.koin.compose.viewmodel.koinViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables.ColorGridComposable
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables.MultiLineTextInput
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables.clearFocusOnClickOutside

@Composable
fun ColorGridScreen(modifier: Modifier = Modifier) {
    KoinContext {
        val viewModel = koinViewModel<ColorGridViewModel>()

        var text by remember { mutableStateOf("") }
        var colorList = viewModel.getColorList(text, 5)
        var numOfColumnsText by remember { mutableStateOf("3") }

        Column(
            modifier = modifier
                .padding(16.dp)
                .clearFocusOnClickOutside()
        ) {
            MultiLineTextInput(
                text = text,
                labelText = "Message to change to colors",
                maxLines = 5,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                onTextChange = { text = it }
            )
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = numOfColumnsText,
                onValueChange = { numOfColumnsText = if (it == "0") "" else it },
                label = { Text("Column #") },
                maxLines = 1,
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                modifier = Modifier.width(120.dp)
            )

            val numOfColumns = numOfColumnsText.toIntOrNull() ?: 0
            if (numOfColumns <= 0) {
                Text(text = "Column number cannot be zero!", color = Color.Red)
            } else {
                Spacer(modifier = Modifier.height(16.dp))
                ColorGridComposable(numOfColumns, colorList)
            }
        }
    }
}