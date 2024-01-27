package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 10:45
 * @Description:
 **/
class KTBase80 {

    // 先定义 后ini使用
    var num = 9
    init {
        num = num++
    }

    // 等价于 return num 简化写法
    fun getNumMethod():Int = num
}

fun main() {
    println(KTBase80().num)
}