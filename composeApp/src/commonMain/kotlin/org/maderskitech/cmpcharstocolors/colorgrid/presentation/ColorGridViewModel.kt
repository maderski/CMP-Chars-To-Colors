package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.lifecycle.ViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.converters.StringToARGBListConverter

class ColorGridViewModel(
    private val stringToARGBListConverter: StringToARGBListConverter
) : ViewModel() {
    fun getARGBList(message: String) = stringToARGBListConverter.convert(message)
}