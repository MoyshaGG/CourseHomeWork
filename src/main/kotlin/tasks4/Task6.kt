package tasks4


fun main() {
    var n = 6
    var a1 = 1
    var a2 = 2
    var a3 = 3
    println(a1)
    println(a2)
    println(a3)

    for(i in 4..n)
    {
        a3 = a3+a2-2*a1
        a1=a2
        // недороблено
    }
}