package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-19 22:40
 * @Description: substring range
 **/
fun main() {
    val info = "hello world"
    //info.indexOf('r'))为8 0 until 8 等价于 0..7，截取时不包含结束索引 until不包括右区间
    println(info.substring(0 until info.indexOf('r')))
}