package tasks1

import kotlin.math.abs

fun main() {
    val x1 = 15
    val x2 = 20
    val y1 = 11
    val y2 = 14

    val ab = abs(y2 - y1)
    val bc = abs(x2 - x1)
    val p = 2*(ab+bc)
    val s = ab*bc

    println(p)
    println(s)

}