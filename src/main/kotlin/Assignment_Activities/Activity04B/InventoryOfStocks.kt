package Assignment_Activities.Activity04B

open class InventoryOfStocks {

    // [1]Grocery Type -> food items, item no. to: 1.)product name, 2.)category, 3.)inventory, 4.)unit, 5.)price
    var foodItem = mutableMapOf<Int, String>(1 to "ham", 2 to "hopia", 3 to "coke")
    val foodItem2 = mutableMapOf<Int, String>(1 to "Frozen", 2 to "Bread", 3 to "Drinks")
    val foodItem3 = mutableMapOf<Int, Double>(1 to 20.0, 2 to 50.0, 3 to 100.0)
    val foodItem4 = mutableMapOf<Int, String>(1 to "kilo", 2 to "pack", 3 to "can")
    val foodItem5 = mutableMapOf<Int, Double>(1 to 60.75, 2 to 25.50, 3 to 33.0)

    //[2]Grocery Type -> toiletries items, item no. to: 1.)product name, 2.)category, 3.)inventory, 4.)unit, 5.)price
    var toiletriesItem = mutableMapOf<Int, String>(4 to "toothbrush", 5 to "tissue", 6 to "soap dish")
    val toiletriesItem2 = mutableMapOf<Int, String>(4 to "Dental", 5 to "Consumable", 6 to "Plasticware")
    val toiletriesItem3 = mutableMapOf<Int, Double>(4 to 50.0, 5 to 120.0, 6 to 30.0)
    val toiletriesItem4 = mutableMapOf<Int, String>(4 to "piece", 5 to "roll", 6 to "piece")
    val toiletriesItem5 = mutableMapOf<Int, Double>(4 to 47.0, 5 to 12.50, 6 to 75.25)

    //[3]Grocery Type -> non-food/toiletries items, item no. to: 1.)product name, 2.)category, 3.)inventory, 4.)unit, 5.)price
    var nonFoodItem = mutableMapOf<Int, String>(7 to "match", 8 to "muriatic", 9 to "spatula")
    val nonFoodItem2 = mutableMapOf<Int, String>(7 to "Household", 8 to "Chemical", 9 to "Utensil")
    val nonFoodItem3 = mutableMapOf<Int, Double>(7 to 200.0, 8 to 35.0, 9 to 15.0)
    val nonFoodItem4 = mutableMapOf<Int, String>(7 to "box", 8 to "bottle", 9 to "piece")
    val nonFoodItem5 = mutableMapOf<Int, Double>(7 to 5.00, 8 to 39.75, 9 to 65.50)

    open fun displayInventoryAll():Boolean{
        for (key in foodItem.keys) {
            println("Item No.: $key   Product Name: ${(foodItem[key]).toString().uppercase()}")
        }
        for (key in toiletriesItem.keys) {
            println("Item No.: $key   Product Name: ${(toiletriesItem[key]).toString().uppercase()}")
        }
        for (key in nonFoodItem.keys) {
            println("Item No.: $key   Product Name: ${(nonFoodItem[key]).toString().uppercase()}")
        }
        return true
    }

    open fun displayInventoryFood():Boolean {
        println("THIS IS FROM SUPERCLASS")
        return true
    }

    open fun displayInventoryNonFood():Boolean  {
        println("THIS IS FROM SUPERCLASS")
        return true
    }

    open fun displayInventoryToiletries():Boolean  {
        println("THIS IS FROM SUPERCLASS")
        return true
    }


