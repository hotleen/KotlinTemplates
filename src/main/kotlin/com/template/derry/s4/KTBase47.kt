package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-20 21:36
 * @Description:
 **/
fun main() {
    strLoop(null)
    strLoop("null")
}

fun strLoop(info: String?) {
    info?.forEach {
        println("value is $it")
    }
}