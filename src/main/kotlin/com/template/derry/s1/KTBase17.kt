package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 9:06
 * @Description:
 **/

fun main() {
    printUserInfo()
    printUserInfo("mary", 18)
}

private fun printUserInfo(name: String = "tom", age: Int = 21): Unit {
    println("userName is $name & age is $age")
}