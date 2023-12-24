package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-24 10:44
 * @Description:
 * also: 返回值不变，永远是调用对象本身（链式调用），持有的是it
 **/
fun main() {
    testAlso()
}

fun testAlso() {
    val str = "Hello Kotlin"
    // also始终返回调用对象本身 支持链式调用
    str.also {
        println("str is $it")
    }.also {
        println("str length is ${it.length}")
    }
}