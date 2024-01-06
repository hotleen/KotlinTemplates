package com.template.derry.s6

import java.io.File

/**
 * author: jack hu
 * @Create: 2024-01-06 10:51
 * @Description:
 **/
fun main() {
    val numsArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)
    println(numsArray[0])
    println(numsArray.elementAt(0))
    //越界处理
    println(numsArray.elementAtOrElse(6) { -1 })
    println(numsArray.elementAtOrNull(6) ?: "empty element")

    //list集合转数组
    val charArray = listOf('a', 'b', 'c').toCharArray()
    println(charArray)

    //对象数组
    val objArray = arrayOf(File("aaa"), File("bbb"), File("ccc"))
}