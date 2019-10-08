package com.hyecheon

import java.util.*

fun main() {
    val booleanArrayOf = BooleanArray(100)
    /*for (x in 2..100) {
        revers(booleanArrayOf, x - 1, x)
    }
    for ((index, value) in booleanArrayOf.withIndex()) {
        if (!value) {
            print(index + 1)
            print(" ")
        }
    }*/
    revers2()
}

private fun revers(booleanArray: BooleanArray, start: Int, num: Int): BooleanArray {
    var index = start
    while (index <= booleanArray.size) {
        booleanArray[index] = !booleanArray[index]
        index += num
    }
    return booleanArray
}

private fun revers2() {
    for (i in 1..100) {
        var flag = false
        for (j in 1..100) {
            if (i % j == 0)
                flag = !flag
        }
        if (flag) {
            print(i )
            print(" ")
        }
    }
}