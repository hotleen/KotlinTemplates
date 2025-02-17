package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-19 22:45
 * @Description:解构赋值 适用于列表list和数据类data class
 **/
fun main() {
    val jsonText = "tom,jack,amy,larry"
    val list = jsonText.split(",")

    println("list: $list")
    // 解构list
    val (v1,v2,v3,v4) = list
    println("v1:$v1 v2:$v2 v3:$v3 v4:$v4")

    //解构data class
    val person = Person("Tom", 25)
    val (name, age) = person

    println("姓名: $name, 年龄: $age")

}

data class Person(val name: String, val age: Int)