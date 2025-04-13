package org.maderskitech.cmpcharstocolors.colorgrid.converters

class StringToARGBListConverter(
    val charToRGB: CharToRGBConverter,
    val rgbToARGB: RGBToARGBConverter
) {
    fun convert(message: String): List<Int> =
        message.map { char ->
            val rgb = charToRGB.convert(char)
            rgbToARGB.convert(rgb)
        }
}