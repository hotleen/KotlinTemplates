package com.template.derry.s13

/**
 * author: jack hu
 * @Create: 2025-02-08 20:55
 * @Description: JvmField修饰，Java调用不需要通过get方法访问
 **/

class Person {
    @JvmField
    val names = listOf("sheldon", "amy", "penney", "howard")
}
