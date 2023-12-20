package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-20 20:27
 * @Description: replace
 **/
fun main() {
    val sourcePwd = "ABCDEFGHIJK"

    val r1 = sourcePwd.replace(Regex("[ABC]")){
        when (it.value) {
            "A" -> "9"
            "B" -> "8"
            "C" -> "2"
            else -> it.value
        }
    }
    println("encrypt data: $r1")
}