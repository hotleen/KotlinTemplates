package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-12-14 10:49
 * @Description:
 **/
class KTBase108<INPUT>(private val isR: Boolean, vararg objects: INPUT) {
    private val objectArray: Array<out INPUT> = objects

    //可能返回Array<out INPUT> 和null
    fun getR1(): Array<out INPUT>? = objectArray.takeIf { isR }

    //可能是Array<out INPUT> 和string ,用any
    fun getR2(): Any = objectArray.takeIf { isR } ?: "你是null了"

    //可能是Array<out INPUT> 和string 和null, 用any ?
    fun getR3(): Any? = objectArray.takeIf { isR } ?: "你是null了" ?: null

    fun getR4(index: Int): INPUT? = objectArray[index].takeIf { isR } ?: null

    fun getR5(index: Int): Any? = objectArray[index].takeIf { isR } ?: null ?: "AAA"

    //运算符重载
    operator fun get(index: Int): INPUT? = objectArray[index].takeIf { isR }
}

//泛型可以接收null，接收要做null处理
fun <INPUT> inputObj(item: INPUT) {
    println((item as String?)?.length ?: "its null value")
}

//只写class idea不会显示.kt文件 在class外写方法，会出现.kt文件后缀
fun main() {
    inputObj("Derry")
    inputObj(null)

    //运算符重载测试
    val p1: KTBase108<String?> = KTBase108(true, "tom", "jack", "amy", null)
    println(p1[0])
    println(p1[1])
    println(p1[2])
    println(p1[3])
}