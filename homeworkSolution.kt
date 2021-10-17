# Kotlin Programming 
---
## Learning Objectives ✨
- defining class
## Getting started 
Open the [assignment.md](assignment.md) file to get started.
//Part1:
fun main() {
    val y = student  ("eshraq" , 27 , 4.50)
    y.printInfo()
    println("The adding :" +y.adding(9 , 1))
}
class student ( val name:String="eshraq" , val age :Int= 26 ,var GPA :Double= 4.40){
    fun adding (num1:Int,num2:Int):Int{
        return num1+num2
    }



    fun printInfo (){
        println("Your Name:$name \n Your Age:$age \n Your GPA:$GPA ")
    }
}
//Part2: