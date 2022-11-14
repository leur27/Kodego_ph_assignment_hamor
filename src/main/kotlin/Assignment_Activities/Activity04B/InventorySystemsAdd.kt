package Assignment_Activities.Activity04B

class InventorySystemsAdd: InventoryOfStocks() {
    override fun addInventoryItems(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
//        super.addInventoryItems(itemNumber, productName, category, inventory, itemUnit, itemPrice)
        var foodItem = mutableMapOf<Int, String>(1 to "ham", 2 to "hopia", 3 to "coke")
        val foodItem2 = mutableMapOf<Int, String>(1 to "Frozen", 2 to "Bread", 3 to "Drinks")
        val foodItem3 = mutableMapOf<Int, Double>(1 to 20.0, 2 to 50.0, 3 to 100.0)
        val foodItem4 = mutableMapOf<Int, String>(1 to "kilo", 2 to "pack", 3 to "can")
        val foodItem5 = mutableMapOf<Int, Double>(1 to 60.75, 2 to 25.50, 3 to 33.0)
        foodItem.put(key = itemNumber, value = productName)
        foodItem2.put(key = itemNumber, value = category)
        foodItem3.put(key = itemNumber, value = inventory)
        foodItem4.put(key = itemNumber, value = itemUnit)
        foodItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }

    override fun addInventoryToiletries(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        toiletriesItem.put(key = itemNumber, value = productName)
        toiletriesItem2.put(key = itemNumber, value = category)
        toiletriesItem3.put(key = itemNumber, value = inventory)
        toiletriesItem4.put(key = itemNumber, value = itemUnit)
        toiletriesItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }

    override fun addInventoryNonFood(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
        nonFoodItem.put(key = itemNumber, value = productName)
        nonFoodItem2.put(key = itemNumber, value = category)
        nonFoodItem3.put(key = itemNumber, value = inventory)
        nonFoodItem4.put(key = itemNumber, value = itemUnit)
        nonFoodItem5.put(key = itemNumber, value = itemPrice)
        return  true
    }
}


