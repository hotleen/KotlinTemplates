package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-29 21:10
 * @Description: getOrElse 如果索引有效 ➝ 返回 List 中的元素 如果索引超出范围 ➝ 返回默认值（Lambda 表达式）
 * 避免 IndexOutOfBoundsException，安全访问 List 数据
 **/
fun main() {
    val list:List<String> = listOf("tom","jerry","frank")

    // 索引list取值,可能越界
    println(list[0])
    println(list[1])
    println(list[2])

    // 防止下标越界
    println(list.getOrElse(0){"empty"})
    println(list.getOrElse(3){"empty"})

    println(list.getOrNull(3)?:"out of bound")

}