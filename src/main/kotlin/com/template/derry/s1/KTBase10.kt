package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-02 9:17
 * @Description: Kotlin 语言编译时常量
 * 查看 Kotlin bytecode: Tools->Kotlin->Show Kotlin ByteCode
 **/

const val PI = 3.1415 //定义编译时常量，不能作为局部变量

fun main() {

    var space = PI * 5 * 5
    println(space)
    println(space is Double) // is 类似于Java instanceOf
}