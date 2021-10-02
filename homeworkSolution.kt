fun main() {
    val student = Student("Bayan", 27,3.9)

    student.speak()
    student.add(2,5)
}
class Student(private val name:String, val age:Int, val GPA:Double) {
    fun speak() {
        println(" My name is $name, I'm $age , my GPA is $GPA ")
    }

    fun add(num1: Int, num2: Int): Unit =
        println(num1+num2)
}


// part 2
/*
a race condition is a type of concurrency bug that occurs when two or more threads
access shared data and try to change it at the same time which leads to unpredictable results.
 */

/*
yes
 */

/*
class Weapon(val name: String)
    class Player {
        var weapon: Weapon? = Weapon("Ebony Kris")
        fun printWeaponName() {
            if (weapon != null) {
                weapon?.also {
                    println(it.name)
                }
            }
        } }
    fun main() {
        Player().prin
 */