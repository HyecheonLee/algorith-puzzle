package com.hyecheon

import java.util.*

val op = listOf("+", "-", "*", "/", "")
fun main() {
    /*val calcString = numberToString("9999")
    for (str in calcString) {
    }*/
//    println(calcString("1+2*34"))
    // 1 + 2 * 3 * 4
//    println(convert("1+2*34"))
    println(postfixCalc(listOf("1", "2", "3", "4", "*", "*", "+")))
}

fun transformExpr(expr: String) {
    var newExpr = ""
    var temp = arrayListOf<String>()
    var op = Stack<String>()
    for (ch in expr) {
        if (ch in '0'..'9') {
            newExpr += ch
        } else if (ch == '*' || ch == '/' || ch == '-' || ch == '+') {
            temp.add(newExpr)
        }
    }
}

fun postfixCalc(numbers: List<String>): String? {
    val temp = Stack<String>()
    for (number in numbers) {
        if (op.contains(number)) {
            val num2 = temp.pop()
            val num1 = temp.pop()
            temp.push(calc(num1.toInt(), num2.toInt(), number))
        } else {
            temp.push(number)
        }
    }
    return temp.pop()
}

fun calcString(str: String): MutableList<String> {
    val numberList: MutableList<String> = mutableListOf()
    val calc = Stack<String>()
    var tempNum = ""
    for (element in str) {
        val c = element
        if (c == '+') {
            if (calc.isEmpty()) {
                calc.push("+")
            } else {
                val pop = calc.pop()
                if (pop == "*" || pop == "/") {
                    numberList.add(pop)
                }
            }
            numberList.add(tempNum)
            tempNum = ""
        } else if (c == '-') {
            if (calc.isEmpty()) {
                calc.push("-")
            }
            numberList.add(tempNum)
            tempNum = ""
        } else if (c == '*') {
            if (calc.isEmpty()) {
                calc.push("*")
            }
            numberList.add(tempNum)
            tempNum = ""
        } else if (c == '/') {
            if (calc.isEmpty()) {
                calc.push("/")
            }
            numberList.add(tempNum)
            tempNum = ""
        } else tempNum += c
    }
    println(calc)
    numberList.add(tempNum)

    return numberList
}

fun calc(num1: Int, num2: Int, calString: String): String {
    if (calString == "*") {
        return (num1 * num2).toString()
    }
    if (calString == "/") {
        if (num2 != 0) {
            return (num1 / num2).toString()
        } else {
            return "0"
        }
    }
    if (calString == "-") {
        return (num1 - num2).toString()
    }
    if (calString == "+") {
        return (num1 + num2).toString()
    }
    return "0"
}

fun numberToString(num: String): List<String> {
    return if (num.length == 1) {
        listOf(num);
    } else {
        (1 until num.length).flatMap { index ->
            op.map { opcode: String? ->
                val pre = num.substring(0, index)
                val post = num.substring(index, num.length)
                var preList = numberToString(pre)
                var postList = numberToString(post)
                preList.map { x -> postList.map { y -> "$x$opcode$y" } }.flatten().distinct()
            }
        }.flatten().distinct()
    }
}