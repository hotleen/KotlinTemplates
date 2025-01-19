package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-19 21:46
 * @Description:map转换函数
 **/

fun main() {
    val list = listOf("sheldon", "jack", "penny")

    val list2 = list.map {
        "[$it]"
    }
    println(list2)
}