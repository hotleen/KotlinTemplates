package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-02 15:05
 * @Description:
 **/
open class MyAnyClass(name: String) //顶级类

open class PersonClass(name: String) : MyAnyClass(name = name)

class StudentClass(name: String) : PersonClass(name = name)

class TeacherClass(name: String) : PersonClass(name = name)

class DogClass(name: String) //其他类

class KTBase106<T : MyAnyClass>(val inputTypeValue: T, private val isReturn: Boolean = true) {

    fun getObj() = inputTypeValue.takeIf { isReturn }


}

fun main() {
    val any = MyAnyClass("derry")

    val per = PersonClass("derry person")

    val student = StudentClass("derry student")

    val teacher = TeacherClass("derry teacher")

    val dog = DogClass("doggy")

    println(KTBase106(any).getObj())

    // 传入dog类对象会报错，由于泛型限定 与Java泛型一致
    //KTBase106(dog)
}