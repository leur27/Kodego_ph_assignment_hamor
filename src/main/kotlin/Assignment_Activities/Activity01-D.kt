package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/7/22
Filename: Activity01-D.kt
Exercise No.: 4
*/
fun main(){

    print("---------------------------------------------------------------------------------------")
    println("\nThis machine solves the total amount of unlimited input amount and divided by a number ")
    println("---------------------------------------------------------------------------------------")

    //program starts here / declared variables
    var condi : Boolean = true
    var total : Double = 0.00
    var answer : String = " "
    var input : Double = 0.00
    var div : Double = 0.00
    var quotient : Double = 0.00

    while (condi){                                              //loop statement / condition is true
        print("Would you like to continue? Y/N: ")
        answer = readln()

        if (answer == "Y" || answer == "y"){                    //condition for answer Yes & receives uppercase / lowercase Y
            print("Enter an amount:")
            input = readln().toDouble()
            total += input                                      //accumulate the amount inputs

        }else if(answer == "N" || answer == "n"){
            println("\nTotal amount is $total")

            condi = false                                       //condition becomes false / terminate the loop
        }
    }

    println("\nDivide the total by how many? ")                 //input a number here to divide the total amount
    div = readln().toDouble()
    //checking: dividend & divisor must be both greater than 0 to execute division
    if (total > 0 && div > 0){
        quotient = total/div
        println("\nThe result is $quotient")
        println("\nTransaction completed")
    }else {
        println("\nInvalid Input")
        println("\nPlease Try Again")
    }

    println("THANK YOU!")

}