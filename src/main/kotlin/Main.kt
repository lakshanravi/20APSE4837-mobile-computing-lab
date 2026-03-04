fun main() {
    question1()
    question2()
    question3()
    question4()
    question5()
    question6()
    question7()
    question8()
    question9()
    question10()

}

fun question1() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val sum = numbers.filter { it % 2 == 0 }.sum()
    println("Sum of Even : $sum")
}

fun question2() {
    val numbers = listOf(10, 5, 23, 8, 42)
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) max = num
    }
    println("Maximum number: $max")
}

fun question3() {
    for (i in 1..50) {
        when {
            i % 15 == 0 -> println("Fizzbuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }
}

fun question4() {
    val input = "Hello Kotlin World"
    val vowels = "aeiouAEIOU"
    val count = input.count { it in vowels }
    println("Number of vowels: $count")
}

fun question5() {
    val numbers = listOf(1, 2, 3, 2, 4, 1, 5)
    val unique = numbers.distinct()
    println("List without duplicates: $unique")
}

fun question6() {
    val list = listOf("apple", "banana", "cherry")
    val reversedList = mutableListOf<String>()
    for (i in list.indices.reversed()) {
        reversedList.add(list[i])
    }
    println("Reversed list: $reversedList")
}

fun question7() {
    val n = 5
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Factorial of $n: $factorial")

}

fun question8() {
    val numbers = listOf(-5, 10, -2, 7, 0)
    val sum = numbers.filter { it > 0 }.sum()
    println("Sum of positive numbers: $sum")
}

fun question9() {
    val correctNumber = 7
    var guess: Int?
    do {
        print("Guess a number between 1 and 10: ")
        guess = readLine()?.toIntOrNull()
        if (guess != correctNumber) println("Try again!")
    } while (guess != correctNumber)
    println("Correct! The number was $correctNumber")
}

fun question10() {
    val rows = 5
    for (i in 1..rows) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}