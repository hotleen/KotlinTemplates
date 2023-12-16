package com.template.derry.s2

/**
 * author: jack hu
 * @Create: 2023-12-16 17:28
 * @Description:
 **/
fun main() {
    //默认不可为空，穿空值会报错
    var name:String = "jack"
    name = "jerry"

    //声明是指定可以传空
    var nickName:String ?

    nickName = "yiii"
    nickName = null
}