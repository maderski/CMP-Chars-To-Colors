package org.maderskitech.cmpcharstocolors

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform