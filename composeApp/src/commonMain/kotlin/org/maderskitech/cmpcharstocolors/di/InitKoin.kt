package org.maderskitech.cmpcharstocolors.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.maderskitech.cmpcharstocolors.colorgrid.converters.di.converterModule

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        printLogger()
        config?.invoke(this)
        modules(commonModule + converterModule)
    }
}