package tasks4

fun main()
{
    var a = 54
    var b = 72

    while (a!=0 && b!=0)
    {
        if(a>=b)
        {
            a=a%b

        }
        else
        {
            b=b%a
        }

    }
    println(a+b)
}