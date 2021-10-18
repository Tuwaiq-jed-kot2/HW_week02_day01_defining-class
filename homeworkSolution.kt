# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.

fun main() {
    var s1 = Student("Asma", 24 , 3.5)
    s1.speak()
    s1.adding(3,5)



}


class Student( name:String, age : Int ,GPA:Double) {
    var studenName = name
    var ageStudent = age
    var studentGPA = GPA

    fun adding(num1: Int, num2: Int){
        println(num1 + num2)}

    fun speak() {
        println("name=$studenName \n age=$ageStudent\n GPA = $studenName , is speking")
    }


}



