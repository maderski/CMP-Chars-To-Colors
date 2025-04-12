package org.maderskitech.cmpcharstocolors.converters

/**
 * I - input type
 * O - Output type
 */
interface Converter<I, O> {
    fun convert(input: I): O
}