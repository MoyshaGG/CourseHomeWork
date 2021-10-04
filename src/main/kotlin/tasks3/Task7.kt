package tasks3

fun main()
{
    val a = -1
    val b = 2
    val c = 5
    if(a<b && a<c)
    {
        println(a)
    }
    else if(b<c&&b<a)
    {
        println(b)
    }
    else{
        println(c)
    }
}