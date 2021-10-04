package tasks2

fun main()
{
    val n = 123
    println(n)
    val a = n/100
    val b = (n/10)%10
    val c = n%10
    val res = (b*100)+(c*10)+(a*1)
    println(res)
}