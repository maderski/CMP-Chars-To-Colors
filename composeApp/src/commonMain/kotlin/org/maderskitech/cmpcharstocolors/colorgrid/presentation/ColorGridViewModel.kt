package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.lifecycle.ViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.converters.StringToARGBListConverter

class ColorGridViewModel(
    private val stringToARGBListConverter: StringToARGBListConverter
) : ViewModel() {
    fun getColorIntList(message: String, columnCount: Int): List<Int> {
        val colorIntList = stringToARGBListConverter.convert(message)
        val remainder = colorIntList.size % columnCount
        return if (remainder == 0) {
            colorIntList
        } else {
            val needed = columnCount - remainder
            val repeatColors = colorIntList.take(needed)
            colorIntList + repeatColors
        }
    }
}