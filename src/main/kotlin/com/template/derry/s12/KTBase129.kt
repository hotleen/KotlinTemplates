package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-23 22:17
 * @Description: Kotlin与Java互操作规范
 **/

fun main() {
    //接收Java方法参数，用？
    val info: String? = KTBase128().info1
    val info2: String? = KTBase128().info2

    println("info1 length: ${info?.length}")
    println("info2 length: ${info2?.length ?: 0}")
}