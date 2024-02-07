package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-07 22:40
 * @Description:
 **/
class AddClass(num1: Number, num2: Number)

data class AddClassPlus(var num1: Int, var num2: Int) {
    // plus 操作符重载+
    operator fun plus(p1: AddClassPlus): Int {
        return (num1 + p1.num1) + (num2 + p1.num2)
    }
}

fun main() {
    println(AddClassPlus(1, 1) + AddClassPlus(2, 2))
}