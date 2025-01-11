package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2025-01-11 10:48
 * @Description: infix关键字
 **/

private infix fun <C1, C2> C1.go(c2: C2) {
    println("first param is: $this, second params is $c2")
}

fun main() {
    mapOf("零".to(0))
    mapOf("1" to 0)

    "huzy" go "HeFei"
    "huzy".go("HeFei")
}