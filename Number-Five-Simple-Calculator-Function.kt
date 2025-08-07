package com.example.number_five_simple_calculator_function

fun main() {

    print("Please enter the first number: ")
    val num1 = readLine()!!.toInt()
    print("Please enter the second number: ")
    val num2 = readLine()!!.toInt()
    println("Choose an operation: +, -, *, /")
    val operator = readLine()!!
    val result = simpleCalculator(num1, num2, operator)
    println("The result is: $result")
}

fun simpleCalculator(num1: Int, num2: Int, operator: String): String {
    return when (operator) {
        "+" -> (num1 + num2).toString()
        "-" -> (num1 - num2).toString()
        "*" -> (num1 * num2).toString()
        "/" -> {
            if (num2 != 0) {
                (num1 / num2).toString()
            } else {
                "Error: Division by zero"
            }
        }
        else -> "Error: Invalid operator"
    }
}
