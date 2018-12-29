package com.nujnay.kotlinstady

import android.app.Activity
import android.os.Bundle
import android.util.Log

class FunActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var testL: Long? = 1000L
        Log.d("millisecond2dmy", testL?.millisecond2dmy())
        testL = null
        testL?.millisecond2dmy()
        Log.d("millisecond2dmy", testL?.millisecond2dmy() + "")
    }

}