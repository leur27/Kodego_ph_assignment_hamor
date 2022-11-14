package Assignment_Activities

/* Testing Activity02-E */

fun main() {
    //declared variables
    val schoolLibrary = SchoolLibraryForJUnit()
    var conditional = true
    var title  = " "
    var copies = 0
    var author = " "
    var category = " "
    var location = " "
    var available = 0
    var edition = 0
    lateinit var select: Number
    var exceed: Int
    lateinit var option: Number
    var returnDate = " "
    var borrowDate = " "
    var borrowerName = " "
    var book: String


    while (conditional) {
        println("MAIN MENU \n[1] List \n[2] Borrow \n[3] Return \n[0] Exit \nEnter here:")                      //call to action, main menu
        println("----------------------------------")
        select = readln().toInt()
        if (select == 1) {                                                                                      //selection 1 -> displaying book list
            println("<< List of books >>")
            println("system display...\n")
            schoolLibrary.listBook()
            println("...display completed")
            println("----------------------------------")
            println("Branch Menu: \n[1] Search \n[2] Edit \n[3] Add \n[4] Delete \n[0] Exit \nEnter here:")     //call to action, sub menu
            println("----------------------------------")
            option = readln().toInt()
            if (option==1){                                                                                     //option 1 -> searching book details
                println("<< List of books -> Search >>")
                println("system searching...")
                println("Enter book title:")
                title = readln()
                schoolLibrary.searchBook(title)
                println("\n...searching completed")
                println("----------------------------------")
            }else if (option==2){                                                                               //option 2 -> editing book details
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
            }else if (option==3){                                                                                   //option 3 -> adding a book entry
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
            }else if (option==4){                                                                                   //option 4 -> deleting a book entry
                println("<< List of books -> Delete >>")
                println("system deleting...")
                println("Title of a book: ")
                title = readln()
                schoolLibrary.deleteBook(title)
                println("\n...deleting completed")
                println("----------------------------------")
            }else{
                continue
            }
        }else if (select==2){                                                                                     //selection 2 -> borrowing a book
            println("<< Borrow a book >>")
            println("borrowing...")
            println("Borrowers name:")
            borrowerName = readln()
            println("Book Title:")
            book = readln()
            println("Date borrowed:")
            borrowDate = readln()
            println("Date of return:")
            returnDate = readln()
            schoolLibrary.borrowBook(book, returnDate, borrowDate, borrowerName)
            println("...borrowing completed")
            println("----------------------------------")
        }else if (select==3){                                                                                   //selection 3 -> returning a book
            println("<< Return a book >>")
            println("returning...")
            println("Borrowers name:")
            borrowerName = readln()
            println("Book Title:")
            book = readln()
            println("Date borrowed: $borrowDate")
            println("Date to return: $returnDate")
            println("Days exceeded:")
            exceed = readln().toInt()
            schoolLibrary.returnBook(book, returnDate, borrowDate, borrowerName)
            println("No. of days exceeded: $exceed  \nPenalty amount: Php${exceed*50}.00")
            println("...returning completed")
            println("----------------------------------")
        }else{                                                                                                  //end of program
            println("----------------------------------")
            println("<< Exiting the program >>")
            conditional = false
        }
    }
}

class SchoolLibraryForJUnit {

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
        mutableMapOf<String, Int>("Structural Analysis" to 10, "Philippine Literature" to 10, "Fairy Tale" to 10)
    val bookTitle5 = mutableMapOf<String, String>(
        "Structural Analysis" to "A5",
        "Philippine Literature" to "B3",
        "Fairy Tale" to "C1"
    )
    val bookTitle6 =
        mutableMapOf<String, Int>("Structural Analysis" to 10, "Philippine Literature" to 10, "Fairy Tale" to 10)

