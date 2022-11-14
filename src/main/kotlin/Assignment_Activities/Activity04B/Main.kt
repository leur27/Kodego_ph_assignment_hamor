package Assignment_Activities

import exercises.com.oopActivity04B.*

fun main(){

    var inventoryOfStocks = InventoryOfStocks()
    val inventoryDisplay = InventorySystemsDisplay()
    val searchInventory = InventorySystemsSearch()
    val deleteInventory = InventorySystemsDelete()
    var condition = true
    var select: Int
    var option: Int
    var choose: Int
    var input: Int
    var itemNumber = 0
    var productName = " "
    var category = " "
    var inventory = 0.0
    var itemUnit = " "
    var itemPrice = 0.0

    println("-------------------------------------------------------")
    println("**************  Sales & Inventory System  *************")
    println("-------------------------------------------------------")

    while (condition) {
        println("Select an option \n[1] Display \n[2] Search  \n[3] Add  \n[4] Edit  \n[5] Delete  \n[0] Exit  \nEnter here:")
        println("----------------------------------")
        select = readln().toInt()
        if (select == 1) {
            println("<< Display selected >>")
            try {
                println("\nDisplay option \n[1] Food \n[2] Toiletries \n[3] Non Food \n[4] All \n[0] Exit \nEnter here:")
                input = readln().toInt()
                when (input) {
                    1 -> inventoryDisplay.displayInventoryFood()
                    2 -> inventoryDisplay.displayInventoryToiletries()
                    3 -> inventoryDisplay.displayInventoryNonFood()
                    4 -> inventoryDisplay.displayInventoryAll()
                    else -> continue
                }
                println("...display completed")
                println("----------------------------------")
            } catch (e: NumberFormatException) {
                println("\n $e")
                println("Ooops...wrong input! Try again and enter a digit only")
                println("----------------------------------")
            } finally {
                continue
            }
        } else if (select == 2) {
            println("<< Search selected >>")
            println("Searching...")
            println("\nSearch by \n[1] Item No. \n[2] Product Name \n[0] Exit \nEnter here:")
            option = readln().toInt()
            if (option == 1) {
                println("<< Search selected >>")
                println("Searching by item number...")
                try {
                    println("Enter the item number:")
                    itemNumber = readln().toInt()
                    searchInventory.searchByItemNumber(itemNumber)
                    println("----------------------------------")
                }catch (e: NumberFormatException){
                    println("\n $e")
                    println("Ooops...wrong input! Try again and enter a digit only")
                    println("----------------------------------")
                }finally {
                    continue
                }
            } else if (option == 2) {
                println("<< Search selected >>")
                println("Searching by product name...")
                println("Enter product name:")
                productName = readln()
                println("Searching details for product ${(productName).uppercase()}")
                searchInventory.searchByProductName(productName)
            } else {
                println("Item is not listed")
            }
            println("\n...searching completed")
            println("----------------------------------")
        } else if (select == 3) {
            println("<< Add selected >>")
            println("Adding...")
//            try {
            println("\nChoose type \n[1] Food \n[2] Toiletries \n[3] Non Food \n[0] Exit \nEnter here:")
            choose = readln().toInt()
            if (choose == 1) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventoryOfStocks.addInventoryItems(itemNumber, productName, category, inventory, itemUnit, itemPrice)
                println("\n...adding completed")
                println("----------------------------------")
            } else if (choose == 2) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventoryOfStocks.addInventoryToiletries(
                    itemNumber,
                    productName,
                    category,
                    inventory,
                    itemUnit,
                    itemPrice
                )
                println("\n...adding completed")
                println("----------------------------------")
            } else if (choose == 3) {
                println("New item no.: ")
                itemNumber = readln().toInt()
                println("New product name: ")
                productName = readln()
                println("New product category: ")
                category = readln()
                println("New inventory count: ")
                inventory = readln().toDouble()
                println("New item unit: ")
                itemUnit = readln()
                println("New unit price: ")
                itemPrice = readln().toDouble()
                inventoryOfStocks.addInventoryNonFood(itemNumber, productName, category, inventory, itemUnit, itemPrice)
                println("\n...adding completed")
                println("----------------------------------")
            } else {
                continue
            }
//            }catch (e: NumberFormatException){
//                println("\n $e")
//                println("Ooops...wrong input! Try again and enter a digit only")
//                println("----------------------------------")
//            }finally {
//                continue
//            }
        } else if (select == 4) {
            println("<< Edit selected >>")
            println("Editing...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            println("New product name: ")
            productName = readln()
            println("New product category: ")
            category = readln()
            println("New inventory count: ")
            inventory = readln().toDouble()
            println("New item unit: ")
            itemUnit = readln()
            println("New unit price: ")
            itemPrice = readln().toDouble()
            inventoryOfStocks.editInventory(itemNumber, productName, category, inventory, itemUnit, itemPrice)
            println("\n...editing completed")
            println("----------------------------------")
        } else if (select == 5) {
            println("<< Delete selected >>")
            println("Deleting...")
            println("Enter the item no.: ")
            itemNumber = readln().toInt()
            deleteInventory.deleteInventoryItems(itemNumber)
            println("\n...deleting completed")
            println("----------------------------------")
        } else {
            println(">>>  Exiting the system  <<<")
            condition = false
        }

    }
}

