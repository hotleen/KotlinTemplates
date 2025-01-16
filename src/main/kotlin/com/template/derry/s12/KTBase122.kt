package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-16 22:02
 * @Description: 实现apply
 **/

fun main() {
    "123".myApply {
        println(this)
    }.myApply {
        println(this.length)
    }
}

/**
 * private 私有函数
 * inline 高阶函数使用内联对lambda进行优化 提高性能
 * fun <INPUT> 函数中声明泛型
 * INPUT.myApply 对所有类型扩展myApply
 * INPUT.() -> Unit 让匿名函数持有this lambda不需要返回值 永远返回INPUT本身
 * 返回this是为了链式调用
 */
private inline fun <INPUT> INPUT.myApply(lambda: INPUT.() -> Unit): INPUT {
    lambda(this) //lambda可以省略
    return this
}