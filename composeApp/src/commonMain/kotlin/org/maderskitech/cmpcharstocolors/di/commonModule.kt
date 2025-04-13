package org.maderskitech.cmpcharstocolors.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.maderskitech.cmpcharstocolors.colorgrid.presentation.ColorGridViewModel

val commonModule = module {
    viewModelOf(::ColorGridViewModel)
}