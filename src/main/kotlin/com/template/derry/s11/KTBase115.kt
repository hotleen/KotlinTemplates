package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-28 10:38
 * @Description:泛型函数扩展
 **/

fun <T> T.showContentInfo() =
    println("${if (this is String) "字符串长度是 ${this.length}" else "不是字符串，内容是$this"}")

fun main() {
    "jack".showContentInfo()
    123.showContentInfo()
    false.showContentInfo()
}