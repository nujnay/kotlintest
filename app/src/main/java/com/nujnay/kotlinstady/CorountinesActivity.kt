package com.nujnay.kotlinstady

import android.app.Activity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CorountinesActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        oneTest()
    }

    fun oneTest() {
        Log.d("Corountines", "1")
        GlobalScope.launch(start = CoroutineStart.DEFAULT) {
            delay(1000)
            Log.d("Corountines", "child_1")
        }
        Log.d("Corountines", "2")
        GlobalScope.launch(start = CoroutineStart.DEFAULT) {
            delay(1000)
            Log.d("Corountines", "child_2")
        }
        Log.d("Corountines", "3")
        GlobalScope.launch(start = CoroutineStart.DEFAULT) {
            delay(1000)
            Log.d("Corountines", "child_3")
        }
        Log.d("Corountines", "4")
    }
}