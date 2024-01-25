package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-25 22:19
 * @Description:
 **/
class KTBase74(name: String) {
    //次构造函数 必须要调用主构造函数 主构造统一管理，更好的初始化
    constructor(name: String, gender: Char) : this(name) {
        println("two params constructor name: $name, gender: $gender")
    }

    constructor(name: String, gender: Char, age: Int) : this(name) {
        println("three params constructor name: $name, gender: $gender, age: $age")
    }
}

fun main() {
    val p = KTBase74("alice") // 调用主构造器

    KTBase74("jack", 'M')
    KTBase74("amy", 'F', 21)
}