package com.nujnay.kotlinstady

class Account {
    var balance = 100.0

    infix fun add(amount: Double) {
        this.balance = balance + amount
    }
}