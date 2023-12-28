package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-28 22:43
 * @Description: takeUnless false:返回调用者本身 true 返回null
 **/

class Manager {
    private var infoValue: String? = null

    fun getInfoValue() = infoValue

    fun setInfoValue(infoValue: String?) {
        this.infoValue = infoValue
    }
}

fun main() {
    val manager = Manager()

    manager.getInfoValue().takeUnless { it.isNullOrBlank() } ?: "未经过初始化值".let {
        println(it)
    }


}
