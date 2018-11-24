package com.nujnay.kotlinstady

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var acc = Account()
        acc add 100.00
        Log.d("onCreateonCreate", acc.balance.toString())

    }

    infix fun Int.add(x: Int): Int {
        return this + x
    }
}
