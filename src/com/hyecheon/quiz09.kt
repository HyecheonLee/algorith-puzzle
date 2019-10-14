package com.hyecheon

fun main() {
    var m = Array(11) { Array(21) { 0 } }
    var boy = 21
    var girl = 11
    m[0][0] = 1
    for (i in 0..10) {
        for (j in 0..20) {
            if ((i != j && (boy - j != girl - i))) {
                if (j > 0) {
                    m[i][j] += m[i][j - 1]
                }
                if (i > 0) {
                    m[i][j] += m[i - 1][j]
                }
            }
        }
    }
    println(m[girl - 2][boy - 1] + m[girl - 1][boy - 2])
}