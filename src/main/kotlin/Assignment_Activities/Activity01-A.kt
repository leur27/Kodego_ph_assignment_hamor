package Assignment_Activities

fun main() {
    /*
   Author: Ruel Hamor
   Date Created: 9/3/22
   Filename: Activity01-A.kt
   Exercise No.: 1
   */

    //Directory of 3 students only stored in the data bank namely: John, Peter & Mary

    println("Enter student's name:")

    var studentName: String = readLine()!!
    println("You entered $studentName")

    var student1 : String = "John"
    var age1 : Int = 21
    var section1 : Char = 'B'
    var enrolled1 : String = "Yes"
    var average1 : Double = 85.00

    var student2 : String = "Peter"
    var age2 : Int = 20
    var section2 : Char = 'C'
    var enrolled2 : String = "Yes"
    var average2 : Double = 80.00

    var student3 : String = "Mary"
    var age3 : Int = 19
    var section3 : Char = 'A'
    var enrolled3 : String = "Yes"
    var average3 : Double = 90.00

    if (studentName == student1) {
        println("John is $age1 years old of section $section1 with average $average1 and $enrolled1 he/she is currently enrolled")
    }

    if (studentName == student2) {
        println("Peter is $age2 years old of section $section2 with average $average2 and $enrolled2 he/she is currently enrolled")
    }

    if (studentName == student3) {
        println("Mary is $age3 years old of section $section3 with average $average3 and $enrolled3 he/she is currently enrolled")
    }

}