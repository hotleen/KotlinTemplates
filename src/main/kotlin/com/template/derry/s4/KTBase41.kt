package com.template.derry.s4


/**
 * author: jack hu
 * @Create: 2023-12-18 22:13
 * @Description: 异常处理 & 自定义异常
 **/
fun main() {
    try {
        var info:String? = null
        checkException(info)

        println(info!!.length)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

// ?: 如果info为null 执行后面表达式抛出异常，不为null则返回info
fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException: IllegalArgumentException("Native_R001_Exception")
