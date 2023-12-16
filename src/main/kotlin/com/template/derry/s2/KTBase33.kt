package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 16:26
 * @Description: 返回函数对象
 **/

fun main() {
    //返回了一个函数对象
    val funcObj = returnMethod("method info")
    println(funcObj("fun", 100))
}

fun returnMethod(info: String): (String, Int) -> String {
    println("这个函数返回值是一个函数， info:$info")

    return { name: String, age: Int ->
        "return method info: name:$name, age:$age"
    }
}