package tasks1
import kotlin.math.sqrt
fun main()
{
    val a = 5.0
    val b = 6.0
    val c = sqrt((a*a)+(b*b))
    val p = a+b+c
    println("Гіпотенуза: $c")
    println("Периметр: $p")
}