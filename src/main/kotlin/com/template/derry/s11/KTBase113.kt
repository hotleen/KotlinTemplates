package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-17 22:28
 * @Description: 扩展函数
 **/

class KTBase113(val name: String, val age: Int, val gender: Char)

// class外层扩展的函数
fun KTBase113.show() {
    println("扩展的show函数，name:$name")
}

fun String.addExtend(times: Int) = this + "@".repeat(times)

fun main() {
    val p = KTBase113("tom", 21, 'M')
    p.show()
    println("happy".addExtend(3))
}