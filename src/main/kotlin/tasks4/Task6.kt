package tasks4


fun main() {
    var n = 6
    var a1 = 11
    var a2 = 22
    var a3 = 33
    var a = 0
    println(a1)
    println(a2)
    println(a3)

    for(i in 4..n)
    {
        a = a3
        a3 = a3+a2-2*a1
        a1=a2
        a2=a
        println(a3)
    }
}