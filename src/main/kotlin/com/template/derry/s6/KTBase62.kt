package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-06 10:19
 * @Description:
 **/
fun main() {
    // 自动过滤重复元素
    val set: Set<String> = setOf("jack", "tom", "jerry", "jerry")
    println(set)
    println(set.elementAt(0))

    println(set.elementAtOrElse(3){"out of bound"})
    //结合空合并操作符
    println(set.elementAtOrNull(11)?:"out of bound ya")
}