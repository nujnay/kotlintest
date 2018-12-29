package com.nujnay.kotlinstady

import java.util.*

fun Long.millisecond2dmy(): String {
    val calendar2 = Calendar.getInstance()
    calendar2.timeInMillis = this
    val year = calendar2.get(Calendar.YEAR)
    val month = calendar2.get(Calendar.MONTH) + 1
    val day = calendar2.get(Calendar.DAY_OF_MONTH)
    return day.toString() + "/" + month + "/" + year
}