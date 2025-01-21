package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-21 20:38
 * @Description: filter 用于筛选
 **/
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val result = numbers.filter { it % 2 == 0 }   // 筛选偶数
        .map { it * 2 }           // 将每个偶数乘以 2
    println(result) // 输出: [4, 8, 12]
}