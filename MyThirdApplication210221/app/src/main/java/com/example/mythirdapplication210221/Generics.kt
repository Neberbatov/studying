package com.example.mythirdapplication210221

fun main() {
    val genericObject = GenericClass<Int>(125)
//    genericObject.updateItem(13545)

    //Здесь внутрь функции можем передать хоть строку, хоть Int. Можем даже указать нуллабельный тип
    printGenericObject(123)
    printGenericObject<String?>("Not null")

    println(sumGeneric(GenericClass(123), GenericClass(77.0)))

    //Создади 2 объекта класса с типом Double. В данном случае sumGeneric работать не будет, потому что Double будет являться инвариантным для Number
    val genericObject1 = GenericClass<Double>(25.0)
    val genericObject2 = GenericClass<Double>(45.0)

    sumGeneric(genericObject1, genericObject2)

    updateContrVariant(ContrVariantClass<Any>(234))
}

//Добавим ограничение для Дженерика, добавив супертип Number
class GenericClass<out T : Number>(defaultValue: T) {
    private var item: T = defaultValue
//        private set

    // Задав ограниение дженерика мы получили возможность работать с методами Number (toInt, toChar и т.д.)
//    fun updateItem(newItem: T) {
//        item = newItem
//        item.toInt()
//    }

    fun getItem(): T {
        return item
    }

}

fun sumGeneric(a: GenericClass<Number>, b: GenericClass<Number>): Int {
    return a.getItem().toInt() + b.getItem().toInt()
}

//Создадим обобщенную функцию. Она будет работать с любым передаваемым ей типом за счет аргумента типа
fun <T> printGenericObject(item: T) {
    println(item.toString())
}

//Создадим контрвариантный класс по Т
class ContrVariantClass <in T> (defaultValue: T){
    private var item:T = defaultValue

    fun setItem (newItem:T) {
        item = newItem
    }
}

fun updateContrVariant (input: ContrVariantClass<Number>) {
    input.setItem(2.2)
}