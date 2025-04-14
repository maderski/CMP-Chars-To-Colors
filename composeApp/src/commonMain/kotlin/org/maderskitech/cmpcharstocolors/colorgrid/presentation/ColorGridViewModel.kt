package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.converters.StringToARGBListConverter

class ColorGridViewModel(
    private val stringToARGBListConverter: StringToARGBListConverter
) : ViewModel() {

    fun getColorList(message: String, columnCount: Int): List<Color> {
        val colorIntList = stringToARGBListConverter.convert(message)
        return colorIntList.map { Color(it) }
    }
}