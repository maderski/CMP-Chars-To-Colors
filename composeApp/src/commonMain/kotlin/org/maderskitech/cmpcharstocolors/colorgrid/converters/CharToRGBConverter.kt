package org.maderskitech.cmpcharstocolors.colorgrid.converters

import org.maderskitech.cmpcharstocolors.colorgrid.converters.model.RGB

class CharToRGBConverter {
    fun convert(char: Char): RGB {
        val code = char.code
        val r = (code * 37) % 256
        val g = (code * 73) % 256
        val b = (code * 151) % 256
        return RGB(r, g, b)
    }
}