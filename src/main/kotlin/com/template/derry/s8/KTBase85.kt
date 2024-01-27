package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 16:25
 * @Description:
 **/
open class Person2(private val name: String) {
    // Kotlin 函数默认final修饰 不可被子类重写，需要加open
    private fun showName() = "person name is $name"

    open fun printName() = println(showName())
}

class Student2 (private val subName:String):Person2(subName) {
    private fun showName() = "student name is $subName"

    override fun printName() = println(showName())

    fun studentOwnMethod() = println("own method")

}

fun main() {
    val p :Person2 = Student2("tom")

    // 调用一次智能转换，后面不需要继续转换就可以调用子类方法
    (p as Student2) .studentOwnMethod()

    p.studentOwnMethod()
}