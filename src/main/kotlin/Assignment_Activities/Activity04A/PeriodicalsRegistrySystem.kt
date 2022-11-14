package Assignment_Activities.Activity04A

interface PeriodicalsRegistrySystem {

    open fun listBook(){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    open fun searchBook(title:String){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    open fun addBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    open fun editBook(title: String, author:String, category:String, edition:Int, copies:Int, location:String, available:Int){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }

    open fun deleteBook(title: String){
        println("This function is from the interface PeriodicalsRegistrySystem")
    }
}