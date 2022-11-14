package  Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 7
*/

fun  main(){

    println("Enter first number:" )
    var num1 : Int = readln().toInt()

    println("Enter second number:" )
    var num2 : Int = readln().toInt()

    if (num1 > num2){
        println("$num2 is smaller than $num1")
    }else if (num1 < num2){
        println("$num1 is smaller than $num2")
    }else{
        println("You must enter 2 different values")
    }

    print("Prime numbers is/are:  ")

    while (num1 < num2) {
        var condi = false

        for (i in 2..num1 / 2) {
            // condition for nonprime number
            if (num1 % i == 0) {
                condi = true
                break
            }
        }
        if (!condi)
            print("$num1 ")
        ++num1
    }

    while (num1 > num2) {
        var condi = false

        for (i in 2..num2 / 2) {
            // condition for nonprime number
            if (num2 % i == 0) {
                condi = true
                break
            }
        }
        if (!condi)
            print("$num2 ")
        ++num2
    }
    println("\nThank you")
}