package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-27 18:15
 * @Description: object关键字修饰类 声明类的同时创建一个类的单例对象
 * ✅ object 修饰 class 表示单例类，全局唯一，自动初始化。
 * ✅ companion object 用于类内部，模拟静态方法（类似 Java 的 static）。
 * ✅ object 可以作为匿名对象，适用于回调、监听器。
 * ✅ object 可以继承类或实现接口，但不能有主构造函数。
 **/
object KTBase87 {
    init {
        println("KTBase87 init...")
    }

    fun show() = println("show function")
}

fun main() {
    //
    println(KTBase87)
    println(KTBase87)
    println(KTBase87)

    KTBase87.show()
}
