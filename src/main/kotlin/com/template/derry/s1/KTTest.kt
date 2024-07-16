package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2024-07-15 21:58
 * @Description:
 **/

fun main() {
//    println(twoSum(1, 2))
//    getElement("helloKotlin")
    printMultiplyTable()
}

val twoSum: (Int, Int) -> Int = { n1, n2 ->
    n1 + n2
}

fun printMultiplyTable() {
    for (i in 1..9) {
        for (j in 1..i) {
            print("${j}*${i}=${i * j} ")
        }
        println()
    }
}

fun getElement(msg: String) {
    println("msg length is ${msg.length}")
    println("first char is ${msg[0]}")
}