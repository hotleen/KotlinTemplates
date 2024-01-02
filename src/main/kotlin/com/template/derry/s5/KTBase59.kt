package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2024-01-02 19:58
 * @Description:
 **/
fun main() {
    val list: MutableList<String> = mutableListOf("tom", "jerry", "jack")
    list += "amy" // 运算符重载
    list -= "tom"
    list.let { println(it) }

    // removeIf 条件删除
    list.removeIf { it.contains("am") }
    list.let { println(it) }

}