package Assignment_Activities


fun main() {

    print("---------------------------------------------------------------------------------------")
    println("\nThis machine solves the total amount of unlimited input amount and divided by a number ")
    println("---------------------------------------------------------------------------------------")

    //program starts here / declared variables
    var condi: Boolean = true
    var total = 0.0
    lateinit var answer: String
    lateinit var input: Number
    lateinit var div: Number

//    try-catch block
    try {
        while (condi) {                                              //loop statement / condition is true
            print("Would you like to continue? Y/N: ")              //call to action answerable only by Y / N
            answer = readln()
            if (answer == "Y" || answer == "y") {
                print("Enter an amount:")
                input = readln().toDouble()
                total += input
            } else if (answer == "N" || answer == "n") {
                println("\nTotal amount is $total")
                condi = false
            }
        }
        //input a number here to divide the total amount
        println("\nDivide the total by how many? ")
        div = readln().toInt()
        val quotient: Number = (total / div)
        println("\nThe result is $quotient")
        println("\nTransaction completed")
    } catch (e:NumberFormatException) {
        println(e)
        println("Enter digits only")
    }
    println("THANK YOU!")
}
private operator fun Number.div(div: Int): Number {
    return div
}
