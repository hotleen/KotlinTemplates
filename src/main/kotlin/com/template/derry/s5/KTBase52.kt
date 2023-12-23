package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-23 19:26
 * @Description:
 * run函数返回类型 根据匿名函数最后一行，持有的是this 调用对象
 **/
fun main() {
    testRun()
}

fun testRun() {
    val info = "Hello world"
    info.run {
        println("last char: ${this.last()}")
    }

    info.run(::isLongStr)
        .run {
            println("result $this")
        }
}

fun isLongStr(str: String) = str.length > 5