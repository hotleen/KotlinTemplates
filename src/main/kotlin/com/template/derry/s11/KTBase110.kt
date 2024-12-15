package com.template.derry.s11

import com.template.derry.s10.*

/**
 * author: jack hu
 * @Create: 2024-12-15 10:48
 * @Description: in 逆变
 **/


class ConsumerClaas1 : Consumer<Animal> {
    override fun consume(item: Animal) {
        println("消费者 Animal")
    }
}

class ConsumerClaas2 : Consumer<Humanity> {
    override fun consume(item: Humanity) {
        println("消费者 Humanity")
    }
}

class ConsumerClaas3 : Consumer<Man> {
    override fun consume(item: Man) {
        println("消费者 Man")
    }
}

class ConsumerClaas4 : Consumer<Woman> {
    override fun consume(item: Woman) {
        println("消费者 Woman")
    }
}

fun main() {

    // 默认情况下：泛型具体处的父类是不可以赋值给泛型声明处的子类
    //in效果类似于 ? super Animal
    val p1: Consumer<Man> = ConsumerClaas1() // 这里可以用Man子类接收父类泛型Animal,是因为in
    val p2: Consumer<Woman> = ConsumerClaas2()
}