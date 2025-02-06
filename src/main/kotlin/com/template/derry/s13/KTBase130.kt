package com.template.derry.s13

/**
 * author: jack hu
 * @Create: 2025-02-06 21:30
 * @Description:单例模式
 **/
//饿汉式单例
object HungrySingleton

//懒汉式单例
class LazySingleton {
    companion object {
        private var instance : LazySingleton ? = null
            get()  {
                if (field == null) {
                    field = LazySingleton()
                }
                return field
            }
        fun getInstanceAction() = instance!!
    }
}