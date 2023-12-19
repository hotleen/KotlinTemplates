package com.template.derry.s4

/**
 * author: jack hu
 * @Create: 2023-12-19 21:50
 * @Description: 先觉条件函数
 **/
fun main() {
    var value:String ? = null
//    checkNotNull(value) java.lang.IllegalStateException: Required value was null.
//    requireNotNull(value) IllegalArgumentException: Required value was null.
    val result:Boolean = false
    require(result) // java.lang.IllegalArgumentException: Failed requirement.
}