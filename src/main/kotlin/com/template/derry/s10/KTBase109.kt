package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-12-15 8:20
 * @Description: out 协变 in 逆变，不变
 **/

interface Producer<out T> {

    // out T,表示T只能被读取，不能修改；只能作为输出，不能作为输入参数
//    fun consume(item: T) {
//
//    }

    fun producer(): T
}

interface Consumer<in T> {

    // in T,逆变，只能被修改，不能被读取
    fun consume(item: T) {

    }

    //不能被读取
//    fun producer() : T
}

interface ProducerAndConsumer<T> {
    // 不加是不变，能被修改、读取
    fun consume(item: T) {

    }

    //能被读取
    fun producer(): T
}

open class Animal

open class Humanity : Animal()

open class Man : Humanity()

open class Woman : Humanity()

class ProducerClaas1 : Producer<Animal> {
    override fun producer(): Animal {
        println("生产者 Animal")
        return Animal()
    }
}

class ProducerClaas2 : Producer<Humanity> {
    override fun producer(): Humanity {
        println("生产者 Humanity")
        return Humanity()
    }
}

class ProducerClaas3 : Producer<Man> {
    override fun producer(): Man {
        println("生产者 Man")
        return Man()
    }
}

class ProducerClaas4 : Producer<Woman> {
    override fun producer(): Woman {
        println("生产者 Woman")
        return Woman()
    }
}

fun main() {
    val p1: Producer<Animal> = ProducerClaas1() // ProducerClaas1传递的是Animal, 是可以的

    // 泛型默认情况下，泛型的子类对象不可以赋值给泛型的父类对象
    //out：泛型的父类对象可以赋值给子类对象
    //删除producer接口的out, p2,p3,p4都会报错
    //类似于java ? extends Animal
    val p2: Producer<Animal> = ProducerClaas2() //ProducerClaas2传递的是Humanity 不报错是因为out
    val p3: Producer<Animal> = ProducerClaas3() //ProducerClaas3传递的是Man 不报错是因为out
    val p4: Producer<Animal> = ProducerClaas4() //ProducerClaas4传递的是Woman 不报错是因为out
}