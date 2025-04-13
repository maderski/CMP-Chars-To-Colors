package org.maderskitech.cmpcharstocolors.colorgrid.converters

import org.maderskitech.cmpcharstocolors.colorgrid.converters.model.RGB

class RGBToARGBConverter {
    fun convert(rgb: RGB): Int =
        (0xFF shl 24) or (rgb.r shl 16) or (rgb.g shl 8) or rgb.b // ARGB format
}