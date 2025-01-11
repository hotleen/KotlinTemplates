package com.template.derry.s11

/**
 * author: jack hu
 * @Create: 2025-01-11 17:23
 * @Description:扩展文件
 **/

// 默认public 对父类iterable扩展
fun <E> Iterable<E>.randomItem() = this.shuffled().first()