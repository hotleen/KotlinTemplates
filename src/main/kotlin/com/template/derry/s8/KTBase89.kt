package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-02-01 21:39
 * @Description: 在 Kotlin 中，companion object 用于在类内部定义静态成员，
 * 类似于 Java 的 static 关键字。它允许你在不创建类实例的情况下访问类的属性和方法
 **/
class KTBase89 {

    //伴生对象 类似与static静态代码 只会初始化一次
    companion object {
        const val info = "static info"
    }
}

fun main() {
    println(KTBase89.info)
}