package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/10/22
Filename: Activity01-F.kt
Exercise No.: 6
*/

fun main(){

    println("Type a word: ")
    var str1 : String = readln()
    var str2 : String = str1.reversed()

    //checking
    if (str1 == str2) {
        println("The word $str1 that you entered is a Palindrome")
    }else{
        println("Sorry, but $str1 is not a Palindrome word")
        println("Reversed word of $str1 is $str2")
    }

}