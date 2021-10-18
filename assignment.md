# Kotlin I Assignment  I defining class
---
The Kotlin assignment has one component:
- writing code(required)
- open-ended question (optional)
- ...
> Note: You must save your solution as `homeworkSolution.kt`.

## Part I - defining a class ( writing code "required").
---
###  `write a kotlin program with student class that has three proprty "name" and "age" and "GPA"` 
### ` and give the student  abilty to (speake hint:use print ) and the abilty to add two numbers `
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




###
## Part II - open-ended question ( optional ) .
---
### read the code below and answer the questions
### 
> ### class Weapon(val name: String)
>  ##### class Player {
> ##### var weapon: Weapon? = Weapon("Ebony Kris")
> ##### fun printWeaponName() {
> ##### if (weapon != null) {
> ##### println(weapon.name)
> ##### }
> ##### } }
> ##### fun main() {
> ##### Player().printWeaponName()
> ##### }

### Q1 = what dose Race Conditions mean
###A race condition when two or more threads can access shared data and they try to change it at the same time and 
an unexpected result occurs.
###
###
### Q2 = is there any Race Conditions in the code
### Yes ,one thread does  (check) if ( weapon != null) , And act println (weapon.name) to do something that 
###depends on the value.
###and another thread does something to the value in between the "check" and the "act".
###
###
### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
### also, Also , because it,the argument to also,
and it is a local variable and it is a variable that is guaranteed not to be changed by another part of the program
###
###
