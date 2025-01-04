package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2025-01-04 18:51
 * @Description:空值扩展
 **/
fun String?.showStringValue(defaultValue: String) = println(this ?: defaultValue)

fun main() {
    val infoValue: String? = null
    infoValue.showStringValue("infoValue默认值")

    val msg: String? = "ServerLoginMsg"
    msg.showStringValue("msg默认值")
}