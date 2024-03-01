package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-01 21:40
 * @Description:
 **/

class KTBase103 <T> (private var obj:T) {
    fun show() = println("万能输出器：$obj")
}

data class Student(val name:String, val age: Int, val gender:Char)

fun main() {
    val s1 = Student("jack",18,'M')

    KTBase103(s1).show()
}