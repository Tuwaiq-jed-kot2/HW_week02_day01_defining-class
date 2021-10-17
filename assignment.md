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
   race condition is when two or more parts of your program try to change the same variable simultaneously which will cause unpredicted results
###
###
### Q2 = is there any Race Conditions in the code
   yes in the weapon variable in the println function
###
###
### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
   also, because it is used as a local variable which will not be affected by other parts 
###
###
