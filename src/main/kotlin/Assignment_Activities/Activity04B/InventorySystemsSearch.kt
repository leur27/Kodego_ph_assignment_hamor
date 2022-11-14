package Assignment_Activities.Activity04B

class InventorySystemsSearch: InventoryOfStocks() {

    override fun searchByItemNumber(itemNumber:Int):Boolean{
        var combinedMap = foodItem + toiletriesItem + nonFoodItem
        var combinedMap2 = foodItem2 + toiletriesItem2 + nonFoodItem2
        var combinedMap3 = foodItem3 + toiletriesItem3 + nonFoodItem3
        var combinedMap4 = foodItem4 + toiletriesItem4 + nonFoodItem4
        var combinedMap5 = foodItem5 + toiletriesItem5 + nonFoodItem5
        println("Searching details for item number $itemNumber")
        println("Product:   ${(combinedMap[itemNumber])}")
        println("Category:  ${(combinedMap2[itemNumber])}")
        println("Inventory: ${(combinedMap3[itemNumber])}")
        println("Unit:      ${(combinedMap4[itemNumber])}")
        println("Price:     ${(combinedMap5[itemNumber])}")
        return  true
    }

    override fun searchByProductName(productName:String):Boolean{
        var combinedMap = foodItem + toiletriesItem + nonFoodItem
        var combinedMap2 = foodItem2 + toiletriesItem2 + nonFoodItem2
        var combinedMap3 = foodItem3 + toiletriesItem3 + nonFoodItem3
        var combinedMap4 = foodItem4 + toiletriesItem4 + nonFoodItem4
        var combinedMap5 = foodItem5 + toiletriesItem5 + nonFoodItem5
        val filteredMap = combinedMap.filterValues { it == productName }
        for(value in filteredMap.values) {
            if (value == productName) {
                filteredMap.forEach { (k, v) ->
                    println("Item No.: $k   Product Name: $v")
                    for (key in filteredMap.keys) {
                        val itemNumber = key
                        println("Category:  ${(combinedMap2[itemNumber])}")
                        println("Inventory: ${(combinedMap3[itemNumber])}")
                        println("Unit:      ${(combinedMap4[itemNumber])}")
                        println("Price:     ${(combinedMap5[itemNumber])}")
                    }
                }
            }else{
                println("Item is not listed")
            }
        }
        return true
    }
}