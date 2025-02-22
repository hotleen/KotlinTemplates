package com.template.derry.s7

/**
 * author: jack hu
 * @Create: 2024-01-27 10:00
 * @Description: lateinit（late initialization，延迟初始化）用于延迟 var 属性的初始化，让它在稍后再赋值，而不是在声明时立即初始化
 **/
class KTBase78 {
    // 先定义 使用时再初始化 必须用var 延时加载
    lateinit var responseResultInfo: String

    fun loadInfo() {
        responseResultInfo = "server end message"
    }

    fun showInfo() {
        // 必须这样判断懒加载变量是否进行了初始化 不可以直接使用变量为空判断
        //:: 用于引用 lateinit 变量的元数据，isInitialized 检查它是否已经赋值
        if (!::responseResultInfo.isInitialized) {
            println("not initialize")
        } else {
            println("info: $responseResultInfo")
        }
    }
}

fun main() {
    val obj = KTBase78()
//    obj.loadInfo()
    obj.showInfo()
}