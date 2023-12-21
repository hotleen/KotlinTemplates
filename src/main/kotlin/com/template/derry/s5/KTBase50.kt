package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-21 21:39
 * @Description:
 **/
fun main() {
    printInfo("Hello World!")
    printInfoWithApply("Hello Kotlin")
}

fun printInfoWithApply(info:String) {
    // apply函数返回info本身，也就是调用者本身，可以构成链式调用
    val infoNew:String = info.apply {
        //apply匿名函数不会持有it 会持有当前this对象
        println("info length: ${length}")
    }
}

fun printInfo(info:String){
    println("字符串长度是: ${info.length}")
    println("字符串最后一个字符是: ${info[info.length-1]}")
    println("字符转小写: ${info.toLowerCase()}")
}