package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-02 15:37
 * @Description:
 **/
class KTBase107<T>(vararg objects: T, var isMap: Boolean) {

    //vararg 动态参数
    //out表示T只能被读取 不能修改
    private val objectArray: Array<out T> = objects

    fun showObj(index: Int): T? = objectArray[index].takeIf { isMap }

    fun <O> mapObj(index: Int, mapAction: (T?) -> O): O? =
        mapAction(objectArray[index].takeIf { isMap })
}

fun main() {
    val p: KTBase107<Any?> = KTBase107("derry", false, null, 123.12f, 'c', isMap = true)

    println(p.showObj(0))
    println(p.showObj(1))

    val r = p.mapObj(0){
        // it需要转换一下类型
        it.toString().length
    }
    println(r)
}