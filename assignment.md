# Kotlin I Assignment  I defining class
---
The Kotlin assignment has one component:

- writing code(required)
- open-ended question (optional)
- ...

> Note: You must save your solution as `homeworkSolution.kt`.

## Part I - defining a class ( writing code "required").
---

### `write a kotlin program with student class that has three proprty "name" and "age" and "GPA"`

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

means if two sources tried to access to the same  data and make changes in the same time 

### Q2 = is there any Race Conditions in the code

yes because when we try to make print order we get this error "because 'weapon' is a mutable 
property that could have been changed by this time", and that mean there is someone trying 
to change the value to the data in same time that we are want change value.

###

### Q3 = what's the best way to solve the compiling error in the code using scopeFunction

the best way to fix thi problem is to use scope fun (Also)

###
