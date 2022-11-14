package Assignment_Activities.Activity04A

class CollectionOfBooks: UniversityLibrarySystem(), BookRegistrySystem{

    //Map of Books: Title to 1.Author, 2.Category, 3.Edition. 4.Copies, 5.Location, 6.Availability
    val bookTitle = mutableMapOf<String, String>("Structural Analysis" to "Diego Inocensio", "Philippine Literature" to "Jesus Menoy", "Fairy Tale" to "Stephen King")
    val bookTitle2 = mutableMapOf<String, String>("Structural Analysis" to "Engineering", "Philippine Literature" to "English", "Fairy Tale" to "Fiction")
    val bookTitle3 = mutableMapOf<String, Int>("Structural Analysis" to 2013, "Philippine Literature" to 2009, "Fairy Tale" to 2018)
    val bookTitle4 = mutableMapOf<String, Int>("Structural Analysis" to 10, "Philippine Literature" to 10, "Fairy Tale" to 10)
    val bookTitle5 = mutableMapOf<String, String>("Structural Analysis" to "A5", "Philippine Literature" to "B3", "Fairy Tale" to "C1")
    val bookTitle6 = mutableMapOf<String, Int>("Structural Analysis" to 10, "Philippine Literature" to 10, "Fairy Tale" to 10)

    var title  = " "
    var copies = 0
    var author = " "
    var category = " "
    var location = " "
    var available = 0
    var edition = 0


    override fun borrowBook(book:String, returnDate: String, borrowDate: String, borrowerName: String) {
//        super.borrowBook(book:String,  returnDate:String, borrowDate:String, borrowerName:String)
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
    }

    override fun returnBook(book:String,  returnDate: String, borrowDate: String, borrowerName: String) {
//        super.returnBook(book:String,  returnDate:String, borrowDate:String, borrowerName:String)
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
    }

    override fun listBook() {
        for (key in bookTitle.keys){
            println("Title: ${key.uppercase()} by:[ ${bookTitle[key]} ]")
        }
        println("\nThis list contains ${(bookTitle.size)} books.")
    }

    override fun searchBook(title:String){
        println("Title:      $title")
        println("Author:     ${(bookTitle[title])}")
        println("Category:   ${(bookTitle2[title])}")
        println("Edition:    ${(bookTitle3[title])}")
        println("Copies:     ${(bookTitle4[title])}")
        println("Location:   ${(bookTitle5[title])}")
        println("Available:  ${(bookTitle6[title])}")
    }

    override fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        bookTitle.replace(title, author)
        bookTitle2.replace(title, category)
        bookTitle3.replace(title, edition)
        bookTitle4.replace(title, copies)
        bookTitle5.replace(title, location)
        bookTitle6.replace(title, available)
    }

    override fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        bookTitle.put(key = title, value = author)
        bookTitle2.put(key = title, value = category)
        bookTitle3.put(key = title, value = edition)
        bookTitle4.put(key = title, value = copies)
        bookTitle5.put(key = title, value = location)
        bookTitle6.put(key = title, value = available)
    }

    override fun deleteBook(title: String){
        bookTitle.remove(title)
        bookTitle2.remove(title)
        bookTitle3.remove(title)
        bookTitle4.remove(title)
        bookTitle5.remove(title)
        bookTitle6.remove(title)
    }


    private fun <K : Any> decrement(bookTitle6: MutableMap<String, Int>, key: K) {
        when (val count = bookTitle6[key.toString()])
        {
            null -> bookTitle6[key.toString()] = 1
            else -> bookTitle6[key.toString()] = count - 1
        }
    }
    private fun <K : Any> increment(bookTitle6: MutableMap<String, Int>, key: K) {
        when (val count = bookTitle6[key.toString()])
        {
            null -> bookTitle6[key.toString()] = 1
            else -> bookTitle6[key.toString()] = count + 1
        }
    }
}