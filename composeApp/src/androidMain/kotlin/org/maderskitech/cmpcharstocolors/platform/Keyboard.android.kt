package org.maderskitech.cmpcharstocolors.platform

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

actual class KeyboardControl(
    private val activity: Activity
) {
    actual fun dismiss() {
        val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(activity.window.decorView.windowToken, 0)
    }
}