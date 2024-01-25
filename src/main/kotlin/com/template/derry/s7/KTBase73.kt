package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-25 20:30
 * @Description:
 **/
// 跟_xxx方式等价
class KTBase73(var name: String, val gender: Char, val age: Int, var info: String) {
    fun show() {
        println(name)
    }
}

fun main() {
    KTBase73(name = "tom", gender = 'M', age = 21, info = "learning Kotlin for 2.5 years").show()
}