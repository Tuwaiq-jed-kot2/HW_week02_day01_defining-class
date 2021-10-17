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
###Race condition is a situation when multiple threads race to modify on the
### shard variable or recourse in sequence dependent on situation 
###
### Q2 = is there any Race Conditions in the code
### yes, it in the function printWeaponName() the var weapon is mutable variable 
### could be change in another thread while it in if condition
### The mutable variable weapon might be reassigned after the null check and hold a null value when printWeapanName() is executed;
### Q3 = what's the best way to solve the compiling error in the code using scopeFunction
### using let function scope like
### fun printWeaponName() {
### weapon?.let { println(weapon.name) }
### }


