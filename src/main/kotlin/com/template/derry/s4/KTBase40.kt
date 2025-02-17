package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-17 10:33
 * @Description:?.空合并操作符
 * ?. 安全调用操作符当对象不为 null 时，调用其方法或访问属性；若对象为 null，则直接返回 null，避免抛出 NullPointerException
 * ?:（Elvis 运算符）用于在 左侧表达式为 null 时提供默认值。
 **/

fun main() {
    var info: String ?= null

    // ?: info如果为null 就执行?:后面的语句
    println(info ?: "info is null")

    // let 函数 + 空合并操作符
    println(info?.let { "$it" } ?: "so its null")

    println("hello kotlin"?.let { it })
}