    init {
        println("-------------------------------------------------------")
        println("************   Library Transaction System  ************")
        println("-------------------------------------------------------")
    }
    //function used for displaying the book list
    fun listBook(): Boolean {
        for (key in bookTitle.keys){
            println("Title: ${key.uppercase()} by:[ ${bookTitle[key]} ]")
        }
        println("\nThis directory contains ${(bookTitle.size)} data ")
        return true
    }
    //function used for book entry details
    fun searchBook(title:String): Boolean{
        println("Title:      $title")
        println("Author:     ${(bookTitle[title])}")
        println("Category:   ${(bookTitle2[title])}")
        println("Edition:    ${(bookTitle3[title])}")
        println("Copies:     ${(bookTitle4[title])}")
        println("Location:   ${(bookTitle5[title])}")
        println("Available:  ${(bookTitle6[title])}")
        return true
    }
    //function used for editing a book entry
    fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int): Boolean{
        bookTitle.replace(title, author)
        bookTitle2.replace(title, category)
        bookTitle3.replace(title, edition)
        bookTitle4.replace(title, copies)
        bookTitle5.replace(title, location)
        bookTitle6.replace(title, available)
        return true
    }
    //function used for adding a book entry
    fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int): Boolean{
        bookTitle.put(key = title, value = author)
        bookTitle2.put(key = title, value = category)
        bookTitle3.put(key = title, value = edition)
        bookTitle4.put(key = title, value = copies)
        bookTitle5.put(key = title, value = location)
        bookTitle6.put(key = title, value = available)
        return true
    }
    //function used for deleting a book entry
    fun deleteBook(title: String): Boolean{
        bookTitle.remove(title)
        bookTitle2.remove(title)
        bookTitle3.remove(title)
        bookTitle4.remove(title)
        bookTitle5.remove(title)
        bookTitle6.remove(title)
        return true
    }
    //function used for borrowing a book
    fun borrowBook(book:String, returnDate: String, borrowDate: String, borrowerName: String): Boolean{
        if (bookTitle.contains(book)){
            when (book){
                "Structural Analysis" -> decrement(bookTitle6, "Structural Analysis")
                "Philippine Literature" -> decrement(bookTitle6, "Philippine Literature")
                "Fairy Tale" -> decrement(bookTitle6, "Fairy Tale")
                else -> decrement(bookTitle6, book)
            }

            for (key in bookTitle6.keys){
                println("Available: ${bookTitle6[key]}  Title: $key ")
            }
            println("\nBorrower: $borrowerName \nBook borrowed: $book \nDate borrowed: $borrowDate")
            println("Book must be returned on/before $returnDate")
        }else{
            println(("The book does not exist").uppercase())
        }
        return true
    }
    //function used for returning a book
    fun returnBook(book:String,  returnDate: String, borrowDate: String, borrowerName: String):Boolean{
        when (book){
            "Structural Analysis" -> increment(bookTitle6, "Structural Analysis")
            "Philippine Literature" -> increment(bookTitle6, "Philippine Literature")
            "Fairy Tale" -> increment(bookTitle6, "Fairy Tale")
            else -> increment(bookTitle6, book)
        }
        for (key in bookTitle6.keys){
            println("Available: ${bookTitle6[key]}  Title: $key ")
        }
        println("\nBorrower: $borrowerName \nBook returned: $book \nDate borrowed: $borrowDate \nDue date: $returnDate\n")
        return true
    }


    //private function used in borrowBook function, adds 1 copy per book borrowed
    private fun <K : Any> decrement(bookTitle6: MutableMap<String, Int>, key: K) {
        when (val count = bookTitle6[key.toString()])
        {
            null -> bookTitle6[key.toString()] = 1
            else -> bookTitle6[key.toString()] = count - 1
        }
    }
    //private function used in returnBook function, adds 1 copy per book returned
    private fun <K : Any> increment(bookTitle6: MutableMap<String, Int>, key: K) {
        when (val count = bookTitle6[key.toString()])
        {
            null -> bookTitle6[key.toString()] = 1
            else -> bookTitle6[key.toString()] = count + 1
        }
    }

}



