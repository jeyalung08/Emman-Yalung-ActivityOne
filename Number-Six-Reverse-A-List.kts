package com.example.number_six_reverse_a_list

fun main() {
    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    val reversedNumbers = mutableListOf<Int>()

    for (i in numbers.size - 1 downTo 0) {
        reversedNumbers.add(numbers[i])
    }

    println("Original List: $numbers")
    println("Reversed List: $reversedNumbers")
}
