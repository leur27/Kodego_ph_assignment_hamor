package Assignment_Activities

fun main() {
    /*
   Author: Ruel Hamor
   Date Created: 9/3/22
   Filename: Activity01-B.kt
   Exercise No.: 2
   */

    //Record of 3 books only available in the library namely: Algebra, Reading & Snowwhite

    println("Enter a title book:")

    var titleBook: String = readLine()!!
    println("You are looking for $titleBook")

    var book1 : String = "Algebra"
    var category1 : String = "Mathematics"
    var shelve1 : Int = 5
    var section1 : Char = 'A'
    var author1 : String = "John Fox"
    var published1 : Int = 2010

    var book2 : String = "Reading"
    var category2 : String = "English"
    var shelve2 : Int = 6
    var section2 : Char = 'C'
    var author2 : String = "Peter Shark"
    var published2 : Int = 1999

    var book3 : String = "Snowwhite"
    var category3 : String = "Fantasy"
    var shelve3 : Int = 7
    var section3 : Char = 'C'
    var author3 : String = "Mary Deer"
    var published3 : Int = 2007

    if (titleBook == book1) {
        println("Title: $book1")
        println("Category: $category1")
        println("Shelf No: $shelve1")
        println("Section: $section1")
        println("Author: $author1")
        println("Year Published: $published1")
    }

    if (titleBook == book2) {
        println("Title: $book2")
        println("Category: $category2")
        println("Shelf No: $shelve2")
        println("Section: $section2")
        println("Author: $author2")
        println("Year Published: $published2")
    }

    if (titleBook == book3) {
        println("Title: $book3")
        println("Category: $category3")
        println("Shelf No: $shelve3")
        println("Section: $section3")
        println("Author: $author3")
        println("Year Published: $published3")
    }

}