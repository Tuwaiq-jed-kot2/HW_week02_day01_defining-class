# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

//Part 1

fun main() {
    var x = Students("Abdulghani", 24, 3.40)
    x.studentInfo()
    x.speak()
    x.add(7, 5)

}

class Students(var name: String, var age: Int, var gpa: Double) {
    fun studentInfo() {
        println("Nmae: $name \nAge: $age \nGPA: $gpa")
    }

    fun speak() {
        println("Student can speak")
    }

    fun add(num1: Int, num2: Int) {
        val result: Int = num1 + num2
        println("$num1 + $num2 = $result")
    }

}