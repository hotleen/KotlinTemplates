package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 16:19
 * @Description: 继承
 * 1、子类的构造函数必须调用父类的构造函数，否则编译不通过。
 * 2、super(...) 只能调用父类的构造函数，不能调用 init 代码块。
 * 3、如果父类有多个构造函数，子类可以选择调用哪一个。
 * 4、可以同时使用主构造函数和次构造函数，但必须确保调用到父类的构造函数。
 **/
open class Person1(private val name: String) {
    // Kotlin 函数默认final修饰 不可被子类重写，需要加open
    private fun showName() = "person name is $name"

    open fun printName() = println(showName())
}

class Student1 (private val subName:String):Person1(subName) {
    private fun showName() = "student name is $subName"

    override fun printName() = println(showName())

}

fun main() {
    val p = Student1("jack")

    p.printName()

    println(p is Student1)
}