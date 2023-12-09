package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-09 17:16
 * @Description: lambda表达式
 **/

fun main() {
    println(twoSum(1, 2))
}

// 实际上为 (Int, Int)->String 匿名函即为lambda表达式
val twoSum = { num1: Int, num2: Int ->
    "result is ${num1 + num2}"
}