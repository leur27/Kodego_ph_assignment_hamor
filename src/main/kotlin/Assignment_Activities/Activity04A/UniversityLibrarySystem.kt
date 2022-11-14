package Assignment_Activities.Activity04A

open class UniversityLibrarySystem: StudentRecordsSystem() {

    var returnDate = " "
    var borrowDate = " "
    var borrowerName = " "
    var book: String = " "
    var periodic: String = " "

    open fun borrowBook(book:String, returnDate: String, borrowDate: String, borrowerName: String){
        println("This function is from the superclass UniversityLibrarySystem")
    }

    open fun returnBook(book:String,  returnDate: String, borrowDate: String, borrowerName: String){
        println("This function is from the superclass UniversityLibrarySystem")
    }
}
