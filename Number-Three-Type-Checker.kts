package com.example.number_three_type_checker

fun main() {

    val mixedList = listOf("TEST", 18, 8.8, true)

    for (item in mixedList) {
        when (item) {
            is String   -> println("Item: '$item' is a String")
            is Int      -> println("Item: $item is an Integer")
            is Double   -> println("Item: $item is a Double")
            is Boolean  -> println("Item: $item is a Boolean")
            else        -> println("Item: $item has an unknown type")
        }
    }
}
