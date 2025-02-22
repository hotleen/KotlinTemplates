package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-24 10:44
 * @Description:
 * also: 返回值不变，永远是调用对象本身（链式调用），持有的是it
 * also 的核心作用是 在返回原对象的同时执行额外操作，适用于链式调用中的中间处理或调试。
它与 apply 的主要区别在于 对象引用方式（it vs this），根据是否需要显式引用选择。
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