package com.hyecheon

import java.util.*
import kotlin.collections.ArrayList

val coins = arrayOf(500, 100, 50, 10)
fun main() {
//    val calc = calc(1000)
    val coins = ArrayDeque<Int>()
    val calc = calc(1000, 0, 15)
    println(calc)
}

private fun calc(target: Int, index: Int, coinCount: Int): Int {
    if (coinCount < 0) {
        return 0
    }
    if (target == 0) {
        return 1
    }
    if (target < 0) {
        return 0
    }
    if (index >= coins.size) {
        return 0
    }

    var count = 0
    val coin = coins[index]
    var sum = 0
    while (count * coin <= target) {
        sum += calc(target - count * coin, index + 1, coinCount - count)
        count++
    }
    return sum
}