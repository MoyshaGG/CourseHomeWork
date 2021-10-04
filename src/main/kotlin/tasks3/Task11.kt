package tasks3

import kotlin.math.pow

fun main()
{
    val x = 2.3
    var f :Double = if (x <= 0) {
        -x
    }else
    {
        if(x < 2 ){
            x.pow(x)
        }else{
            4.0
        }
    }
    println(f)
}