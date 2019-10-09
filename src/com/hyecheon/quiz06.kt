package com.hyecheon

fun main() {
    var sum = 0
    for (i in 2..10000 step 2) {
        if (calc(i)) {
            sum++
        }
    }
    print(sum)
}

private fun calc(x: Int): Boolean {
    var check = x * 3 + 1
    while (check != 1) {
        check = if (check % 2 == 0) {
            check / 2
        } else {
            check * 3 + 1
        }
        if (check == x) {
            return true
        }
    }
    return false
}

