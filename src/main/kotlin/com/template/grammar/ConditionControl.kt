package com.template.grammar

/**
 * author: jack hu
 * @Create: 2023-11-26 10:14
 * @Description:
 **/

/**
 * when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件。
 * when 既可以被当做表达式使用也可以被当做语句使用。如果它被当做表达式，符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值。
 * when 类似其他语言的 switch 操作符。
 */
fun main(args: Array<String>) {
    var x = 0
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // 注意这个块
            println("x 不是 1 ，也不是 2")
        }
    }

    when (x) {
        in 0..10 -> println("x 在该区间范围内")
        else -> println("x 不在该区间范围内")
    }
}
