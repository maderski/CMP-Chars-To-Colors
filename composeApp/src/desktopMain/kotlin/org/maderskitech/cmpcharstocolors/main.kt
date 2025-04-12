package org.maderskitech.cmpcharstocolors

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMP-Chars-To-Colors",
    ) {
        App()
    }
}