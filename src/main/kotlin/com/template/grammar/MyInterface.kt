package com.template.grammar

/**
 * author: jack hu
 * @Create: 2023-12-01 19:24
 * @Description:
 **/
interface MyInterface {
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}
class Child : MyInterface {
    override fun bar() {
        // 方法体
        println("bar")
    }
}
fun main(args: Array<String>) {
    val c =  Child()
    c.foo();
    c.bar();

}
