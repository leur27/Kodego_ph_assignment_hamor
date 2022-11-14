package Assignment_Activities.Activity04A


fun main(){

    val bookCollections = CollectionOfBooks()
    val periodicCollections = CollectionOfPeriodicals()
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
    var editor: String
    var type: String
    var year: Int
    var volume: Int
    var input: Int

    println("-------------------------------------------------------")
    println("************   Library Transaction System  ************")
    println("-------------------------------------------------------")

    while (conditional) {
        println("MAIN MENU \n[1] List \n[2] Borrow \n[3] Return \n[0] Exit \nEnter here:")                      //call to action, main menu
        println("----------------------------------")
        select = readln().toInt()
        if (select == 1) {                                                                                      //selection 1 -> displaying book list
            println("<< List selected >>")
            println("system display...\n")
            println("----------------------------------")
            println("Choices: \n[1] Books \n[2] Periodicals \n[3] DVD \n[0] Exit \nEnter here:")
            input = readln().toInt()
            if (input==1){
                println("---List of Books---")
                bookCollections.listBook()
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
                    bookCollections.searchBook(title)
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
                    bookCollections.editBook(title, author, category, edition, copies, location, available)
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
                    bookCollections.addBook(title, author, category, edition, copies, location, available)
                    println("\n...adding completed")
                    println("----------------------------------")
                }else if (option==4){                                                                                   //option 4 -> deleting a book entry
                    println("<< List of books -> Delete >>")
                    println("system deleting...")
                    println("Title of a book: ")
                    title = readln()
                    bookCollections.deleteBook(title)
                    println("\n...deleting completed")
                    println("----------------------------------")
                }else{
                    continue
                }
            }else if (input==2){
                println("---List of Periodicals---")
                periodicCollections.listBook()
                println("...display completed")
                println("----------------------------------")
                println("Branch Menu: \n[1] Search \n[2] Edit \n[3] Add \n[4] Delete \n[0] Exit \nEnter here:")     //call to action, sub menu
                println("----------------------------------")
                option = readln().toInt()
                if (option==1){                                                                                     //option 1 -> searching book details
                    println("<< List of periodicals -> Search >>")
                    println("system searching...")
                    println("Enter periodical title:")
                    title = readln()
                    bookCollections.searchBook(title)
                    println("\n...searching completed")
                    println("----------------------------------")
                }else if (option==2){                                                                               //option 2 -> editing book details
                    println("<< List of periodicals -> Edit >>")
                    println("system editing...")
                    println("Title: ")
                    title = readln()
                    println("New editor: ")
                    editor = readln()
                    println("New type: ")
                    type = readln()
                    println("New year: ")
                    year = readln().toInt()
                    println("New volume: ")
                    volume = readln().toInt()
                    println("New location: ")
                    location = readln()
                    println("New availability: ")
                    available = readln().toInt()
                    bookCollections.editBook(title, editor, type, year, volume, location, available)
                    println("\n...editing completed")
                    println("----------------------------------")
                }else if (option==3){                                                                                   //option 3 -> adding a book entry
                    println("<< List of volumes -> Add >>")
                    println("system adding...")
                    println("Title: ")
                    title = readln()
                    println("Editor: ")
                    editor = readln()
                    println("Type: ")
                    type = readln()
                    println("Year: ")
                    year = readln().toInt()
                    println("Volume: ")
                    volume = readln().toInt()
                    println("Location: ")
                    location = readln()
                    println("Availability: ")
                    available = readln().toInt()
                    bookCollections.addBook(title, editor, type, year, volume, location, available)
                    println("\n...adding completed")
                    println("----------------------------------")
                }else if (option==4){                                                                                   //option 4 -> deleting a book entry
                    println("<< List of periodicals -> Delete >>")
                    println("system deleting...")
                    println("Title of a book: ")
                    title = readln()
                    bookCollections.deleteBook(title)
                    println("\n...deleting completed")
                    println("----------------------------------")
                }else{
                    continue
                }
            }else{
                continue
            }

        }else if (select==2){                                                                                     //selection 2 -> borrowing a book
            println("<< Borrow selected >>")
            println("Choices: \n[1] Books \n[2] Periodicals \n[3] DVD \n[0] Exit \nEnter here:")
            input = readln().toInt()
            if (input==1){
                println("<< Borrow books selected >>")
                println("borrowing...")
                println("Borrowers name:")
                borrowerName = readln()
                println("Book Title:")
                book = readln()
                println("Date borrowed:")
                borrowDate = readln()
                println("Date of return:")
                returnDate = readln()
                bookCollections.borrowBook(book, returnDate, borrowDate, borrowerName)
                println("...borrowing completed")
                println("----------------------------------")
            }else if (input==2){
                println("<< Borrow periodicals selected >>")
                println("borrowing...")
                println("Borrowers name:")
                borrowerName = readln()
                println("Periodical Title:")
                book = readln()
                println("Date borrowed:")
                borrowDate = readln()
                println("Date of return:")
                returnDate = readln()
                bookCollections.borrowBook(book, returnDate, borrowDate, borrowerName)
                println("...borrowing completed")
                println("----------------------------------")
            }else{
                continue
            }


        }else if (select==3){                                                                                   //selection 3 -> returning a book
            println("<< Return selected >>")
            println("Choices: \n[1] Books \n[2] Periodicals \n[3] DVD \n[0] Exit \nEnter here:")
            input = readln().toInt()
            if (input==1){
                println("<< Borrow books selected >>")
                println("returning...")
                println("Borrowers name:")
                borrowerName = readln()
                println("Book Title:")
                book = readln()
                println("Date borrowed: $borrowDate")
                println("Date to return: $returnDate")
                println("Days exceeded:")
                exceed = readln().toInt()
                bookCollections.returnBook(book, returnDate, borrowDate, borrowerName)
                println("No. of days exceeded: $exceed  \nPenalty amount: Php${exceed*50}.00")
                println("...returning completed")
                println("----------------------------------")
            }else if (input==2){
                println("<< Borrow periodicals selected >>")
                println("returning...")
                println("Borrowers name:")
                borrowerName = readln()
                println("Periodical Title:")
                book = readln()
                println("Date borrowed: $borrowDate")
                println("Date to return: $returnDate")
                println("Days exceeded:")
                exceed = readln().toInt()
                bookCollections.returnBook(book, returnDate, borrowDate, borrowerName)
                println("No. of days exceeded: $exceed  \nPenalty amount: Php${exceed*50}.00")
                println("...returning completed")
                println("----------------------------------")
            }

        }else{                                                                                                  //end of program
            println("----------------------------------")
            println("<< Exiting the program >>")
            conditional = false
        }
    }
}