package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 13:26
 * @Description: inline内联
 **/

fun main() {

    loginAPI("Tommy", "12345") { msg: String, code: Int ->
        println("login result : msg:$msg, code:$code")
    }
}

const val USER_NAME_SAVE_DB_NEW = "Jerry"
const val USER_PWD_SAVE_DB_NEW = "12345"

/**
 * 如果此函数，不使用内联，在调用端，会生成多个对象来完成lambda的调用，造成性能损耗
 * 如果此函数，使用内联，相当于C++ #define宏定义 宏替换，会把代码替换到调用处，调用处没有任何函数开辟 对象开辟的损耗
 * 小结：如果函数参数有lambda，尽量使用inline内联 会在内部优化，减少对象开辟的开销
 */
inline fun loginAPINEW(username: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (username == null || userPwd == null) {
        TODO("用户名或密码为空")
    }
    if (username.length > 3 && userPwd.length > 3) {
        if (webServiceLoginAPINEW(username, userPwd)) {
            responseResult("login success", 200)
        } else {
            responseResult("login failed", 444)
        }
    }
}

fun webServiceLoginAPINEW(username: String, userPwd: String): Boolean {
    return username == USER_NAME_SAVE_DB_NEW && userPwd == USER_PWD_SAVE_DB_NEW
}