package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 11:22
 * @Description: Nothing 没有任何值
 **/

fun main() {

}

interface A {
    fun show()
}

/**
 * 这里的TODO 不是注释，调用子类show是会报错的
 */
class AImpl : A {
    override fun show() {
        TODO("Not yet implemented")
    }
}