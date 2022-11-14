package Assignment_Activities.Activity04A

interface BookRegistrySystem {

    fun listBook(){
        println("This function is from the interface BookRegistrySystem")
    }

    fun searchBook(title:String){
        println("This function is from the interface BookRegistrySystem")
    }

    fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface BookRegistrySystem")
    }

    fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface BookRegistrySystem")
    }

    fun deleteBook(title: String){
        println("This function is from the interface BookRegistrySystem")
    }
}