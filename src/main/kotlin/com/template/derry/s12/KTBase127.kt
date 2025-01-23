package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-22 21:41
 * @Description:zip合并函数
 **/
fun main() {
    val names = listOf("sheldon", "amy", "penney")
    val ages = listOf(21, 23, 22,24)

    val mergedList = names.zip(ages)

    println(mergedList)
}