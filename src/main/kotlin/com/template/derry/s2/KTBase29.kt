package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-09 17:31
 * @Description:函数作为函数参数
 **/
fun main() {
    //调用的时传递函数作为参数
    //方式一
    loginAPI("Tommy", "12345", { msg: String, code: Int ->
        println("login result : msg:$msg, code:$code")
    })
    //方式二
    loginAPI("Tommy", "12345", responseResult = { msg: String, code: Int ->
        println("login result : msg:$msg, code:$code")
    })
    //方式三 当最后一个参数为函数参数 可以写到外面 简化版本推荐
    loginAPI("Tommy", "12345") { msg: String, code: Int ->
        println("login result : msg:$msg, code:$code")
    }
}

const val USER_NAME_SAVE_DB = "Tommy"
const val USER_PWD_SAVE_DB = "12345"

fun loginAPI(username: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (username == null || userPwd == null) {
        TODO("用户名或密码为空")
    }
    if (username.length > 3 && userPwd.length > 3) {
        if (webServiceLoginAPI(username, userPwd)) {
            responseResult("login success", 200)
        } else {
            responseResult("login failed", 444)
        }
    }
}

private fun webServiceLoginAPI(username: String, userPwd: String): Boolean {
    return username == USER_NAME_SAVE_DB && userPwd == USER_PWD_SAVE_DB
}