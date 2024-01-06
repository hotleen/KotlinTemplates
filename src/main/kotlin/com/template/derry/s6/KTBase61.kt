package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-06 10:09
 * @Description: 解构
 **/

fun main() {
    val list: List<String> = listOf("jack", "tom", "jerry")
    val (a, b, c) = list
    println("a: $a b:$b, c:$c")

    // _用于过滤解构赋值
    val (_, n2, n3) = list
    println("n2:$n2, n3:$n3")
}