package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/3/22
Filename: Activity01-C.kt
Exercise No.: 3
*/

//Inventory of 5 items only available in the grocery namely: Hotdog, Tissue, Surf, Ensaymada & Soy Sauce

fun main() {

    println("Enter an item:")

    var itemName: String = readLine()!!
    println("You are looking for $itemName")

    //item1 details
    var item1 : String = "Hotdog"
    var category1 : String = "Frozen Food"
    var location1 : Char = 'A'
    var price1 : Double = 75.50
    var quantity1 : Int = 30
    var unit1 : String = "kilos"

    //item2 details
    var item2 : String = "Tissue"
    var category2 : String = "Hygiene"
    var location2 : Char = 'B'
    var price2 : Double = 18.25
    var quantity2 : Int = 120
    var unit2 : String = "rolls"

    //item2 details
    var item3 : String = "Surf"
    var category3 : String = "Laundry"
    var location3 : Char = 'C'
    var price3 : Double = 59.75
    var quantity3 : Int = 95
    var unit3 : String = "dozens"

    //item3 details
    var item4 : String = "Ensaymada"
    var category4 : String = "Bread"
    var location4 : Char = 'D'
    var price4 : Double = 26.00
    var quantity4 : Int = 50
    var unit4 : String = "pieces"

    //item4 details
    var item5 : String = "Soy Sauce"
    var category5 : String = "Condiment"
    var location5 : Char = 'E'
    var price5 : Double = 45.75
    var quantity5 : Int = 25
    var unit5 : String = "bottles"

    //item5 details
    if (itemName == item1) {
        println("Item: $item1")
        println("Category: $category1")
        println("Location: $location1")
        println("Price: $price1")
        println("Quantity: $quantity1")
        println("Unit: $unit1")
    }

    if (itemName == item2) {
        println("Item: $item2")
        println("Category: $category2")
        println("Location: $location2")
        println("Price: $price2")
        println("Quantity: $quantity2")
        println("Unit: $unit2")
    }

    if (itemName == item3) {
        println("Item: $item3")
        println("Category: $category3")
        println("Location: $location3")
        println("Price: $price3")
        println("Quantity: $quantity3")
        println("Unit: $unit3")
    }

    if (itemName == item4) {
        println("Item: $item4")
        println("Category: $category4")
        println("Location: $location4")
        println("Price: $price4")
        println("Quantity: $quantity4")
        println("Unit: $unit4")
    }

    if (itemName == item5) {
        println("Item: $item5")
        println("Category: $category5")
        println("Location: $location5")
        println("Price: $price5")
        println("Quantity: $quantity5")
        println("Unit: $unit5")
    }
}