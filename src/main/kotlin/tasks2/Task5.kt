package tasks2

fun main()
{
    val n = 123
    val a = n/100
    val b = (n/10)%10
    val c = n%10
    val m = (b*100)+(a*10)+(c*1)
    println(m)

}