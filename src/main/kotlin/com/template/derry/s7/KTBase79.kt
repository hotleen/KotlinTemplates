package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-27 10:22
 * @Description:by lazy 用于延迟初始化 val 变量，只有在第一次使用时才会执行初始化，之后就不会再重复计算
 **/
class KTBase79 {
//    val dbData = readSQLDataAction()

    val dbDataLazy by lazy { readSQLDataAction() }

    private fun readSQLDataAction(): String {
        println("start to read")
        println("loading")
        println("loading")
        println("loading")
        println("read ending")
        return "database data load success"
    }
}

fun main() {
    val obj = KTBase79()

    Thread.sleep(3000)

//    println("result is ${obj.dbData}")

    println("result is ${obj.dbDataLazy}")


}