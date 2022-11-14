package  Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 8
*/

fun main(){

    var condition: Boolean = true
    var available: Int = 0
    lateinit var select: Number

    while (condition){
        println("\nSelect an option \n[1] Display \n[2] Borrow \n[3] Return \n[0] Exit  \nEnter here:")
        select = readln().toInt()
        if (select == 1){
            println("<< Displaying all entries >>")                                                             //traversing the values, display size
            println("\nBook No.: 1  Book Title: Structural Analysis     Author: Diego Inocensio     Category: Engineering   Location: A5  Available: 10 ")
            println("\nBook No.: 2  Book Title: Philippine Literature   Author: Jesus Menoy         Category: English       Location: B3  Available: 10 ")
            println("\nBook No.: 3  Book Title: Fairy Tale              Author: Stephen King        Category: Fiction       Location: C1  Available: 10 ")
            println("\nThis directory contains 3 items ")
            println("...Display completed...")
            println("----------------------------------")
        }else if (select == 2){
            println("<< Borrow >>")
            println("borrowing...")
            println("Book no.: ")
            var bookNumber = readln().toInt()
            println("Book title: ")
            var bookTitle= readln()
            println("\nBook No.: $bookNumber  Book Title: $bookTitle    Available: Php ${available-1}")
            println("\n...adding completed")
            println("----------------------------------")
        }else if (select == 3){
            println("<< Returning >>")
            println("Returning...")
            println("Book no.: ")
            var bookNumber = readln().toInt()
            println("Book title: ")
            var bookTitle= readln()
            println("\nBook No.: $bookNumber  Book Title: $bookTitle    Available: Php ${available-1}")
            println("\n...adding completed")
            println("----------------------------------")
        }else if (select == 5){
            println(">>>  Exiting the system <<<")
            condition = false
        }
    }
    println("Thank you for using this program...")
}
