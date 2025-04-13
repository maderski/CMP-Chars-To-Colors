package org.maderskitech.cmpcharstocolors.colorgrid.converters.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import org.maderskitech.cmpcharstocolors.colorgrid.converters.CharToRGBConverter
import org.maderskitech.cmpcharstocolors.colorgrid.converters.RGBToARGBConverter
import org.maderskitech.cmpcharstocolors.colorgrid.converters.StringToARGBListConverter

val converterModule = module {
    factoryOf(::CharToRGBConverter)
    factoryOf(::RGBToARGBConverter)
    factoryOf(::StringToARGBListConverter)
}