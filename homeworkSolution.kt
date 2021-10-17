// Part on3 - defining a class ( writing code "required"). //
//  write a kotlin program with student class that has three proprty "name" and "age" and "GPA" //
//  and give the student abilty to (speake hint:use print ) and the abilty to add two numbers //

data class StuDent(var name:String = "Rakan",var age:Int = 25,var gpa:Double=3.75){
    fun speak():String{
        return "Hi my name is $name , my age is $age my gpa is $gpa"
    }
}

fun main(){
    val std1 = StuDent()
    println(std1.speak())
    val std2 = StuDent("ahmed",27,4.5)
    println(std2.speak())
}


//// part2
/*read the code below and answer the questions
class Weapon(val name: String)
class Player {
    var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() {
        if (weapon != null) {
            println(weapon.name)
        }
    } }
fun main() {
    Player().printWeaponName()
}*/


// Q1 = what dose Race Conditions mean
// A.1 : race condition is another type of concurrency bug
// that occurs when two or more threads access shared data and try to change it at the same time ///


// Q2 = is there any Race Conditions in the code ?
// no because the code running in one thread

// Q3 = what's the best way to solve the compiling error in the code using scopeFunction?
//    A.3.2 : use a scope function like also , let
//    A.3.2: chang val to var //
