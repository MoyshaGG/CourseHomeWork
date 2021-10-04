package tasks1

fun main()
{
    var a = 1
    var b = 2
    var c = 3
    println("$a,$b,$c")
    var temp = c
    c = a
    a = b
    b = temp
    println("$a,$b,$c")



}