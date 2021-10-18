# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.


fun main() {

    val Somyah = Student("Somyah",24,3.81)
    Somyah.speak()
    println("The sum is : "+Somyah.add(50,50))

}

class Student (private val name: String, private val age :Int, private val GPA: Double){

    fun speak (){
        println("Hello I am $name I'm $age and my GPA is $GPA")
    }
    fun add (num1 : Int,num2: Int) :Int {
        return num1+num2
    }

}