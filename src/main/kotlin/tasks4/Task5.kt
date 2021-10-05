package tasks4

fun main()
{
    var n = 10
    var i = 1
    var factorial = 1
    while (i<=n)
    {
        factorial *= i
        i++
        println(factorial)
    }
}