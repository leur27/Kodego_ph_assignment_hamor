package Assignment_Activities.Activity04A

class CollectionOfPeriodicals : UniversityLibrarySystem(), PeriodicalsRegistrySystem {

    //Map of Periodicals: Name/Title to 1.Editor, 2.Type, 3.Publication Date. 4.Volume No., 5.Location, 6.Availability
    val periodicTitle = mutableMapOf<String, String>("Pacific Bulletin" to "JL Garcia", "Filipino Star" to " SL Mangubat", "Philippine Education" to "JE Martinez")
    val periodicTitle2 = mutableMapOf<String, String>("Pacific Bulletin" to "Newspaper", "Filipino Star" to "Magazine", "Philippine Education" to "Journal")
    val periodicTitle3 = mutableMapOf<String, Int>("Pacific Bulletin" to 2004, "Filipino Star" to 2016, "Philippine Education" to 2019)
    val periodicTitle4 = mutableMapOf<String, Int>("Pacific Bulletin" to 4, "Filipino Star" to 2, "Philippine Education" to 10)
    val periodicTitle5 = mutableMapOf<String, String>("Pacific Bulletin" to "A5", "Filipino Star" to "B3", "Philippine Education" to "C1")
    val periodicTitle6 = mutableMapOf<String, Int>("Pacific Bulletin" to 10, "Filipino Star" to 10, "Philippine Education" to 10)

    var title  = " "
    var year = 0
    var editor = " "
    var type = " "
    var location = " "
    var available = 0
    var volume: Int = 0


    override fun borrowBook(book:String, returnDate: String, borrowDate: String, borrowerName: String) {
//        super.borrowBook()
        if (periodicTitle.contains(book)){
            when (book){
                "Structural Analysis" -> decrement(periodicTitle6, "Structural Analysis")
                "Philippine Literature" -> decrement(periodicTitle6, "Philippine Literature")
                "Fairy Tale" -> decrement(periodicTitle6, "Fairy Tale")
                else -> decrement(periodicTitle6, book)
            }

            for (key in periodicTitle6.keys){
                println("Available: ${periodicTitle6[key]}  Title: $key ")
            }
            println("\nBorrower: $borrowerName \nBook borrowed: $periodic \nDate borrowed: $borrowDate")
            println("Book must be returned on/before $returnDate")
        }else{
            println(("The book does not exist").uppercase())
        }
    }

    override fun returnBook(book:String,  returnDate: String, borrowDate: String, borrowerName: String) {
//        super.returnBook()
        when (periodic){
            "Structural Analysis" -> increment(periodicTitle6, "Structural Analysis")
            "Philippine Literature" -> increment(periodicTitle6, "Philippine Literature")
            "Fairy Tale" -> increment(periodicTitle6, "Fairy Tale")
            else -> increment(periodicTitle6, periodic)
        }
        for (key in periodicTitle6.keys){
            println("Available: ${periodicTitle6[key]}  Title: $key ")
        }
        println("\nBorrower: $borrowerName \nBook returned: $periodic \nDate borrowed: $borrowDate \nDue date: $returnDate\n")
    }

    override fun listBook() {
        for (key in periodicTitle.keys){
            println("Title: ${key.uppercase()} [ ${periodicTitle2[key]} ]")
        }
        println("\nThis list contains ${(periodicTitle.size)} periodicals. ")
    }

    override fun searchBook(title:String){
//        val periodicMap: MutableMap<String, String>
//        get() = mutableMapOf<String, String>(K, V)

        println("Title:      $title")
        println("Editor:     ${(periodicTitle[title])}")
        println("Type:       ${(periodicTitle2[title])}")
        println("Year:       ${(periodicTitle3[title])}")
        println("Volume:     ${(periodicTitle4[title])}")
        println("Location:   ${(periodicTitle5[title])}")
        println("Available:  ${(periodicTitle6[title])}")
    }

    override fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        periodicTitle.replace(title, editor)
        periodicTitle2.replace(title, type)
        periodicTitle3.replace(title, year)
        periodicTitle4.replace(title, volume)
        periodicTitle5.replace(title, location)
        periodicTitle6.replace(title, available)
    }

    override fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        periodicTitle.put(key = title, value = editor)
        periodicTitle2.put(key = title, value = type)
        periodicTitle3.put(key = title, value = year)
        periodicTitle4.put(key = title, value = volume)
        periodicTitle5.put(key = title, value = location)
        periodicTitle6.put(key = title, value = available)
    }

    override fun deleteBook(title: String){
        periodicTitle.remove(title)
        periodicTitle2.remove(title)
        periodicTitle3.remove(title)
        periodicTitle4.remove(title)
        periodicTitle5.remove(title)
        periodicTitle6.remove(title)
    }



    private fun <K : Any> decrement(periodicTitle6: MutableMap<String, Int>, key: K) {
        when (val count = periodicTitle6[key.toString()])
        {
            null -> periodicTitle6[key.toString()] = 1
            else -> periodicTitle6[key.toString()] = count - 1
        }
    }
    private fun <K : Any> increment(periodicTitle6: MutableMap<String, Int>, key: K) {
        when (val count = periodicTitle6[key.toString()])
        {
            null -> periodicTitle6[key.toString()] = 1
            else -> periodicTitle6[key.toString()] = count + 1
        }
    }
}