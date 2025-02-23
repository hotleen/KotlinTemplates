package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 10:45
 * @Description: 单表达式函数
 **/
class KTBase80 {

    // 先定义 后ini使用
    var num = 9
    init {
        num = num++
    }

    // 等价于 return num 简化写法
    //当函数体只有一个表达式时，可以使用 = 直接返回该表达式的值，而不需要使用 {} 和 return 关键字
    //等价于
    /**
     * fun getNumMethod(): Int {
    *       return num
     *   }
     *
     *   类型推导允许省略返回类型
     *   fun getNumMethod()= num
     */
    fun getNumMethod():Int = num
}

fun main() {
    println(KTBase80().num)
}