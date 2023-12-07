package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-07 21:41
 * @Description: 函数参数
 **/
fun main() {
    println(methodFunction(1, 2, 3))
}

val methodFunction: (Int, Int, Int) -> String = { num1, num2, num3 ->
    val sum = num1 + num2 + num3
    "$num1 + $num2 + $num3 is $sum"
}