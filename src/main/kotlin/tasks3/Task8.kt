package tasks3

fun main()
{
    val a = 6
    val b = 5
    val c = 4

    if(a<b && a>c || a>b && a<c)
    {
        println("a = $a ")
    }
    else if(b<c && b>a || b>c && b<a)
    {
        println("b = $b ")

    }
    else {
        println("c = $c ")
    }
}