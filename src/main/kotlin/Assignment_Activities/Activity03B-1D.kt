package Assignment_Activities

fun main(){

    print("---------------------------------------------------------------------------------------")
    println("\nThis machine solves the total amount of unlimited input amount and divided by a number ")
    println("---------------------------------------------------------------------------------------")

    //program starts here / declared variables
    var quotientOfNumbers = QuotientOfNumbers(0,1)
    var condi: Boolean = true
    var sum : Int = 0
    lateinit var answer: String
    lateinit var input: Number
    lateinit var div: Number

    while (condi) {                                              //loop statement / condition is true
        print("Would you like to continue? Y/N: ")              //call to action answerable only by Y / N
        answer = readln()
        if (answer == "Y" || answer == "y") {
            print("Enter an amount:")
            input = readln().toInt()
            sum += input
            quotientOfNumbers.getTotal(sum)

        } else if (answer == "N" || answer == "n") {
            println("\nTotal amount is $sum")
            condi = false
        }
    }
    //input a number here to divide the total amount
    println("\nDivide the total by how many? ")
    div = readln().toInt()
    quotientOfNumbers.setDivisor(div = div)

    println("THANK YOU!")
}

class QuotientOfNumbers(var total: Int = 0, var div: Int){

    fun getTotal(sum: Int){
        total = sum
    }

    fun setDivisor(div: Int):Int {
        var quotient: Int = (total / div)
        println("\nThe result is $quotient")
        println("Transaction completed")
        return quotient
    }
}