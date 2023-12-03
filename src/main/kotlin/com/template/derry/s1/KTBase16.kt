package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 8:37
 * @Description: 函数声明
 **/

fun main() {
    getAgeByName("tom")
}

/**
 * Kotlin函数声明 先声明输入 后声明输出 默认为public
 * 语句不需要结束符 ;
 */
private fun getAgeByName(name: String): Int {
    println("姓名：${name}, 年龄是21")
    return 21
}