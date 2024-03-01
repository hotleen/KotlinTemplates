package com.template.derry.s10

/**
 * author: jack hu
 * @Create: 2024-03-01 21:20
 * @Description:
 **/

abstract class BaseActivity {

    fun onCreate() {
        setContentView(getLayoutId())

        initView()

        initData()
    }

    private fun setContentView(layoutId:Int) = println("加载{$layoutId}布局文件中")

    abstract fun getLayoutId():Int

    abstract fun initView()

    abstract fun initData()
}

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int = 1234

    override fun initView() = println("init view...")

    override fun initData() = println("init data...")

    fun show() {
        super.onCreate()
    }
}

fun main() {
    MainActivity().show()
}