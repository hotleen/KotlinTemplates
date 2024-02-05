package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-05 22:20
 * @Description:
 **/
//普通类
class Student(var name: String, var age: Int, var gender: Char) {
    // 顺序下来 普通类需要这样写 data class会自动生成这部分代码
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = gender

}

fun main() {
    val(name,age,gender)=Student("jack",12,'M')

    println("解构结果: name:$name age:$age gender:$gender")
}