package org.maderskitech.cmpcharstocolors.converters

import org.maderskitech.cmpcharstocolors.converters.model.RGB

class StringToARGBListConverter(
    val charToRGB: Converter<Char, RGB>,
    val rgbToARGB: Converter<RGB, Int>
) : Converter<String, List<Int>> {
    override fun convert(input: String): List<Int> =
        input.map { char ->
            val rgb = charToRGB.convert(char)
            rgbToARGB.convert(rgb)
        }
}