package Assignment_Activities.Activity04B

class InventorySystemsDisplay: InventoryOfStocks() {

    override fun displayInventoryAll():Boolean{
        var combinedMap = foodItem + toiletriesItem + nonFoodItem
        for (key in foodItem.keys) {
            combinedMap += foodItem
        }
        for (key in toiletriesItem.keys) {
            combinedMap += toiletriesItem
        }
        for (key in nonFoodItem.keys) {
            combinedMap += nonFoodItem
        }
        val sortedMap = combinedMap.toSortedMap()
        for (key in sortedMap.keys) {
            println("Item No.: $key   Product Name: ${(sortedMap[key]).toString().uppercase()}")
        }
        println("\nThis inventory list contains ${(sortedMap.size)} items ")
        return true
    }

    override fun displayInventoryFood():Boolean{
        for (key in foodItem.keys) {
            println("Item No.: $key   Product Name: ${(foodItem[key]).toString().uppercase()}")
        }
        println("\nThis inventory list contains ${(foodItem.size)} items ")
        return true
    }

    override fun displayInventoryToiletries(): Boolean {
        for (key in toiletriesItem.keys) {
            println("Item No.: $key   Product Name: ${(toiletriesItem[key]).toString().uppercase()}")
        }
        println("\nThis inventory list contains ${(toiletriesItem.size)} items ")
        return true
    }

    override fun displayInventoryNonFood():Boolean{
        for (key in nonFoodItem.keys) {
            println("Item No.: $key   Product Name: ${(nonFoodItem[key]).toString().uppercase()}")
        }
        println("\nThis inventory list contains ${(nonFoodItem.size)} items ")
        return true
    }

}