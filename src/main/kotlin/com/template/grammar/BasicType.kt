package com.template.grammar

/**
 * author: jack hu
 * @Create: 2023-11-26 10:06
 * @Description:
 **/

/**
 * 数组用类 Array 实现，并且还有一个 size 属性及 get 和 set 方法
 */
fun main(args: Array<String>) {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2
}
