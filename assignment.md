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

### A race condition occurs when two or more threads can access shared data ,
### and they try to change it at the same time.
### so when a class property is both nullable and mutable,
###we must ensure that it is non-null before referencing it.

### Q2 = is there any Race Conditions in the code

### yes there is , even though the compiler sees that weapon is checked for a null value,
### there is still a possibility of the Player’s weapon property being replaced with a null
### value between the time that check passed and the time the name of the weapon is printed.

### Q3 = what's the best way to solve the compiling error in the code using scopeFunction

### To use scopeFunction like also to guard against null. see answer down
###
###

class Weapon(val name: String)

class Player {
var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        weapon?.also {
        println(it.name)
        }
    }
}

fun main() {
Player().printWeaponName()
}