package Assignment_Activities.Activity04B

class InventorySystemsEdit: InventoryOfStocks() {

    override fun editInventory(itemNumber: Int, productName: String, category: String, inventory: Double, itemUnit: String, itemPrice: Double):Boolean{
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
}