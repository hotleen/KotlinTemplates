package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-21 21:22
 * @Description: 安全类型转换
 **/
fun main() {
    val number: Int = "666".toInt()
    println(number)

    val num1: Int? = "666.6".toIntOrNull()
    println(num1?:"its null")
}