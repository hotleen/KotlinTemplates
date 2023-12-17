package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-17 9:57
 * @Description: 在闭包内用it代替调用者，let的返回值为函数的最后一行。let常用来做为判空后的处理
 **/

fun main() {
    var name:String ?=null
    name = ""

    val value = name?.let {
        if (it.isBlank()) {
            "Default"
        } else {
            "$it"
        }
    }
    println(value)
}