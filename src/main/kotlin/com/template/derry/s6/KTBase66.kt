package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-20 19:39
 * @Description: map的创建
 **/
fun main() {
    val map = mapOf("tom" to (18), "jerry" to 19)
    val map1 = mapOf(Pair("tom",18),Pair("jerry",19))
    println(map)
    println(map1)
}