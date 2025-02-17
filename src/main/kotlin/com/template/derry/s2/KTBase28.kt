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
// Lambda 只有一个参数，所以我们可以直接使用 it 代替参数名称
val twoSum = { num1: Int, num2: Int ->
    "result is ${num1 + num2}"
}