# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

//patr 1

fun main() {

    println("Please Add Your Name:")
    val studentName:String = readLine()!!

    try {
        println("Now Add Your Age:")
        val studentAge:Int = readLine()!!.toInt()

        println("What Is Your GPA?")
        val studentGPA:Double = readLine()!!.toDouble()

        val studentInfo = Student(studentName,studentAge,studentGPA)
        studentInfo.speak(studentName,studentAge,studentGPA)

        println("Press 1 To Calculate Your Grade \n Press Anything To Exit")
        var userChoice = readLine()
        while (userChoice == "1"){
            println("Add Your Mid Term Exam Grade:")
            val mGrade:Int = readLine()!!.toInt()
            println("Add You Final Exam Grade:")
            val fGrade:Int = readLine()!!.toInt()
            studentInfo.adding(mGrade,fGrade)
            println("Press 1 To Calculate Your Grade \nPress Anything To Exit")
            userChoice = readLine()
        }
        println("Goodbye!")

    }catch (e : NumberFormatException){
        println("You Didn't Add Any Numbers!")
    }

}

class Student(name:String,age:Int,GPA:Double){

    fun speak(name:String,age:Int,GPA:Double){
        if ( GPA >= 3.5) {
            println("My name is $name, I'm $age years old, and my GPA is $GPA With Honours")
        }else
            println("My name is $name, I'm $age years old, and my GPA is $GPA")
    }

    fun adding(midGrade:Int,finalGrade:Int){
        when (midGrade + finalGrade){
            in 90..100 -> println("Your Grade Is A")
            in 80..89 -> println("Your Grade Is B")
            in 70..79 -> println("Your Grade Is C")
            in 60..69 -> println("Your Grade Is D")
            else -> println("Your Grade Is F")
        }
    }

}

//part 2

/*Q1 = what dose Race Conditions mean
A race condition is another type of concurrency bug that occurs when two or more threads access
shared data and try to change it at the same time.*/

/*Q2 = is there any Race Conditions in the code
The weapon vlaue could be null at the same time the weapon name printing */

/*  Q3 = what's the best way to solve the compiling error in the code using scopeFunction
When can fix it by the scopeFunction also to be guaranteed that it is will never change by any part
of the code */
