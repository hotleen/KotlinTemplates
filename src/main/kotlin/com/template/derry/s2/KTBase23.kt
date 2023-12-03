package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-03 15:45
 * @Description: 匿名函数
 **/
fun main() {
    wordLen()
}

private fun wordLen() {
    val len = "Hello".count()
    println(len)

    // count函数接收一个匿名判断函数作为条件
    val len2 = "Hello".count { it == 'l' }
    println(len2)
}