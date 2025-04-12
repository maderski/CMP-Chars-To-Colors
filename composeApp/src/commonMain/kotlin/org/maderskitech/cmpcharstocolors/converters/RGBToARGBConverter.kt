package org.maderskitech.cmpcharstocolors.converters

import org.maderskitech.cmpcharstocolors.converters.model.RGB

class RGBToARGBConverter : Converter<RGB, Int> {
    override fun convert(input: RGB): Int =
        (0xFF shl 24) or (input.r shl 16) or (input.g shl 8) or input.b // ARGB format
}