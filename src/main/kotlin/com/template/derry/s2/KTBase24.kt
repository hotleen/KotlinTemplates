package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-03 15:57
 * @Description: 隐式返回
 **/

fun main() {

    val methodAction: () -> String

    // 自动推断函数返回值为String
    methodAction = {
        val value = 112233
        "$value Hello World!"
    }

    println(methodAction())
}