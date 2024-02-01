package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-02-01 21:39
 * @Description:
 **/
class KTBase89 {

    //伴生对象 类似与static静态代码 只会初始化一次
    companion object {
        const val info = "static info"
    }
}

fun main() {
    println(KTBase89.info)
}