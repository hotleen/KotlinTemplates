package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-26 22:39
 * @Description: 超类扩展
 **/

//超类Any扩展
fun Any.showPrintMsg() = println("content is $this")

fun main() {
    "chandler".showPrintMsg()

}