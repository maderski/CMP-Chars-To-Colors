package org.maderskitech.cmpcharstocolors.colorgrid.presentation

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import org.maderskitech.cmpcharstocolors.colorgrid.converters.StringToARGBListConverter

class ColorGridViewModel(
    private val stringToARGBListConverter: StringToARGBListConverter
) : ViewModel() {

    fun getColorList(message: String, columnCount: Int): List<Color> {
        val colorIntList = stringToARGBListConverter.convert(message)
        val paddedColorInts = padColorIntsToGrid(colorIntList, columnCount)
        return paddedColorInts.map { Color(it) }
    }

    /*
     The colors may not fill out a grid with a specified column count and if not, fill
     the remaining by taking colors from the beginning of the list and thus starting to
     repeat until the grid is filled.
     */
    private fun padColorIntsToGrid(colorIntList: List<Int>, columnCount: Int): List<Int> {
        val remainder = colorIntList.size % columnCount
        return if (remainder == 0) {
            colorIntList
        } else {
            val needed = columnCount - remainder
            val repeatColorInts = colorIntList.take(needed)
            colorIntList + repeatColorInts
        }
    }
}