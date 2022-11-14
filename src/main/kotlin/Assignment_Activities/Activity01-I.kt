package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 9
*/

fun main(){

    var condition : Boolean = true
    var select : Int
    var option : Int
    var itemNumber: Int = 0
    var productName: String = " "
    var category: String = " "
    var inventory: Double = 0.0
    var itemUnit: String = " "
    var itemPrice: Double = 0.0

    while (condition){
        println("\nSelect an option \n[1] Display \n[2] Add New Product \n[3] Add Quantity \n[0] Exit  \nEnter here:")
        select = readln().toInt()
        if (select == 1){
            println("<< Displaying all entries >>")                                                             //traversing the values, display size
            println("\nItem No.: 1  Product: Ham    Category: Frozen    Inventory: 10   Unit: kilo  Price: Php 60.75 ")
            println("\nItem No.: 2  Product: Hopia  Category: Bread     Inventory: 50   Unit: piece Price: Php 25.50 ")
            println("\nItem No.: 3  Product: Coke   Category: Beverages Inventory: 100  Unit: can   Price: Php 33.00 ")
            println("\nThis directory contains 3 items ")
            println("...Display completed...")
            println("----------------------------------")
        }else if (select == 2){
            println("<< Add Product >>")
            println("Adding...")
            println("New item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName= readln()
            println("New product category: ")
            category = readln()
            println("New inventory count: ")
            inventory = readln().toDouble()
            println("New item unit: ")
            itemUnit = readln()
            println("New unit price: ")
            itemPrice = readln().toDouble()
            println("\nItem No.: 1  Product: Ham    Category: Frozen    Inventory: 10   Unit: kilo  Price: Php 60.75 ")
            println("\nItem No.: 2  Product: Hopia  Category: Bread     Inventory: 50   Unit: piece Price: Php 25.50 ")
            println("\nItem No.: 3  Product: Coke   Category: Beverages Inventory: 100  Unit: can   Price: Php 33.00 ")
            println("\nItem No.: $itemNumber  Product: $productName   Category: $category Inventory: $inventory  Unit: $itemUnit   Price: Php $itemPrice ")
            println("\nThis directory contains 4 items ")
            println("\n...adding completed")
            println("----------------------------------")
        }else if (select == 3){
            println("<< Add Quantity >>")
            println("Adding...")
            println("Add ham: ")
            var addHam = readln().toInt()
            var sumHam = addHam+10
            println("Add hopia: ")
            var addHopia= readln().toInt()
            var sumHopia = addHopia+50
            println("Add coke: ")
            var addCoke = readln().toInt()
            var sumCoke = addCoke+100
            println("Add $productName: ")
            var addNewProduct = readln().toInt()
            itemPrice = readln().toDouble()
            println("\nItem No.: 1  Product: Ham    Previous Inventory: 10   Unit: kilo  New Inventory: $sumHam ")
            println("\nItem No.: 2  Product: Hopia  Previous Inventory: 50   Unit: piece New Inventory: $sumHopia ")
            println("\nItem No.: 3  Product: Coke   Previous Inventory: 100  Unit: can   New Inventory: $sumCoke ")
            println("\nItem No.: $itemNumber  Product: $productName   Previous Inventory: $inventory  Unit: $itemUnit   New Inventory: Php ${itemPrice+addNewProduct} ")
            println("\n...editing completed")
            println("----------------------------------")
        }else if (select == 5){
            println(">>>  Exiting the system <<<")
            condition = false
        }
    }
    println("Thank you for using this program...")
}


