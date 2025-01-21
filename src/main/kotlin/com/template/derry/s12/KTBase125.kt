package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-20 20:00
 * @Description: flatMap 是一个集合操作函数，常用于将嵌套集合展开并转换为单层集合。
 * 它对集合中的每个元素应用一个映射函数，然后将结果合并到一个单一的集合中
 **/


fun main() {
    val list = listOf(1, 2, 3)
    val result = list.flatMap { number ->
        listOf(number, number * 2) // 将每个数字映射为一个包含自己和其两倍的列表
    }
    println(result) // 输出：[1, 2, 2, 4, 3, 6]

}