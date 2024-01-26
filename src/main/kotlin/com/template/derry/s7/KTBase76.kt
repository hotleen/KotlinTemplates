package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-26 19:36
 * @Description:
 **/
class KTBase76(username: String, userAge: Int, userGender: Char) {

    // 类似于Java 类里的{} 主构造函数调用，init也会被调用
    init {
        println("main constructor was called $username")

        // false 执行第二个参数的lambda
        require(username.isNullOrBlank()){"userName is null"}
    }

    constructor(username: String, userAge: Int, userGender: Char, userInfo: String) :
            this(username, userAge, userGender) {
        println("second constructor was called $userInfo")
    }

}

fun main() {
    KTBase76("jack", 23,'M',"student")

    KTBase76("",21,'M')
}