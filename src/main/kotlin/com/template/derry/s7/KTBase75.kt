package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-26 19:15
 * @Description:
 **/
class KTBase75(name: String = "jessy") {
    //次构造函数
    constructor(name: String = "jane", gender: Char = 'M') : this(name) {
        println("two params constructor name: $name, gender: $gender")
    }

}

fun main() {
    KTBase75() //优先调用主构造

}