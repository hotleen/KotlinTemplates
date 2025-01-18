package com.template.derry.s12

/**
 * author: jack hu
 * @Create: 2025-01-18 21:48
 * @Description: DSL学习
 **/
class Context {
    val info = "我就是Sheldon"
    val name = "sheldon"

    fun toast(str: String) = println("toast:$str")
}

inline fun Context.apply1(lambda: Context.(String)->Unit) : Context {
    lambda(info)
    return this
}

fun main() {
    //其实apply1函数 就是DSL编程范式，定义输入输出等规则：
    //1.定义整个lambda规则标准，输入必须是Context类对象 才有资格调用apply1函数，匿名函数持有it和this
    //2.定于i真个lambda规则标准，输出始终会返回Context本身 可以链式调用
    //然后main函数可以根据DSL编程范式表重规则，来写具体的实现，这就是DSL编程范式
    val context = Context().apply1 {
        toast("success")
        toast(it)
        toast(name)
    }

    println(context.info)
}