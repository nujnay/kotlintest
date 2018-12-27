package com.nujnay.kotlinstady

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var acc = Account()
        acc add 100.00
        Log.d("onCreateonCreate", acc.balance.toString())
        val l = mutableListOf(1, 2, 3)
        Log.d("mutableListOfd", l.toString())
        l.swap(0, 2) // “swap()”内部的“this”得到“l”的值
        Log.d("mutableListOfd", l.toString())


        for (num in 0..2) {
            Log.d("numnum", num.toString())
        }
        for (num in 0 until 2) {
            Log.d("numnum||", num.toString())
        }

        for (num in 1 until 2) {
            Log.d("numnum++", num.toString())
        }
        val x = 1
        when (x) {
            1 -> {
            }
            2 -> {
            }
            else -> {
            }
        }

        tv_test_click.clickDelay {
            Log.d("eeeeee", "2222222")
        }
        tv_test_click_2.clickDelay {
            Log.d("eeeeee", "33333")
        }
        var ss: sss? = sss()
        ss = null
        ss?.lll()

    }


    inner class sss {
        fun lll() {
            Log.d("llllll", "lll")
        }
    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // “this”对应该列表
        this[index1] = this[index2]
        this[index2] = tmp
    }
}
