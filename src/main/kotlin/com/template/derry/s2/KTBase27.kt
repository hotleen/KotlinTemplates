package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-09 16:51
 * @Description: 自动推断返回类型
 **/
fun main() {
    println(methodFunc(1,"string"))
}

/**
 * 方法名：必须指定 参数类型 和 返回类型
 * 方法名=类型推断返回类型
 *
 * 自动推断返回类型，匿名函数最后一行就是返回值，自动推断
 */

val methodFunc = { v1: Int, v2: String ->
    "v1:$v1, v2:$v2"
}
