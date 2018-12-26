package com.nujnay.kotlinstady

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : Activity() {

    var aa = 1
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

        var a = {
            Log.d("eerrrfd", "xxxxssss")
        }
        aaa {
            Log.d("eerrrfd", "xxxxssss")
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

        var sss: Int? = 1
        sss = null
//        Log.d("sssssssss", sss?.toString())//崩溃
        GlobalScope.launch {
            // launch new coroutine in background and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            Log.d("zzzzzz", aa.toString()) // print after delay
        }
        aa = 33
    }


    inner class sss {
        fun lll() {
            Log.d("llllll", "lll")

        }

    }

    fun aaa(ccccdsdc: () -> Unit) {
    }

    infix fun Int.add(x: Int): Int {
        return this + x
    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1] // “this”对应该列表
        this[index1] = this[index2]
        this[index2] = tmp
    }
}
