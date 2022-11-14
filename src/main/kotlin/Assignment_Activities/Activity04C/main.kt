package Assignment_Activities


fun main(){

    val z = ArithmeticComputation()
    val num1: Int = 12
    val num2: Int = 5
    val num3: Byte = 12
    val num4: Byte = 5
    val num5: Double = 12.0
    val num6: Double = 5.0
    val num7: Float = 12.0f
    val num8: Float = 5.0f
    val num9: Long = 12L
    val num10: Long = 5L

    println("\nFor the two digits 12.0 and 5.0:")
    println("\nThe sum is ${z.computeMath(num1, num2)}")
    println("The difference is ${z.computeMath(num3, num4)}")
    println("The product is ${z.computeMath(num5, num6)}")
    println("The quotient is ${z.computeMath(num7, num8)}")
    println("The remainder is ${z.computeMath(num9, num10)}")

}

open class ArithmeticComputation(){

    fun computeMath(a: Int, b: Int):Int{
        return a+b
    }

    fun computeMath(c: Byte, d: Byte): Int {
        return c-d
    }

    fun computeMath(e: Double, f: Double):Double{
        return e*f
    }

    fun computeMath(g: Float, h: Float):Float{
        return g/h
    }

    fun computeMath(i: Long, j: Long):Long{
        return i%j
    }

}