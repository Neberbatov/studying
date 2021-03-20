package com.example.mythirdapplication210221

fun main() {
//    Mutable- и immutable- списки:
    val immutable = listOf("pip", "dip", "hip")
    immutable.forEach{println(it)}
    println(immutable)

//      Работа со списками:
//    var mutableList = mutableListOf("1", "2", "3", "23", "323")
//    println(mutableList)
//    mutableList.removeAt(0)
//    println(mutableList)
//    mutableList.add(2, "Hello")
//    println(mutableList)
//    mutableList.addAll(1, immutable)
//    println(mutableList)

//    Mutable- и immutable- множества:
//    val immutableSet = setOf(1, 2, 3, 5, 2, 3, 5)
//    println(immutableSet)
//
//    val unionSet = setOf("pip", "dip", "hip").union(immutableSet)
//    println(unionSet)
//    val subtractSet = setOf(1, 2, 3, 6, 8, 12).subtract(setOf(6, 3, 1, 168))
//    println(subtractSet)
//    val intersectSet = setOf("pip", 1, 5, 256, "hoop", 698).intersect(unionSet)
//    println(intersectSet)
//
//    val natOrderSet = sortedSetOf(1, 6, -6, 2, 254, -1, 0)
//    println(natOrderSet)
//    println(natOrderSet.descendingSet())

//    Хэш-сеты:
//    val hashSet = hashSetOf(1,2,3)
//    hashSet.add(1542)
//    hashSet.remove(2)
//
//    println(hashSet)
//    println(hashSet.contains(154))
//    println(1542 in hashSet)

//    val map = mapOf(< jan, 1>, <feb, 2>, <mar, 3>)


//    Работа с Map:

//    val pair1 = Pair("key", "value")
//    val pair2 = "A" to "B"
//
//    println(pair1.first)
//    println(pair2.second)

    val map = mapOf(
            "Ivanov" to "+712345678",
            "Petrov" to "+785694412",
            "Stepanov" to "+762514123"
    )
//    println("Введите фамилию")
//    val name = readLine().toString()
//    println(map[name])

    // перевод в mutable map и работа с ним
    val map2 = map.toMutableMap()
    map2["Vasiliev"] = "+789654111"
    println(map2)

    map2.remove("Petrov")
    map2.toMap() // обратный перевод в immutable map
    println(map2)

    val map3 = sortedMapOf(
            "Ivanov" to "+712345678",
            "Stepanov" to "+762514123",
            "Petrov" to "+785694412"
    )

    val map4 = map3.toMutableMap()
    map4["Kukuev"]="+711100000"


    println(map3)
    println(map4.keys) // выведем на печать только ключи
    println(map4.values) // выведем на печать только значения

    //вывод через цикл
    for (n in map4.keys) {
        println("Name: $n, phone is ${map4[n]}")
    }

    map4.forEach {entry -> entry.key   //вводим переменную entry
    entry.value}

    map4.forEach {(key, value) ->
        key
        value
    }
}
