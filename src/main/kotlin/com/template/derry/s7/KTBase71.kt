package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-24 22:57
 * @Description:
 **/

class KTBase71 {

    // val 只读 只有get函数  没有set函数
    val number: Int = 9

    // 这样写 get覆盖了 field，field相当于本身变量的值
    val num: Int
        get() = (1..100).shuffled().first() //1到100 随机值

    // 防竟态条件
    var info: String? = ""

    fun getShownInfo(): String {
        return info?.let {
            if (it.isBlank()) {
                "info is blank"
            } else {
                "last result is $it"
            }
        } ?: "info is null, please check"
    }
}

fun main() {
    println(KTBase71().number)

    // 报错 只读变量 不能set
//    KTBase71().number = 1

    println(KTBase71().num)

    println(KTBase71().getShownInfo())
}