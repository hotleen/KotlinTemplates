package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2024-12-15 17:12
 * @Description: 泛型
 **/

class SetClass<in T>() {

    fun set1(item: T) {
        println("设置item为$item")
    }

    //泛型声明in 泛型类型T不能作为返回值，能被作为传入参数
//    fun get(): T? {
//        return null
//    }
}

class GetClass<out T>() {

    //泛型声明out 泛型类型T能作为返回值，不能被作为传入参数
//    fun set1(item: T) {
//        println("设置item为$item")
//    }


    fun get(): T? {
        return null
    }
}

