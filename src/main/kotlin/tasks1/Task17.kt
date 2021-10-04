package tasks1

import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{

    val x1 = 5.0
    val y1 = 6.0
    val x2 = 7.0
    val y2 = 8.0

    val l = sqrt((x2 - x1)).pow(2.0) + sqrt(y2 - y1).pow(2.0)
    println(l)

}