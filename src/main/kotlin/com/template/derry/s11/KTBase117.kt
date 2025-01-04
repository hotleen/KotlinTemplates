package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2025-01-04 10:32
 * @Description: 属性扩展
 **/

val myStr: String = "AAA"

//Strign类型扩展
val String.myInfo: String
    get() = "jackInfo"

fun main() {
    val s: String = "ABC"
    println(s.myInfo)
}