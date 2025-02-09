package com.template.derry.s13

/**
 * author: jack hu
 * @Create: 2025-02-09 9:14
 * @Description: JvmField JvmStatic注解，方便Java调用，同样是编译器额外生成变量或方法
 **/

class MyObject {
    companion object {
        @JvmField
        val place = "墨水湖公园"

        @JvmStatic
        fun showAction(name:String) = println("$name is going to $place")
    }
}