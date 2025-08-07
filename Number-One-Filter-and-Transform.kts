package com.example.number_one_filter_and_transform

fun main() {

    val range = 1..20
    val evenNumbers = range.filter { it % 2 == 0 }
    val doubledNumbers = evenNumbers.map { it * 2 }

    println("The Filtered Even Numbers are: $evenNumbers")
    println("The Doubled Even Numbers are: $doubledNumbers")
}
