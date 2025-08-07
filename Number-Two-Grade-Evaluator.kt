package com.example.number_two_grade_evaluator

fun main() {

    val grades = listOf(85, 42, 70, 58, 90)

    for (grade in grades) {

        if (grade >= 60) {
            println("Grade: $grade - Status: Pass")
        } else {
            println("Grade: $grade - Status: Fail")
        }
    }
}
