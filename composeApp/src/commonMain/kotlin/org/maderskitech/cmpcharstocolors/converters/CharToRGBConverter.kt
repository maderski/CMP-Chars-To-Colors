package org.maderskitech.cmpcharstocolors.converters

import org.maderskitech.cmpcharstocolors.converters.model.RGB

class CharToRGBConverter : Converter<Char, RGB> {
    override fun convert(input: Char): RGB {
        val code = input.code
        val r = (code * 37) % 256
        val g = (code * 73) % 256
        val b = (code * 151) % 256
        return RGB(r, g, b)
    }
}