    open fun searchByItemNumber(itemNumber:Int):Boolean{
        println("Searching details for item number $itemNumber")
        println("Product:   ${(foodItem[itemNumber])}")
        println("Category:  ${(foodItem2[itemNumber])}")
        println("Inventory: ${(foodItem3[itemNumber])}")
        println("Unit:      ${(foodItem4[itemNumber])}")
        println("Price:     ${(foodItem5[itemNumber])}")
        println("Searching details for item number $itemNumber")
        println("Product:   ${(toiletriesItem[itemNumber])}")
        println("Category:  ${(toiletriesItem2[itemNumber])}")
        println("Inventory: ${(toiletriesItem3[itemNumber])}")
        println("Unit:      ${(toiletriesItem4[itemNumber])}")
        println("Price:     ${(toiletriesItem5[itemNumber])}")
        println("Searching details for item number $itemNumber")
        println("Product:   ${(foodItem[itemNumber])}")
        println("Category:  ${(nonFoodItem2[itemNumber])}")
        println("Inventory: ${(nonFoodItem3[itemNumber])}")
        println("Unit:      ${(nonFoodItem4[itemNumber])}")
        println("Price:     ${(nonFoodItem5[itemNumber])}")
        return  true
    }

    open fun addInventoryItems(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean
    {
//        //Combination of all map collections
//        var combinedMap = foodItem + toiletriesItem + nonFoodItem
//        var combinedMap2 = foodItem2 + toiletriesItem2 + nonFoodItem2
//        var combinedMap3 = foodItem3 + toiletriesItem3 + nonFoodItem3
//        var combinedMap4 = foodItem4 + toiletriesItem4 + nonFoodItem4
//        var combinedMap5 = foodItem5 + toiletriesItem5 + nonFoodItem5
//        combinedMap.forEach(itemNumber, productName)
//        combinedMap2.forEach(itemNumber, productName)
//        combinedMap3.forEach(itemNumber, productName)
//        combinedMap4.forEach(itemNumber, productName)
//        combinedMap5.forEach(itemNumber, productName)
        return  true
    }

    open fun editInventory(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        foodItem.replace(itemNumber, productName)
        foodItem2.replace(itemNumber, category)
        foodItem3.replace(itemNumber, inventory)
        foodItem4.replace(itemNumber, itemUnit)
        foodItem5.replace(itemNumber, itemPrice)
        toiletriesItem.replace(itemNumber, productName)
        toiletriesItem2.replace(itemNumber, category)
        toiletriesItem3.replace(itemNumber, inventory)
        toiletriesItem4.replace(itemNumber, itemUnit)
        toiletriesItem5.replace(itemNumber, itemPrice)
        nonFoodItem.replace(itemNumber, productName)
        nonFoodItem2.replace(itemNumber, category)
        nonFoodItem3.replace(itemNumber, inventory)
        nonFoodItem4.replace(itemNumber, itemUnit)
        nonFoodItem5.replace(itemNumber, itemPrice)
        return  true
    }

    open fun deleteInventoryItems(itemNumber: Int):Boolean{
        foodItem.remove(itemNumber)
        foodItem2.remove(itemNumber)
        foodItem3.remove(itemNumber)
        foodItem4.remove(itemNumber)
        foodItem5.remove(itemNumber)
        toiletriesItem.remove(itemNumber)
        toiletriesItem2.remove(itemNumber)
        toiletriesItem3.remove(itemNumber)
        toiletriesItem4.remove(itemNumber)
        toiletriesItem5.remove(itemNumber)
        nonFoodItem.remove(itemNumber)
        nonFoodItem2.remove(itemNumber)
        nonFoodItem3.remove(itemNumber)
        nonFoodItem4.remove(itemNumber)
        nonFoodItem5.remove(itemNumber)
        return  true
    }

    open fun searchByProductName(productName: String):Boolean {
        println("THIS IS FROM SUPERCLASS")
        return true
    }

    open fun addInventoryFood(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean {
        println("THIS IS FROM SUPERCLASS")
        return true
    }

    open fun addInventoryToiletries(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean {
        println("THIS IS FROM SUPERCLASS")
        return true
    }

    open fun addInventoryNonFood(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double) :Boolean{
        println("THIS IS FROM SUPERCLASS")
        return true
    }

}