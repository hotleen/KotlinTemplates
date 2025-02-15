package com.template.derry.s1

/**
 * author: jack hu
 * @Create: 2023-12-03 11:22
 * @Description: Nothing 没有任何值 表示“无值”或“不可能完成”：用于函数永不返回或值不可能存在的场景,
 * 函数永远不会正常返回（异常/死循环）,TODO函数就返回Nothing
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