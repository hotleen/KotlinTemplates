package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-23 18:08
 * @Description: let函数
 * let函数返回值是根据匿名函数最后一行
 * it持有的是it 调用对象本身
 *
 * apply 返回的是调用对象 持有的是this 调用对象
 **/

fun main() {
    test()
    println(isEmptyStr(null))
}

fun test() {
    val list = listOf(6, 5, 2, 3, 5, 7)
    val value1 = list.first()
    println("first value: $value1")

    val letReturnValue = list.let {
        println("last value ${it.last()}")
        it.last()
    }
    println("last return value: $letReturnValue")
}

// ?: 为空执行，方便赋默认值
fun isEmptyStr(value: String?): String {
    return value?.let {
        "not empty string"
    } ?: "empty string"
}

// 简化版本
fun isEmptyStr2(value: String?) =
    value?.let {
        "not empty string"
    } ?: "empty string"

