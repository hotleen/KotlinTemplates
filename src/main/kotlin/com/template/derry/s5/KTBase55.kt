package com.template.derry.s5

/**
 * author: jack hu
 * @Create: 2023-12-24 11:11
 * @Description: takeIf: 判断返回true，返回调用本身，false，返回null
 **/

fun main() {
    checkPermissionAction("tom", "tom").let { println(it) }
    checkPermissionAction("root", "root").apply { println(this) }
}

//takeIf + ?:
fun checkPermissionAction(userName: String, userPwd: String): String {
    return userName.takeIf { checkRootPermission(userName, userPwd) } ?: "account: $userName, no privilege"
}

private fun checkRootPermission(userName: String, userPwd: String) = userName == "root" && userPwd == "root"