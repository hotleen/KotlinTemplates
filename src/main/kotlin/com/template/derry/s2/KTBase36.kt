package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 17:35
 * @Description:?安全调用操作符
 **/
fun main() {
    var name:String ?= "jerry"
    name = null
    // name是可空类型的 如果真的是null，后面逻辑不执行
    // 即通过？进行了非空判断
    name?.capitalize()
}