package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-19 22:45
 * @Description:
 **/
fun main() {
    val jsonText = "tom,jack,amy,larry"
    val list = jsonText.split(",")

    println("list: $list")
    // 解构
    val (v1,v2,v3,v4) = list
    println("v1:$v1 v2:$v2 v3:$v3 v4:$v4")
}