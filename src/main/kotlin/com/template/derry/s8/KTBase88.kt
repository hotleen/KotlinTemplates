package com.template.derry.s8

/**
 * author: jack hu
 * @Create: 2024-01-30 20:40
 * @Description:
 **/
open class KTBase88 {

    open fun add(info: String) = println("KTBase88 add $info")

    open fun delete(info: String) = println("KTBase88 add $info")
}

fun main() {
    // 匿名对象实现
    val p: KTBase88 = object : KTBase88() {
        override fun add(info: String) {
            // super.add(info)
            println("匿名对象 add:$info")
        }

        override fun delete(info: String) {
            // super.delete(info)
            println("匿名对象 del:$info")
        }
    }
    p.add("jack")
    p.delete("jassy")

    //具名对象
    val p2 = KTBase88Impl()
    p2.add("amy")

    //接口实现
    val p3 = object : Runnable{
        override fun run() {
            println("running ...")
        }
    }

    p3.run()
}

class KTBase88Impl : KTBase88() {
    override fun add(info: String) {
        // super.add(info)
        println("具名对象 add:$info")
    }

    override fun delete(info: String) {
        // super.delete(info)
        println("具名对象 del:$info")
    }
}