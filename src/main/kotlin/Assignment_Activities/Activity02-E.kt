package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 14
*/

/* Implementing Activity02-B using Classes*/

fun main() {
    //declared variables
    val schoolLibrary = SchoolLibrary()
    var conditional: Boolean = true
    var title: String  = " "
    var copies: Int = 0
    var author: String = " "
    var category: String = " "
    var location: String = " "
    var available: Int = 0
    var edition: Int = 0
    lateinit var book1: String
    lateinit var book2: String
    lateinit var book3: String
    lateinit var select: Number
    lateinit var exceed: Number
    lateinit var option: Number
    var total:Int
    var returnDate:String

    while (conditional) {
        println("---Select an option---")
        println("MAIN MENU: \n[1] List \n[2] Borrow \n[3] Return \n[0] Exit \nEnter here:")        //call to action
        println("----------------------------------")
        select = readln().toInt()
        println("----------------------------------")
        if (select == 1) {                                                                                      //option 1 -> adding new student
            println("<< List of books >>")
            println("system display...\n")
            schoolLibrary.searchBook()
            println("...display completed")
            println("----------------------------------")
            println("Branch Menu: \n[1] Search \n[2] Edit \n[3] Add \n[4] Delete \n[0] Exit \nEnter here:")
            println("----------------------------------")
            option = readln().toInt()
            if (option==1){
                println("<< List of books -> Search >>")
                println("system searching...")
                println("Enter book title:")
                title = readln()
                schoolLibrary.displayBook(title)
                println("\n...searching completed")
                println("----------------------------------")
            }else if (option==2){
                println("<< List of books -> Edit >>")
                println("system editing...")
                println("Title: ")
                title = readln()
                println("New author: ")
                author = readln()
                println("New category: ")
                category = readln()
                println("New edition: ")
                edition = readln().toInt()
                println("New copies: ")
                copies = readln().toInt()
                println("New location: ")
                location = readln()
                println("New availability: ")
                available = readln().toInt()
                schoolLibrary.editBook(title, author, category, edition, copies, location, available)
                println("\n...editing completed")
                println("----------------------------------")
            }else if (option==3){
                println("<< List of books -> Add >>")
                println("system adding...")
                println("Title: ")
                title = readln()
                println("Author: ")
                author = readln()
                println("Category: ")
                category = readln()
                println("Edition: ")
                edition = readln().toInt()
                println("Copies: ")
                copies = readln().toInt()
                println("Location: ")
                location = readln()
                println("Availability: ")
                available = readln().toInt()
                schoolLibrary.addBook(title, author, category, edition, copies, location, available)
                println("\n...adding completed")
                println("----------------------------------")
            }else if (option==4){
                println("<< List of books -> Delete >>")
                println("system deleting...")
                println("Title of a book: ")
                title = readln()
                schoolLibrary.deleteBook(title, author, category, edition, copies, location, available)
                println("\n...deleting completed")
                println("----------------------------------")
            }else{
                continue
            }
        }else if (select==2){
            println("<< Borrow a book >>")
            println("borrowing...")
            println("Book No.1:")
            book1 = readln()
            println("Book No.2:")
            book2 = readln()
            println("Book No.3:")
            book3 = readln()
            println("No. of books borrowed:")
            total = readln().toInt()
            println("Date of return:")
            returnDate = readln().toString()
            schoolLibrary.borrowBook(book1, book2, book3, total, returnDate)
            println("...borrowing completed")
            println("----------------------------------")
        }else if (select==3){
            println("<< Return a book >>")
            println("returning...")
            println("Book No.1:")
            book1 = readln()
            println("Book No.2:")
            book2 = readln()
            println("Book No.3:")
            book3 = readln()
            println("No. of books returned:")
            total = readln().toInt()
            println("Date of return:")
            returnDate = readln()
            println("Days exceed:")
            exceed = readln().toInt()
            schoolLibrary.returnBook(book1, book2, book3, total, returnDate, exceed)
            println("...returning completed")
            println("----------------------------------")
        }else{
            println("----------------------------------")
            println("<< Exiting the program >>")
            conditional = false
        }
    }
}

class SchoolLibrary {
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
    val borrowBooks = mutableMapOf<Int, String>(5 to "Structural Analysis", 9 to "Philippine Literature", 11 to "Fairy Tale")
    init {
        println("-------------------------------------------------------")
        println("************   Library Transaction System  ************")
        println("-------------------------------------------------------")
    }
    fun searchBook(){
        for (key in bookTitle.keys){
            println("Title: ${key.uppercase()} by:[ ${bookTitle[key]} ]")
        }
        println("\nThis directory contains ${(bookTitle.size)} data ")
    }
    fun displayBook(title:String){
        println("Title:      $title")
        println("Author:     ${(bookTitle[title])}")
        println("Category:   ${(bookTitle2[title])}")
        println("Edition:    ${(bookTitle3[title])}")
        println("Copies:     ${(bookTitle4[title])}")
        println("Location:   ${(bookTitle5[title])}")
        println("Available:  ${(bookTitle6[title])}")
    }
    fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        bookTitle.replace(title, author)
        bookTitle2.replace(title, category)
        bookTitle3.replace(title, edition)
        bookTitle4.replace(title, copies)
        bookTitle5.replace(title, location)
        bookTitle6.replace(title, available)
    }
    fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        bookTitle.put(key = title, value = author)
        bookTitle.put(key = title, value = category)
        bookTitle3.put(key = title, value = edition)
        bookTitle4.put(key = title, value = copies)
        bookTitle5.put(key = title, value = location)
        bookTitle6.put(key = title, value = available)
    }
    fun deleteBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        bookTitle.remove(title, author)
        bookTitle2.remove(title, category)
        bookTitle3.remove(title, edition)
        bookTitle4.remove(title, copies)
        bookTitle5.remove(title, location)
        bookTitle6.remove(title, available)
    }
    fun borrowBook(book1:String, book2:String, book3:String, total:Int, returnDate: String){
        println("Books borrowed: $book1 \n$book2 \n$book3 Total books borrowedL $total")
        println("Return the book on/before: $returnDate")
    }
    fun returnBook(book1:String, book2:String, book3:String, total:Int, returnDate: String, exceed:Int){
        println("Books borrowed: $book1 \n$book2 \n$book3 Total books borrowedL $total")
        println("Due date: $returnDate \nNo. of days exceeded: $exceed  \nPenalty amount: Php${exceed*50}.00")
    }
}