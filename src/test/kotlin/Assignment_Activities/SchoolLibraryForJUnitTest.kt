package Assignment_Activities

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class SchoolLibraryForJUnitTest{
    //test cases

    //[1] select 2 in menu for Borrow, input all required, decrement of 1 copy for book borrowed, and return true
    @Test
    fun selectBorrowBookReturnTrue(){
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.borrowBook("Structural Analysis", "10/08/22","10/01/22","Ruel"))
    }

    //[2] select 3 in menu for Return, input all required, increment of 1 copy for book returned, and return true
    @Test
    fun selectReturnBookReturnTrue(){
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.returnBook("Structural Analysis", "10/09/22", "10/02/22", "John"))
    }

    //[3] select 1 in menu for List, display all books, and return true
    @Test
    fun selectListBookReturnTrue() {
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.listBook())
    }

    //[4] select 1 in menu for List, then select 1 for Search, finds & display book details, and return true
    @Test
    fun selectListBookAndSelectSearchBookReturnTrue() {
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.searchBook("Philippine Literature"))
    }

    //[5] select 1 in menu for List, then select 2 for Edit, edit book details, and return true
    @Test
    fun selectListBookAndSelectEditBookReturnTrue() {
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.editBook("Philippine Literature", "Jesus Menoy", "English", 2009, 10, "B3", 10))
    }

    //[6] select 1 in menu for List, then select 3 for Add, add another book with details, and return true
    @Test
    fun selectListBookAndSelectAddBookReturnTrue() {
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.addBook("Alamat", "Nonoy Benzon", "Fiction", 2020, 5, "C5", 5))
    }

    //[7] select 1 in menu for List, then select 4 for Delete, delete a book from the list, and return true
    @Test
    fun selectListBookAndSelectDeleteBookReturnTrue() {
        val schoolLibraryForJUnit = SchoolLibraryForJUnit()
        assertEquals(true, schoolLibraryForJUnit.deleteBook("Fairy Tale"))
    }
}