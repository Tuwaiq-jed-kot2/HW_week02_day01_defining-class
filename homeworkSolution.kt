
//Part 1

import kotlin.system.exitProcess

fun main() {


    try {

        println("Enter your name")
        val sName = readLine()

        println("Enter your age")
        val sAge = readLine()?.toInt()

        println("Enter your GPA")
        val sGPA = readLine()?.toDouble()

        val student = Student(sName, sAge, sGPA)

        while (true) {

            println("Enter 1 to view student's info, 2 to let the student speak, 3 to add two numbers, 0 to exit")

            when(Integer.valueOf(readLine())) {

                1 -> student.printInfo()

                2 -> student.speak("Hi, I'm a student")

                3 -> {

                    println("Enter 2 numbers to get the sum")

                    println("The sum is: " + student.add(Integer.valueOf(readLine()), Integer.valueOf(readLine())))

                }

                0 -> {

                    println("Goodbye.")

                    exitProcess(0)

                } else -> println("1, 2, 3, 0 only")
            }
        }

    } catch (e: NumberFormatException) {

        println("You entered null")

    }
}

class Student(name: String?, age: Int?, GPA: Double?) {

    var studentName = name
    var studentAge = age
    var studentGPA = GPA

    fun speak(str: String?) {

        println("\nYou said: \"$str\" ")

    }

    fun printInfo() {

        println("\nHi, $studentName, \nYour age is: $studentAge \nYour GPA is: $studentGPA")

    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}

//Part 2

// Q1 = what dose Race Conditions mean

//// It happens when a state gets modified at the same time (simultaneously) by two or more elements.

// Q2 = is there any Race Conditions in the code



// Q3 = what's the best way to solve the compiling error in the code using scopeFunction

