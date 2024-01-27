package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 11:02
 * @Description:
 **/
// class 默认public final, 加open 移除final
open class Person(private val name: String) {
    // Kotlin 函数默认final修饰 不可被子类重写，需要加open
    private fun showName() = "person name is $name"

    open fun printName() = println(showName())
}

class Student (private val subName:String):Person(subName) {
    private fun showName() = "student name is $subName"

    override fun printName() = println(showName())

}

fun main() {
    val person: Person = Student("jack")

    person.printName()
}