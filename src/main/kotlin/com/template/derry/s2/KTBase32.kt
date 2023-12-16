package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 14:45
 * @Description: 函数引用
 **/
fun main() {
    // lambda属于函数类型对象 ::函数名 变成函数类型对象
    loginFunc("Jerry", "12345", ::responseResultMethod)
}

fun responseResultMethod(msg:String, code:Int) {
    println("login result : msg:$msg, code:$code")
}

const val USER_NAME_SAVE_DB_NEW1 = "Jerry"
const val USER_PWD_SAVE_DB_NEW1 = "12345"

inline fun loginFunc(username: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (username == USER_NAME_SAVE_DB_NEW1 && userPwd == USER_PWD_SAVE_DB_NEW1) {
        responseResult("login success", 200)
    } else {
        responseResult("login failed", 444)
    }
}