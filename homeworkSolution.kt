// Part on3 - defining a class ( writing code "required"). //
//  write a kotlin program with student class that has three proprty "name" and "age" and "GPA" //
//  and give the student abilty to (speake hint:use print ) and the abilty to add two numbers //

class stuDent(name: String = "Rakan") {
    var name = name
        set(value) {
            field = value
        }

    var age = 25
        set(value) {
            field = value
        }
    var gpa = 3.57
        set(value) {
            field = value
        }

    fun speak(): String {
        return "Hi my name is $name"
    }


    override fun toString(): String = "Hi my name is $name, i'm $age years old, my GPA is $gpa"

}

fun main() {


    val student = stuDent()
    println(student.speak())
    val std2 = stuDent("ahmed")
    std2.age+=2
    println(std2.toString())

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
// yepp Weapon

// Q3 = what's the best way to solve the compiling error in the code using scopeFunction?
//    A.3.2 : use a scope function like also
//    A.3.2: chang val to var xD
