package org.maderskitech.cmpcharstocolors

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.maderskitech.cmpcharstocolors.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Chars-To-Colors",
        ) {
            App()
        }
    }
}