package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 13
*/

fun main(){
    //implementing Activity02-A using class
    val studentDirectory = StudentDirectory()
    var conditional : Boolean = true
    var homeAddress:String = " "
    var studentName:String = " "
    var contactNo:Int = 0
    var idNumber: Int
    var section:String = " "
    var gender:String = " "
    lateinit var select:Number
    var grade:Double = 0.0
    var age:Int = 0

    while (conditional){
        println("---Select an option---")
        println("[1] Add \n[2] Find \n[3] Edit \n[4] Delete \n[5] Display All \n[6] Exit \nEnter here:")        //call to action
        select = readln().toInt()
        if (select == 1) {                                                                                      //option 1 -> adding new student
            println("----------------------------------")                                                       //put function for adding keys & values
            println("<< Adding data >>")
            println("Student Name: ")
            studentName = readln()
            println("Student ID assigned: ")
            idNumber = readln().toInt()
            println("Section: ")
            section = readln()
            println("Age: ")
            age = readln().toInt()
            println("Contact No.: ")
            contactNo = readln().toInt()
            println("Home Address: ")
            homeAddress = readln()
            println("Gender: ")
            gender = readln()
            println("General Average: ")
            grade = readln().toDouble()
            studentDirectory.addData(idNumber, studentName, section, age, contactNo, homeAddress, gender,
                grade)
            println("\n...Adding completed...")
            println("----------------------------------")
        }else if (select == 2) {                                                                                //option 2 -> search for student's data
            println("----------------------------------")                                                       //display of values
            println("<< Searching for a data >>")
            println("Enter student ID: ")
            idNumber = readln().toInt()
            studentDirectory.findData(idNumber)
            println("\n...Search completed...")
            println("----------------------------------")
        }else if (select == 3) {                                                                                //option 3 -> editing a student's info
            println("----------------------------------")                                                       //replace function to change values
            println("<< Editing a data >>")
            println("Enter student ID: ")
            idNumber = readln().toInt()
            println("New student name: ")
            studentName = readln()
            println("Editing data of $studentName with ID number $idNumber")
            println("New section: ")
            section = readln()
            println("New age: ")
            age = readln().toInt()
            println("New contact no.: ")
            contactNo = readln().toInt()
            println("New home address: ")
            homeAddress = readln()
            println("New gender: ")
            gender = readln()
            println("New general average: ")
            grade = readln().toDouble()
            studentDirectory.editData(idNumber, studentName, section, age, contactNo, homeAddress, gender,
                grade)
            println("...Edit completed...")
            println("----------------------------------")
        } else if (select == 4){                                                                                //option 4 -> adding new student
            println("----------------------------------")                                                       //remove function to delete values
            println("<< Deleting data >>")
            println("Enter student ID: ")
            idNumber = readln().toInt()
            println("Deleting data of $studentName with ID number $idNumber...")
            studentDirectory.deleteData(idNumber, studentName, section, age, contactNo, homeAddress, gender,
                grade)
            println("...Deletion completed...")
            println("----------------------------------")
        } else if (select == 5){                                                                                //option 5 -> display of all students
            println("<< Displaying all entries >>")                                                             //traversing the values, display size
            studentDirectory.displayStudentName()
            println("...Display completed...")
            println("----------------------------------")
        } else{
            println("----------------------------------")
            println("<< Exiting the program >>")
            conditional = false
        }
    }
    println("You may access the data again next time \nThank you...")

}

class StudentDirectory(){

    private val studentsData = mutableMapOf(1 to "John Doe", 2 to "Peter Pan", 3 to "Mary Me")
    private val studentsData6 = mutableMapOf(1 to "Male", 2 to "Male", 3 to "Female")
    private val studentsData5 = mutableMapOf(1 to "MM", 2 to "ILO", 3 to "CEB")
    private val studentsData2 = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    private val studentsData7 = mutableMapOf(1 to 2.5, 2 to 2.0, 3 to 1.5)
    private val studentsData4 = mutableMapOf(1 to 123, 2 to 234, 3 to 345)
    private val studentsData3 = mutableMapOf(1 to 16, 2 to 17, 3 to 18)
    init{
        println("-------------------------------------------------------")
        println("****************   Student Directory   ****************")
        println("-------------------------------------------------------")
    }
    //adding data functions
    fun addData(idNumber: Int, studentName: String, section: String, age: Int, contactNo: Int, homeAddress: String, gender: String, grade: Double){
        studentsData.put(key = idNumber, value = studentName)
        studentsData2.put(key = idNumber, value = section)
        studentsData3.put(key = idNumber, value = age)
        studentsData4.put(key = idNumber, value = contactNo)
        studentsData5.put(key = idNumber, value = homeAddress)
        studentsData6.put(key = idNumber, value = gender)
        studentsData7.put(key = idNumber, value = grade)
    }

    //displaying names functions
    fun displayStudentName(){
        for (key in studentsData.keys){
            println("ID No.: $key   Student Name: ${studentsData[key]}")
        }
        println("\nThis directory contains ${(studentsData.size)} data ")
    }

    //deleting data functions
    fun deleteData(idNumber: Int, studentName: String, section: String, age: Int, contactNo: Int, homeAddress: String, gender: String, grade: Double){
        studentsData.remove(idNumber, studentName)
        studentsData2.remove(idNumber, section)
        studentsData3.remove(idNumber, age)
        studentsData4.remove(idNumber, contactNo)
        studentsData5.remove(idNumber, homeAddress)
        studentsData6.remove(idNumber, gender)
        studentsData7.remove(idNumber, grade)
    }

    //finding data functions
    fun findData(idNumber: Int){
        println("Searching for data of ID# $idNumber")
        println("Section:           ${(studentsData[idNumber])}")
        println("Section:           ${(studentsData2[idNumber])}")
        println("Age:               ${(studentsData3[idNumber])}")
        println("Contact No:        ${(studentsData4[idNumber])}")
        println("Home Address:      ${(studentsData5[idNumber])}")
        println("Gender:            ${(studentsData6[idNumber])}")
        println("General Average:   ${(studentsData7[idNumber])}")
    }

    //editing data functions
    fun editData(idNumber: Int, studentName: String, section: String, age: Int, contactNo: Int, homeAddress: String, gender: String, grade: Double){
        studentsData.replace(idNumber, studentName)
        studentsData2.replace(idNumber, section)
        studentsData3.replace(idNumber, age)
        studentsData4.replace(idNumber, contactNo)
        studentsData5.replace(idNumber, homeAddress)
        studentsData6.replace(idNumber, gender)
        studentsData7.replace(idNumber, grade)
    }
}