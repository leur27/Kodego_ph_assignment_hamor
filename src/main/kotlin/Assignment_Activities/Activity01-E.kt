package Assignment_activities

fun main(){

    //use cases of collection Map
    println("Output of collection maps:")
    val studentIdAndName = mapOf<Int, String>(5001 to "John", 5002 to "Peter", 5003 to "Andrew")
        println(studentIdAndName)
        println("Keys:" + studentIdAndName.keys)
        println("Values:" + studentIdAndName.values)
    val accountPinAndHolder = mapOf<Int, String>(1234 to "Juan", 2341 to "Pedro", 3412 to "Andres")
        for ((k, v) in accountPinAndHolder) {
            println("$k = $v")
        }
    val accessCodeAndPersonnel = mapOf<Int, String>(76543 to "Jo", 65432 to "Pete", 54321 to "Drew")
        println("Size of the Map " + accessCodeAndPersonnel.count())
        println("The value for key 76543 " + accessCodeAndPersonnel.get(76543))
        println(accessCodeAndPersonnel[65432])


    //use cases of collection Set
    println("\nOutput of collection sets:")
    val userName = setOf<String>("John", "Peter", "Andrew")
        println(userName)
        if("John" in userName){
            println(true)
        }else{
            println(false)
        }
    val employeeNumber = setOf<Int>(101, 102, 103)
        println("Size of the Set " + employeeNumber.size)
        val descend = employeeNumber.sortedDescending()
        println(descend)
    val seaCountries = setOf<String>("Philippines", "Indonesia", "Singapore")
        for (i in seaCountries.indices) {
            println(seaCountries.elementAt(i))
        }


    //use cases of collection ArrayList
    println("\nOutput of collection Array List:")
    val accountName = arrayListOf<String>("John", "Peter", "Andrew")
        println(accountName)
    val foodsOrdered = arrayListOf<String>("Pork Lechon", "Fruit Salas", "Chicken Cordon Bleu")
        foodsOrdered.add("Fish Fillet")
    val teamMembersAge = arrayListOf<Int>(15, 17, 15)
        for(i in teamMembersAge)
            println(i)


    //use cases of collection Array
    println("\nOutput of collection Array:")
    val soldItems = arrayOf<String>("cellphone", "laptop", "tablet")
        for (i in 0..soldItems.size-1) {
            print(" "+soldItems[i])
        }
    val classNicknames = arrayOf<String>("Nonoy", "Inday", "Nonoy")
        println(classNicknames.get(0))
        println(classNicknames[1])
    val salesTransaction = arrayOf<Double>(1552.50, 25088.25, 8620.75)
        salesTransaction.forEach({ index -> println(index) })


}

