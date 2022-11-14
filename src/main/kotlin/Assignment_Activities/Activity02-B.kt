package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 11
*/

fun main() {

    //DATA STRUCTURE: using Mutable Map Collection implemented from Activity01-B

    //Map of Title to: 1.Author, 2.Category, 3.Edition. 4.Copies, 5.Location, 6.Availability
    val bookTitle = mutableMapOf<String, String>(
        "Structural Analysis" to "Diego Inocensio",
        "Philippine Literature" to "Jesus Menoy",
        "Fairy Tale" to "Stephen King"
    )
    val bookTitle2 = mutableMapOf<String, String>(
        "Structural Analysis" to "Engineering",
        "Philippine Literature" to "English",
        "Fairy Tale" to "Fiction"
    )
    val bookTitle3 = mutableMapOf<String, Int>(
        "Structural Analysis" to 2013,
        "Philippine Literature" to 2009,
        "Fairy Tale" to 2018
    )
    val bookTitle4 =
        mutableMapOf<String, Int>("Structural Analysis" to 5, "Philippine Literature" to 9, "Fairy Tale" to 11)
    val bookTitle5 = mutableMapOf<String, String>(
        "Structural Analysis" to "A5",
        "Philippine Literature" to "B3",
        "Fairy Tale" to "C1"
    )
    val bookTitle6 =
        mutableMapOf<String, Int>("Structural Analysis" to 5, "Philippine Literature" to 9, "Fairy Tale" to 11)

    //Map of Author to: 1.Title, 2.Category, 3.Edition. 4.Copies, 5.Location, 6.Availability
    val bookAuthor = mutableMapOf<String, String>(
        "Diego Inocensio" to "Structural Engineering",
        "Jesus Menoy" to "Philippine Literature",
        "Stephen King" to "Fairy Tale"
    )
    val bookAuthor2 = mutableMapOf<String, String>(
        "Diego Inocensio" to "Engineering",
        "Jesus Menoy" to "English",
        "Stephen King" to "Fiction"
    )
    val bookAuthor3 =
        mutableMapOf<String, Int>("Diego Inocensio" to 2013, "Jesus Menoy" to 2009, "Stephen King" to 2018)
    val bookAuthor4 = mutableMapOf<String, Int>("Diego Inocensio" to 5, "Jesus Menoy" to 9, "Stephen King" to 11)
    val bookAuthor5 = mutableMapOf<String, String>(
        "Diego Inocensio" to "A5",
        "Jesus Menoy" to "B3",
        "Stephen King" to "C1"
    )
    val bookAuthor6 = mutableMapOf<String, Int>("Diego Inocensio" to 5, "Jesus Menoy" to 9, "Stephen King" to 11)

    //Map of Transaction Code to: 1.Student Name, 2.Transaction Date, 3.Course & Year. 4.Total books borrowed, 5.Borrowed book1, 6.Borrowed book2, 7.Borrowed book3, 8.Due date
    val brTransCode = mutableMapOf<Int, String>(1 to "John Doe", 2 to "Peter Pan", 3 to "Mary Me")
    val brTransCode2 = mutableMapOf<Int, String>(1 to "Sept. 1, 2022", 2 to "Sept. 11, 2022", 3 to "Sept. 21, 2022")
    val brTransCode3 = mutableMapOf<Int, String>(1 to "BSCE-3", 2 to "BSIT-2", 3 to "BSN-1")
    val brTransCode4 = mutableMapOf<Int, Int>(1 to 1, 2 to 1, 3 to 1)
    val brTransCode5 =
        mutableMapOf<Int, String>(1 to "Structural Analysis", 2 to "Philippine Literature", 3 to "Fairy Tale")
    val brTransCode6 = mutableMapOf<Int, String>(1 to " ", 2 to " ", 3 to " ")
    val brTransCode7 = mutableMapOf<Int, String>(1 to " ", 2 to " ", 3 to " ")
    val brTransCode8 = mutableMapOf<Int, String>(1 to "Sept. 8, 2022", 2 to "Sept. 18, 2022", 3 to "Sept. 28, 2022")

    //Map of Student Name to: 1.Transaction Code, 2.Transaction Date, 3.Course & Year. 4.Total books borrowed, 5.Borrowed book1, 6.Borrowed book2, 7.Borrowed book3, 8.Due date
    val brStudent = mutableMapOf<String, Int>("John Doe" to 1, "Peter Pan" to 2, "Mary Me" to 3)
    val brStudent2 = mutableMapOf<String, String>(
        "John Doe" to "Sept. 1, 2022",
        "Peter Pan" to "Sept. 11, 2022",
        "Mary Me" to "Sept. 21, 2022"
    )
    val brStudent3 = mutableMapOf<String, String>("John Doe" to "BSCE-3", "Peter Pan" to "BSIT-2", "Mary Me" to "BSN-1")
    val brStudent4 = mutableMapOf<String, Int>("John Doe" to 1, "Peter Pan" to 1, "Mary Me" to 1)
    val brStudent5 = mutableMapOf<String, String>(
        "John Doe" to "Structural Analysis",
        "Peter Pan" to "Philippine Literature",
        "Mary Me" to "Fairy Tale"
    )
    val brStudent6 = mutableMapOf<String, String>("John Doe" to " ", "Peter Pan" to " ", "Mary Me" to " ")
    val brStudent7 = mutableMapOf<String, String>("John Doe" to " ", "Peter Pan" to " ", "Mary Me" to " ")
    val brStudent8 = mutableMapOf<String, String>(
        "John Doe" to "Sept. 8, 2022",
        "Peter Pan" to "Sept. 18, 2022",
        "Mary Me" to "Sept. 28, 2022"
    )
    //declared variables
    var conditional: Boolean = true
    lateinit var title: String
    var category: String = " "
    var copies: Int = 0
    lateinit var author: String
    var location: String = " "
    var available: Int = 0
    var edition: Int = 0
    lateinit var input: Number
    lateinit var choose: Number
    var code: Int = 0
    var student: String = " "
    lateinit var yrCourse: String
    lateinit var bookCount: Number
    lateinit var book1: String
    lateinit var book2: String
    lateinit var book3: String
    lateinit var dueDate: String
    lateinit var select: Number
    lateinit var date: String
    lateinit var exceed: Number
    var penalty: Int = 0
    lateinit var option: Number

    println("-------------------------------------------------------")
    println("************   Library Transaction System  ************")
    println("-------------------------------------------------------")

    while (conditional){
        println("----------------------------------")
        println("---Select an option---")
        println("[1] Search \n[2] Borrow \n[3] Return \n[4] History \n[0] Exit \nEnter here:")        //call to action
        select = readln().toInt()
        println("----------------------------------")
        if (select == 1) {                                                                                      //option 1 -> adding new student
            println("----------------------------------")                                                       //put function for adding keys & values
            println("<< Search a book >>")
            println("Choose: \n[1] Search by title \n[2] Search by author \n[0] Exit \nEnter here: ")
            input = readln().toInt()
            if (input==1){
                println("----------------------------------")
                println("<< Search a book >>")
                println("Search by title...")
                title = readln()
                println("Title:      $title")
                println("Author:     ${(bookTitle[title])}")
                println("Category:   ${(bookTitle2[title])}")
                println("Edition:    ${(bookTitle3[title])}")
                println("Copies:     ${(bookTitle4[title])}")
                println("Location:   ${(bookTitle5[title])}")
                println("Available:  ${(bookTitle6[title])}")
                println("\n...Search completed")
                println("----------------------------------")
                println("Choose: \n[1] Edit \n[2] Display All \n[0] Exit: \nEnter here: ")
                choose = readln().toInt()
                if(choose==1){
                    println("----------------------------------")
                    println("<< Search a book >>")
                    println("Edit book details...")
                    println("New title: ")
                    title = readln()
                    println("New author: ")
                    author = readln()
                    bookTitle.replace(title, author)
                    bookTitle2.replace(title, category)
                    bookTitle3.replace(title, edition)
                    bookTitle4.replace(title, copies)
                    bookTitle5.replace(title, location)
                    bookTitle6.replace(title, available)
                    bookAuthor.replace(title, author)
                    bookAuthor2.replace(title, category)
                    bookAuthor3.replace(title, edition)
                    bookAuthor4.replace(title, copies)
                    bookAuthor5.replace(title, location)
                    bookAuthor6.replace(title, available)
                    println("New category: ")
                    category = readln()
                    bookTitle2.replace(title, category)
                    bookAuthor2.replace(author, category)
                    println("New edition: ")
                    edition = readln().toInt()
                    bookTitle3.replace(title, edition)
                    bookAuthor3.replace(author, edition)
                    println("New copies: ")
                    copies = readln().toInt()
                    bookTitle4.replace(title, copies)
                    bookAuthor4.replace(author, copies)
                    println("New location: ")
                    location = readln()
                    bookTitle5.replace(title, location)
                    bookAuthor5.replace(author, location)
                    println("New availability: ")
                    available = readln().toInt()
                    bookTitle6.replace(title, available)
                    bookAuthor6.replace(author, available)
                    println("\n...Edit completed")
                    println("----------------------------------")
                }else if (choose==2){
                    for (key in bookTitle.keys){
                        println("Book title.: $key   Author: ${bookTitle[key]}")
                    }
                }else{
                    continue
                }
            }else if(input==2){
                println("----------------------------------")
                println("<< Search a book >>")
                println("Search by author... ")
                author = readln()
                println("Author:     $author")
                println("Title:      ${(bookAuthor[author])}")
                println("Category:   ${(bookAuthor2[author])}")
                println("Edition:    ${(bookAuthor3[author])}")
                println("Copies:     ${(bookAuthor4[author])}")
                println("Location:   ${(bookAuthor5[author])}")
                println("Available:  ${(bookAuthor6[author])}")
                println("\n...Search completed")
                println("----------------------------------")
                println("Choose: \n[1] Edit \n[2] Display All \n[0] Exit: \nEnter here: ")
                choose = readln().toInt()
                if(choose==1){
                    println("----------------------------------")
                    println("<< Search a book >>")
                    println("Edit book details...")
                    println("New title: ")
                    title = readln()
                    println("New author: ")
                    author = readln()
                    bookAuthor.replace(author, title)
                    bookAuthor2.replace(author, category)
                    bookAuthor3.replace(author, edition)
                    bookAuthor4.replace(author, copies)
                    bookAuthor5.replace(author, location)
                    bookAuthor6.replace(author, available)
                    bookTitle.replace(title, author)
                    bookTitle2.replace(title, category)
                    bookTitle3.replace(title, edition)
                    bookTitle4.replace(title, copies)
                    bookTitle5.replace(title, location)
                    bookTitle6.replace(title, available)
                    println("New category: ")
                    category = readln()
                    bookAuthor2.replace(author, category)
                    bookTitle2.replace(title, category)
                    println("New edition: ")
                    edition = readln().toInt()
                    bookAuthor3.replace(author, edition)
                    bookTitle3.replace(title, edition)
                    println("New copies: ")
                    copies = readln().toInt()
                    bookAuthor4.replace(author, copies)
                    bookTitle4.replace(title, copies)
                    println("New location: ")
                    location = readln()
                    bookAuthor5.replace(author, location)
                    bookTitle5.replace(title, location)
                    println("New availability: ")
                    available = readln().toInt()
                    bookAuthor6.replace(author, available)
                    bookTitle6.replace(title, available)
                    println("\n...Edit completed...")
                    println("----------------------------------")
                }else if (choose==2){
                    for (key in bookTitle.keys){
                        println("Book title.: $key   Author: ${bookTitle[key]}")
                    }
                }else{
                    continue
                }
            }else{
                continue
            }
        }else if (select == 2) {                                                                                //option 2 -> search for student's data
            println("----------------------------------")                                                       //display of values
            println("<< Borrow a book >>")
            println("Adding process...")
            println("Transaction Code: ")
            code = readln().toInt()
            brTransCode.put(key = code, value = student)
            brStudent.put(key = student, value = code)
            println("Student Name: ")
            student = readln()
            brTransCode.put(key = code, value = student)
            brStudent.put(key = student, value = code)
            println("Borrowing Date: ")
            date = readln()
            brTransCode2.put(key = code, value = date)
            brStudent2.put(key = student, value = date)
            println("Transaction Course & Year: ")
            yrCourse = readln()
            brTransCode3.put(key = code, value = yrCourse)
            brStudent3.put(key = student, value = yrCourse)
            println("Book no. 1: ")
            book1 = readln()
            brTransCode5.put(key = code, value = book1)
            brStudent5.put(key = student, value = book1)
            println("Book no. 2: ")
            book2 = readln()
            brTransCode6.put(key = code, value = book2)
            brStudent6.put(key = student, value = book2)
            println("Book no. 3: ")
            book3 = readln()
            brTransCode7.put(key = code, value = book3)
            brStudent7.put(key = student, value = book3)
            println("Total books borrowed: ")
            bookCount = readln().toInt()
            brTransCode4.put(key = code, value = bookCount)
            brStudent4.put(key = student, value = bookCount)
            println("Due date: ")
            dueDate = readln()
            brTransCode8.put(key = code, value = dueDate)
            brStudent8.put(key = student, value = dueDate)
            println("\n...Adding completed")
            println("----------------------------------")
        }else if (select == 3) {                                                                                //option 3 -> editing a student's info
            println("----------------------------------")                                                       //replace function to change values
            println("<< Returning a book >>")
            println("Removing transaction...")
            println("Transaction Code: ")
            code = readln().toInt()
            println("Student Name: ")
            student = readln()
            brTransCode.remove(code, student)
            brStudent.remove(student, code)
            println("Transaction Date: ")
            date = readln()
            brTransCode2.remove(code, date)
            brStudent2.remove(student, date)
            println("Transaction Course & Year: ")
            yrCourse = readln()
            brTransCode3.remove(code, yrCourse)
            brStudent3.remove(student, yrCourse)
            println("Book no. 1: ")
            book1 = readln()
            brTransCode5.remove(code, book1)
            brStudent5.remove(student, book1)
            println("Book no. 2: ")
            book2 = readln()
            brTransCode6.remove(code, book2)
            brStudent6.remove(student, book2)
            println("Book no. 3: ")
            book3 = readln()
            brTransCode7.remove(code, book3)
            brStudent7.remove(student, book3)
            println("Total books borrowed: ")
            bookCount = readln().toInt()
            brTransCode4.remove(code, bookCount)
            brStudent4.remove(student, bookCount)
            println("Due Date: ${(brTransCode8[code])}")
            println("How many days exceeded? ")
            exceed = readln().toInt()
            penalty = exceed * 50
            println("Total days exceed: $exceed, Penalty to pay: $penalty")
            println("\n...Removing completed")
        } else if (select == 4){                                                                                //option 4 -> adding new student
            println("----------------------------------")                                                       //remove function to delete values
            println("<< Transaction History >>")
            println("Choose: \n[1] Search Student's History \n[2] Display Book History \n[0] Exit \nEnter here: ")
            option = readln().toInt()
            if(option==1){
                println("----------------------------------")
                println("<< Transaction History >>")
                println("Enter student name: ")
                student = readln()
                println("Checking $student's history...")
                ("Code:    ${(brStudent[student])}")
                ("Date:    ${(brStudent2[student])}")
                ("Name:    ${(brStudent3[student])}")
                ("Crs/Yr:  ${(brStudent4[student])}")
                ("Total:   ${(brStudent5[student])}")
                ("Books:   ${(brStudent6[student])} \n         ${(brStudent7[student])} \n         ${(brStudent8[student])}")
                ("Due:     ${(brStudent7[student])}")
                println("Penalty: $penalty")
                println("----------------------------------")
            }else if(option==2){
                println("----------------------------------")
                println("<< Transaction History >>")
                println("Enter student name: ")
                student = readln()
                println("Checking $student's history...")
                ("Title:        ${(bookAuthor[author])}")
                ("Author:       ${(bookTitle[title])}")
                ("Category:     ${(bookTitle2[title])}")
                ("Edition:      ${(bookTitle3[title])}")
                ("Copies:       ${(bookTitle4[title])}")
                ("Location:     ${(bookTitle5[title])}")
                ("Availability: ${(bookTitle6[title])}")
                println("Due/s: $penalty")
                println("----------------------------------")
            }else{
                continue
            }
        } else{                                                                                //option 5 -> display of all students
            println("<< Exiting the system >>")                                                             //traversing the values, display size
            conditional = false
        }

    }
    println("You may access the data again next time \nThank you...")
}