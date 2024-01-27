package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 18:15
 * @Description: object关键字修饰类 声明类的同时创建一个类的单例对象
 **/
object KTBase87 {
    init {
        println("KTBase87 init...")
    }

    fun show() = println("show function")
}

fun main() {
    //
    println(KTBase87)
    println(KTBase87)
    println(KTBase87)

    KTBase87.show()
}
