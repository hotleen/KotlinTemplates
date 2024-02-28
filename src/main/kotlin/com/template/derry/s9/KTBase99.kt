package com.template.derry.s9

/**
 * author: jack hu
 * @Create: 2024-02-28 20:48
 * @Description: 数据类
 * 使用条件：1. 数据类至少必须有一个参数的主构造函数
 *          2. 数据类必须有参数 var val
 *          3. 数据类不能用abstract open sealed inner等修饰
 **/

data class LoginRequest(var info: String)

