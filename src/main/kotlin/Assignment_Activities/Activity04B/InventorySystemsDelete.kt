package Assignment_Activities.Activity04B

class InventorySystemsDelete: InventoryOfStocks()  {

    override fun deleteInventoryItems(itemNumber: Int):Boolean{
        super.deleteInventoryItems(itemNumber)
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
}