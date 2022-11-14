package Assignment_Activities

/*
Author: Ruel Hamor
Date Created: 9/ /22
Filename: Activity01-F.kt
Exercise No.: 12
*/

fun main(){

    //[1]Grocery -> food items, item no. to: 1.)product name, 2.)category, 3.)inventory, 4.)unit, 5.)price
    val foodItem = mutableMapOf<Int, String>(1 to "ham", 2 to "hopia", 3 to "coke")
    val foodItem2 = mutableMapOf<Int, String>(1 to "Frozen", 2 to "Bread", 3 to "Drinks")
    val foodItem3 = mutableMapOf<Int, Double>(1 to 20.0, 2 to 50.0, 3 to 100.0)
    val foodItem4 = mutableMapOf<Int, String>(1 to "kilo", 2 to "pack", 3 to "can")
    val foodItem5 = mutableMapOf<Int, Double>(1 to 60.75, 2 to 25.50, 3 to 33.0)

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
        println("\nSelect an option \n[1] Display \n[2] Search  \n[3] Add  \n[4] Edit  \n[5] Delete  \n[0] Exit  \nEnter here:")
        select = readln().toInt()
        if (select == 1){
            println("<< Displaying all entries >>")                                                             //traversing the values, display size
            for (key in foodItem.keys){
                println("Item No.: $key   Product Name: ${foodItem[key]}")
            }
            println("\nThis directory contains ${(foodItem.size)} data ")
            println("...Display completed...")
            println("----------------------------------")
        }else if (select == 2){
            println("<< Search selected >>")
            println("Searching...")
            println("\nSearch by \n[1] Item No. \n[2] Product Name \n[0] Exit \nEnter here:")
            option = readln().toInt()
            if (option == 1){
                println("<< Search selected >>")
                println("Searching by item number...")
                println("Enter item number:")
                itemNumber = readln().toInt()
                println("Searching details for item number $itemNumber")
                println("Product:   ${(foodItem[itemNumber])}")
                println("Category:  ${(foodItem2[itemNumber])}")
                println("Inventory: ${(foodItem3[itemNumber])}")
                println("Unit:      ${(foodItem4[itemNumber])}")
                println("Price:     ${(foodItem5[itemNumber])}")
                println("\n...searching completed")
                println("----------------------------------")
            }else if (option == 2){
                println("<< Search selected >>")
                println("Searching by product name...")
                println("Enter product name:")
                productName = readln()
                println("Searching details for product ${(productName).uppercase()}")
                var filteredMap = foodItem.filterValues { it == productName }
                for(value in filteredMap.values){
                    if (value == productName){
                        filteredMap.forEach { (k, v) -> println("Item No.: $k   Product Name: $v")
                            for (key in filteredMap.keys){
                                itemNumber = key
                                println("Category:  ${(foodItem2[itemNumber])}")
                                println("Inventory: ${(foodItem3[itemNumber])}")
                                println("Unit:      ${(foodItem4[itemNumber])}")
                                println("Price:     ${(foodItem5[itemNumber])}")
                            }
                        }
                        println("\n...searching completed")
                        println("----------------------------------")
                    }else{
                        println("Item is not listed")
                    }
                    println("\n...searching completed")
                    println("----------------------------------")
                }
            }else{
                continue
            }
        }else if (select == 3){
            println("<< Add selected >>")
            println("Adding...")
            println("New item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName= readln()
            foodItem.put(key = itemNumber, value = productName)
            println("New product category: ")
            category = readln()
            foodItem2.put(key = itemNumber, value = category)
            println("New inventory count: ")
            inventory = readln().toDouble()
            foodItem3.put(key = itemNumber, value = inventory)
            println("New item unit: ")
            itemUnit = readln()
            foodItem4.put(key = itemNumber, value = itemUnit)
            println("New unit price: ")
            itemPrice = readln().toDouble()
            foodItem5.put(key = itemNumber, value = itemPrice)
            println("\n...adding completed")
            println("----------------------------------")
        }else if (select == 4){
            println("<< Edit selected >>")
            println("Editing...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName= readln()
            foodItem.replace(itemNumber, productName)
            println("New product category: ")
            category = readln()
            foodItem2.replace(itemNumber, category)
            println("New inventory count: ")
            inventory = readln().toDouble()
            foodItem3.replace(itemNumber, inventory)
            println("New item unit: ")
            itemUnit = readln()
            foodItem4.replace(itemNumber, itemUnit)
            println("New unit price: ")
            itemPrice = readln().toDouble()
            foodItem5.replace(itemNumber, itemPrice)
            println("\n...editing completed")
            println("----------------------------------")
        }else if (select == 5){
            println("<< Delete selected >>")
            println("Deleting...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            foodItem.remove(itemNumber, productName)
            foodItem2.remove(itemNumber, category)
            foodItem3.remove(itemNumber, inventory)
            foodItem4.remove(itemNumber, itemUnit)
            foodItem5.remove(itemNumber, itemPrice)
            println("\n...deleting completed")
            println("----------------------------------")
        }else{
            println(">>>  Exiting the system <<<")
            condition = false
        }
    }
    println("Thank you for using this program...")
}
