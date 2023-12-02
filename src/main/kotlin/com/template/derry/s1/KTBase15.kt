package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-02 16:50
 * @Description: 字符串模板
 **/

fun main() {
    testStringTemplate()
}

fun testStringTemplate() {
    val garden = "中山公园"
    val time = 6

    println("今天${time}点去${garden}散步")

    // 注意Kotlin 中if 是表达式
    val isLogin = true
    println(
        "server response login status: " +
                " ${if (isLogin) "login success" else "login failed"}"
    )
}