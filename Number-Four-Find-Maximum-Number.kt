package com.example.number_four_find_maximum_number

fun main() {

    val numbers = listOf(8,18,3,2,12,7)

    var maxNumber = numbers[0]

    for (number in numbers) {
        if (number > maxNumber) {
            maxNumber = number
        }
    }

    println("The largest number in the list is: $maxNumber")
