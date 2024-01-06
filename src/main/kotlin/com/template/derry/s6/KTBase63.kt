package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-06 10:43
 * @Description: 可变set集合
 **/
fun main() {
    val set:MutableSet<String> = mutableSetOf("tom","jerry")
    set+="jack"
    set-="jack"
    set.add("tommy")
    set.remove("tommy")
    println(set)

}