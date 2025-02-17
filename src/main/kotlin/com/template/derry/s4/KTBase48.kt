package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-21 21:22
 * @Description: 安全类型转换
 **/
fun main() {
    val number: Int = "666".toInt()
    println(number)

    //由于 "666.6" 不是整数，转换失败，返回 null
    val num1: Int? = "666.6".toIntOrNull()
    println(num1?:"its null")
}