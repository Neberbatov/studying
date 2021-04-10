package com.example.mythirdapplication210221.HW6

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class DelegateProperty <T> (
        private var value: T): ReadWriteProperty<Person, T> {
    override fun getValue(thisRef: Person, property: KProperty<*>): T {
        return value

    }

    override fun setValue(thisRef: Person, property: KProperty<*>, value: T) {
        this.value = value
    }

}