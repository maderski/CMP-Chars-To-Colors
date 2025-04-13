package org.maderskitech.cmpcharstocolors

import androidx.compose.ui.window.ComposeUIViewController
import org.maderskitech.cmpcharstocolors.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}