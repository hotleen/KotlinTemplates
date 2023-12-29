package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-29 21:47
 * @Description:
 **/
fun main() {
    val list:MutableList<String> = mutableListOf<String>("tom","jerry","mary")
    list.add("lucy")
    println(list)

    //普通list 不可变
    val list2 = listOf<String>("amy","jack","dick")
    // list2.add() 不可变 无法add

    //不可变list 转可变list
    val list3 = list2.toMutableList()

    //可变list 转 不可变list
    val list4:List<String> = list3.toList()

}