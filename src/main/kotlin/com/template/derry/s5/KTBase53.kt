package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-24 9:56
 * @Description:
 * with函数 返回类型根据函数最后一行 持有的是this
 **/
fun main() {
    testWith()
}

fun testWith() {
    val str = "Hello World"
    val len = with(str, ::getStrLength)
    with(len, ::printLen)
    // 内部持有的是this对象
    with(str) {
        println("pass parameter is $this")
    }
}

fun getStrLength(str: String) = str.length

fun printLen(len: Int) = println("str length is $len")