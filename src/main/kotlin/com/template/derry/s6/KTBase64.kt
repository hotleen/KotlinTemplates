package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-06 10:45
 * @Description:
 **/
fun main() {
    val list: MutableList<String> = mutableListOf("tom", "jack", "tom", "lucy")

    //转set去重
    val set = list.toSet()
    println(set)

    //list->set->list
    println(list.toSet().toList())

    //快捷函数
    println("list distinct ${list.distinct()}")

}