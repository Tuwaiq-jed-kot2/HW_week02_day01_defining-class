fun main() {
    var student=Student()
    println(student.add(80,90))
    println(student.studentAbilty(true))
}

class Student() {
    val name: String = "rwan"
    val age: Int = 24
    val GPA: Double = 3.0

    val ifstudent = true
//

    fun add(num: Int, num1: Int): Int {
        return num + num1

    }


    fun studentAbilty(ifstudent: Boolean) {
        if (ifstudent && age==24 && name=="rwan") {
            println("you can enter to the plack bord")
        } else {
            println(" you'r not a student in the univarsity so you can't enterd to the plack bord")

        }
    }
}



//What Does Race Condition Mean?

//A race condition occurs when some other part of your program simultaneously modifies the state
//of your code in a manner that leads to unpredictable results.


//is there any Race Conditions in the code?
// yes in line 5


// what's the best way to solve the compiling error in the code using scopeFunction
// yes by using also function
//  class Player {
//    var weapon: Weapon? = Weapon("Ebony Kris")
//  fun printWeaponName() {
//    weapon?.also {
//      println(it.name)
//}
//} }

