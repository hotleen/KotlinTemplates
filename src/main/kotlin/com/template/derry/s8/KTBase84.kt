package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 16:19
 * @Description:
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