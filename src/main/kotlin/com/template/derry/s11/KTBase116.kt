package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-29 15:27
 * @Description: let实现原理
 **/

fun main() {
    "jack".let {
        println(it)
    }
    "jack".myLet {
        println(it)
    }
}

/**
 * 自定义实现let
 * private 私有化
 * inline 高阶函数 用内联优化提高性能
 * fun<I,O> 在函数中，声明两个泛型，函数泛型，I输入泛型，O输出泛型
 * I.myLet 对I输入Input进行函数扩展，扩展函数名是myLet,意味所有类型都可以用xxx.myLet
 * : O 会根据用户的返回类型，变化而变化
 * lambda(this) 进行函数扩展，在整个扩展函数里面，this就是I输入本身
 */
private inline fun <I, O> I.myLet(lambda: (I) -> O) = lambda(this)