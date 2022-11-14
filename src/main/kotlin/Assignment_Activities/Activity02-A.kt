package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 10
*/

fun main() {

    //Data Structure: using Mutable Map collection
    val studentsData = mutableMapOf<Int, String>(1 to "John Doe", 2 to "Peter Pan", 3 to "Mary Me")
    val studentsData6 = mutableMapOf<Int, String>(1 to "Male", 2 to "Male", 3 to "Female")
    val studentsData5 = mutableMapOf<Int, String>(1 to "MM", 2 to "ILO", 3 to "CEB")
    val studentsData2 = mutableMapOf<Int, String>(1 to "A", 2 to "B", 3 to "C")
    val studentsData7 = mutableMapOf<Int, Double>(1 to 2.5, 2 to 2.0, 3 to 1.5)
    val studentsData4 = mutableMapOf<Int, Int>(1 to 123, 2 to 234, 3 to 345)
    val studentsData3 = mutableMapOf<Int, Int>(1 to 16, 2 to 17, 3 to 18)
    var conditional : Boolean = true
    lateinit var homeAddress:String
    lateinit var studentName:String
    lateinit var contactNo:Number
    lateinit var idNumber:Number
    lateinit var section:String
    lateinit var gender:String
    lateinit var select:Number
    lateinit var grade:Number
    lateinit var age:Number

    println("-------------------------------------------------------")
    println("****************   Student Directory   ****************")
    println("-------------------------------------------------------")

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
            studentsData.put(key = idNumber, value = studentName)
            println("Section: ")
            section = readln()
            studentsData2.put(key = idNumber, value = section)
            println("Age: ")
            age = readln().toInt()
            studentsData3.put(key = idNumber, value = age)
            println("Contact No.: ")
            contactNo = readln().toInt()
            studentsData4.put(key = idNumber, value = contactNo)
            println("Home Address: ")
            homeAddress = readln()
            studentsData5.put(key = idNumber, value = homeAddress)
            println("Gender: ")
            gender = readln()
            studentsData6.put(key = idNumber, value = gender)
            println("General Average: ")
            grade = readln().toDouble()
            studentsData7.put(key = idNumber, value = grade)
            println("\n...Adding completed...")
            println("----------------------------------")
        }else if (select == 2) {                                                                                //option 2 -> search for student's data
            println("----------------------------------")                                                       //display of values
            println("<< Searching for a data >>")
            println("Enter student ID: ")
            idNumber = readln().toInt()
            println("Searching for      $studentName with ID number $idNumber")
            println("Section:           ${(studentsData2[idNumber])}")
            println("Age:               ${(studentsData3[idNumber])}")
            println("Contact No:        ${(studentsData4[idNumber])}")
            println("Home Address:      ${(studentsData5[idNumber])}")
            println("Gender:            ${(studentsData6[idNumber])}")
            println("General Average:   ${(studentsData7[idNumber])}")
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
            studentsData.replace(idNumber, studentName)
            println("New section: ")
            section = readln()
            studentsData2.replace(idNumber, section)
            println("New age: ")
            age = readln().toInt()
            studentsData3.replace(idNumber, age)
            println("New contact no.: ")
            contactNo = readln().toInt()
            studentsData4.replace(idNumber, contactNo)
            println("New home address: ")
            homeAddress = readln()
            studentsData5.replace(idNumber, homeAddress)
            println("New gender: ")
            gender = readln()
            studentsData6.replace(idNumber, gender)
            println("New general average: ")
            grade = readln().toDouble()
            studentsData7.replace(idNumber, grade)
            println("...Edit completed...")
            println("----------------------------------")
        } else if (select == 4){                                                                                //option 4 -> adding new student
            println("----------------------------------")                                                       //remove function to delete values
            println("<< Deleting data >>")
            println("Enter student ID: ")
            idNumber = readln().toInt()
            println("Deleting data of $studentName with ID number $idNumber...")
            studentsData.remove(idNumber, studentName)
            studentsData2.remove(idNumber, section)
            studentsData3.remove(idNumber, age)
            studentsData4.remove(idNumber, contactNo)
            studentsData5.remove(idNumber, homeAddress)
            studentsData6.remove(idNumber, gender)
            studentsData7.remove(idNumber, grade)
            println("...Deletion completed...")
            println("----------------------------------")
        } else if (select == 5){                                                                                //option 5 -> display of all students
            println("<< Displaying all entries >>")                                                             //traversing the values, display size
            for (key in studentsData.keys){
                println("ID No.: $key   Student Name: ${studentsData[key]}")
            }
            println("\nThis directory contains ${(studentsData.size)} data ")
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

