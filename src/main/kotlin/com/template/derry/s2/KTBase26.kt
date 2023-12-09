package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-09 15:34
 * @Description: it关键字
 **/

fun main() {
    println(methodFuc("myParam"))
}

// 单参数匿名函数 自动添加参数变量it it可以直接使用
val methodFuc: (String) -> String = {
    "pass param is $it"
}