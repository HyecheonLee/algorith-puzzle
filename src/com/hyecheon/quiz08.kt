package com.hyecheon

var move = arrayOf(
    Pair(1, 0),
    Pair(-1, 0),
    Pair(0, 1),
    Pair(0, -1)
)


fun main() {
    var m = Array(100) { Array(100) { false } }
    m[50][50] = true
    println(robot(m, 50, 50, 12))
}

fun robot(map: Array<Array<Boolean>>, currentY: Int, currentX: Int, cnt: Int): Int {
    if (cnt == 0) {
        return 1
    }
    var sum = 0
    for (m in move) {
        val clone = map.copyOf()
        if (!clone[currentY + m.first][currentX + m.second]) {
            clone[currentY + m.first][currentX + m.second] = true
            sum += robot(clone, currentY + m.first, currentX + m.second, cnt - 1)
            clone[currentY + m.first][currentX + m.second] = false
        }
    }
    return sum
}