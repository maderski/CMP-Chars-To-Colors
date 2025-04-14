package org.maderskitech.cmpcharstocolors.colorgrid.presentation.composables

import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.drick.compose.hotpreview.HotPreview

@Composable
fun MultiLineTextInput(
    text: String,
    labelText: String,
    maxLines: Int,
    modifier: Modifier = Modifier,
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

@HotPreview(
    name = "phone light", group = "light", widthDp = 411, heightDp = 891,
    fontScale = 1.5f, density = 2.625f, darkMode = false
)
@Composable
fun MultiLineTextInputPreview() {
    MultiLineTextInput(
        text = "Hello World",
        labelText = "Message",
        maxLines = 5
    ) {  }
}