package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-24 9:56
 * @Description:
 * with函数 返回类型根据函数最后一行 持有的是this
 *
 *  函数	适用场景	                    作用域参数	    返回值	            适合情况
    let	    适用于可空对象，链式调用	        it	        lambda结果	        适用于对非空对象执行操作，并返回计算值
    apply	初始化对象	                    this	    原对象	            适用于配置对象属性，返回自身
    run	    直接调用代码块，或者可空对象调用	this	    lambda 结果	        适用于执行代码并返回结果
    with	访问同一对象的多个属性或方法	    this	    lambda 结果	        适用于不需要返回对象本身的情况
    also    适用于执行额外操作（如日志、调试） it          原对象
 *
 **/
fun main() {
    testWith()
}

fun testWith() {
    val str = "Hello World"
    val len = with(str, ::getStrLength)
    with(len, ::printLen)
    // 内部持有的是this对象
    with(str) {
        println("pass parameter is $this")
    }
}

fun getStrLength(str: String) = str.length

fun printLen(len: Int) = println("str length is $len")