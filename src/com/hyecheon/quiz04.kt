package com.hyecheon

fun main() {
    println(cutbar(3, 20))
    println(cutbar(5, 100))
    println(cutbar2(3, 20, 1, 0))
    println(cutbar2(5, 100, 1, 0))
}

private tailrec fun cutbar2(m: Int, n: Int, current: Int, count: Int): Int {
    return when {
        current >= n -> count
        current < m -> cutbar2(m, n, current * 2, count + 1)
        else -> cutbar2(m, n, current + m, count + 1)
    }
}

private fun cutbar(m: Int, n: Int): Int {
    var count = 0
    var current = 1
    while (n > current) {
        current +=
            if (current < m) {
                current
            } else {
                m
            }
        count++
    }
    return count
}