package com.template.derry.s13

/**
 * author: jack hu
 * @Create: 2025-02-08 21:09
 * @Description:JvmOverloads注解，在编译环节专门重载一个函数，给Java调用，实现默认不传gender参数效果
 **/

@JvmOverloads
fun show(name: String, gender: Char = 'M') {
    println("name is $name, gender is $gender")
}