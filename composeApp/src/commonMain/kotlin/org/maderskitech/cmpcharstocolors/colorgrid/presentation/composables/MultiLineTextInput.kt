package org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MultiLineTextInput(
    text: String,
    labelText: String,
    maxLines: Int,
    modifier: Modifier,
    onTextChange: (String) -> Unit
) {
    OutlinedTextField(
        value = text,
        onValueChange = onTextChange,
        modifier = modifier,
        label = { Text(labelText) },
        maxLines = maxLines
    )
}