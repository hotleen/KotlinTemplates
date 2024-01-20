package com.template.derry.s6

/**
 * author: jack hu
 * @Create: 2024-01-20 21:18
 * @Description:插入值
 **/
fun main() {
    val mMap = mutableMapOf("jack" to 21, "amy" to 22, "frank" to 23)
    mMap += "kevin" to 24
    mMap += "qqq" to 24
    mMap -= "qqq"
    mMap["aaa"] = 11
    mMap.put("abb", 12) // []等价

    // getOrPut 如果集合没有就添加值，再取出;有的话直接取出
    val value = mMap.getOrPut("fff") { 31 }
    println(value)

}