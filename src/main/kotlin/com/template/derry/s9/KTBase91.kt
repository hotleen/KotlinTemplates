package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-04 20:57
 * @Description:
 **/
class ResponseResultBean(var msg:String, var code: Int, var data:String)

// 数据类 用于JavaBean对象
data class ResponseResultBean1(var msg: String, var code: Int, var data: String)

fun main() {
    //data class 默认重写了toString,添加了set、get equals hashcode 方法
    println(ResponseResultBean1("loginSuccess",200,"login data"))
    println(ResponseResultBean1("loginSuccess",200,"login data").data)
}