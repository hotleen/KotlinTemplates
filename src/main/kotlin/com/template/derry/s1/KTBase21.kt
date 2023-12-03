package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 11:35
 * @Description: 反引号``
 **/

fun main() {
    //``用于测试
    `登录功能huzy测试`("tom", "123456")

    // in is 在Kotlin中为关键字，通过``避免无法调用
    KTBase21.`in`()
    KTBase21.`is`()
}


private fun `登录功能huzy测试`(name: String, pwd: String) {
    println("模拟：用户名称是$name , 密码是$pwd")
}