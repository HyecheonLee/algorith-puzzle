package com.hyecheon

fun main() {
    fun checker(x: String): Boolean {
        return x.reversed() == x
    }

    var x: Int = 11
    while (true) {
        if (checker(x.toString()) and checker(x.toString(2)) and checker(x.toString(8))) {
            break
        }
        x += 2
    }
    print(x)
}
