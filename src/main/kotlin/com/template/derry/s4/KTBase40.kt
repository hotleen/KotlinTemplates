package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-17 10:33
 * @Description:?.空合并操作符
 **/

fun main() {
    var info: String ?= null

    // ?: info如果为null 就执行?:后面的语句
    println(info ?: "info is null")

    // let 函数 + 空合并操作符
    println(info?.let { "$it" } ?: "so its null")
}