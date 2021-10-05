package tasks4

fun main()
{
    var money = 1000
    var p = 2
    var months = 0

    while(money<=1100)
    {
        money += (money/100)*p
        months++
    }
    println(months)

}