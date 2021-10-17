# Kotlin Programming
---
## Learning Objectives ✨
- defining class
## Getting started
Open the [assignment.md](assignment.md) file to get started.


  // part 1
fun main() {

    val asrar = Students("Asrar", 25, 3.50)
    asrar.speak()
    println(asrar.addNum(3, 4))

}

class Students(var name: String, var age: Int, var GPA: Double) {


    fun speak() {
        println("My name is $name \n My age is $age years old \n my GPA is $GPA  ")
    }


    fun addNum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

}

//part 2
/*Q1:what dose Race Conditions mean?
 A race condition occurs when some other part of your program simultaneously modifies the
state of your code in a manner that leads to unpredictable results.*/


//Q2:
// yes in the function println(weapon.name).

//Q3:
//The way to fix this problem is to use a scope function like also
