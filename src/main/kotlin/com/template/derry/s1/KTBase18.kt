package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 9:36
 * @Description: 具名函数参数
 **/

fun main() {
    loginAction(userNickName = "jenny", userAge = 18, userPwd = "123321", userName = "mary")
}

private fun loginAction(userName: String, userPwd: String, userAge: Int, userNickName: String) {
    println("userName: $userName, userPwd: $userPwd, userAge: $userAge, userNickName: $userNickName")
}