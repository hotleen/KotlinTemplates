package com.template.derry.s2

import java.util.*

/**
 * author: jack hu
 * @Create: 2023-12-17 10:21
 * @Description: !!断言
 **/

fun main() {
    var name:String ?=null

    name = "tom"

    /**
     * !! 不管name是否为null 都执行
     */
    val r = name!!.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() };

    println(r)
}