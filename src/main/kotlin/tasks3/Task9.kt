package tasks3

fun main()
{
    var a = 15
    var b = 25
    var c = 30

    val sum1 = a+b
    val sum2 = a+c
    val sum3 = c+b
    if(sum1>sum2 && sum1>sum3 )
    {

        println("a+b = $sum1")
    }
    else if (sum2>sum1 && sum2>sum3)
    {
        println("a+c = $sum2")
    }
    else
    {
        println("c+b = $sum3")
    }
}