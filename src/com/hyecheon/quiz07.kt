package com.hyecheon

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    var checkDate = LocalDate.of(1964, 10, 10)
    val endDate = LocalDate.of(2020, 7, 24)
    while (checkDate.isBefore(endDate)) {
        val date = checkDate.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
        val toInt = date.toInt()
        val toString = toInt.toString(2)
        if (toString.reversed() == toString) {
            println(checkDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
        }
        checkDate = checkDate.plusDays(1)
    }
}