package org.maderskitech.cmpcharstocolors.platform

import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSNumber
import platform.Foundation.NSSelectorFromString
import platform.Foundation.numberWithBool
import platform.UIKit.UIApplication
import platform.darwin.NSObject

@OptIn(ExperimentalForeignApi::class)
actual class KeyboardControl {
    actual fun dismiss() {
        val view = UIApplication.sharedApplication.keyWindow?.rootViewController?.view
        // NSSelectorFromString("endEditing:") gets the correct Objective-C selector
        val selector = NSSelectorFromString("endEditing:")
        // numberWithBool(true) creates a valid NSNumber from a Kotlin Boolean
        val arg: NSNumber = NSNumber.numberWithBool(true)

        if (view != null && view.respondsToSelector(selector)) {
            // performSelector(_:withObject:) is dynamically dispatched on NSObject
            (view as NSObject).performSelector(selector, withObject = arg)
        }
    }
}