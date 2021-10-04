package tasks3

fun main()
{
    var a = 20
    var b = 10
    if(a!=b)
    {
        val c = a+b
        a=c
        b=c
        println("$a $b")
    }
    else if(a==b)
    {
        a=0
        b=0
        println("$a $b")

    }

}