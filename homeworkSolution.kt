fun main() {
    val ro=Student("Roya",27,3.0)
    ro.printInfo()
    println("The adding :"+ro.adding(5,2))

}
class Student(val name:String,val age:Int,val GPA:Double){

    fun adding (num1:Int,num2:Int):Int{
        return  num1+num2
    }
    fun printInfo(){
        println( "The name :$name  \n  The age:$age \n The GPA:$GPA")
    }
}
/*
* question 2
* 1-
* A race condition is another type of concurrency bug
* that occurs when two or more threads access shared
*  data and try to change it at the same time.
*  This means a situation where the output of a piece
*  of logic requires that interleaved code is run in a particular
*  order -- an order that cannot be guaranteed.
*  2-
* yes ,println(weapon.name)
* Kotlin: Smart cast to 'Weapon' is impossible,
*  because 'weapon' is a mutable property
* that could have been changed by this time
*3-
* It works for me in two ways
It gives the same output
*also
* fun printWeaponName() {
        if (weapon != null) {
            weapon?.also {
                println(it.name)
            }
        }
    } }
    * let
    *fun printWeaponName() {
 weapon?.let { println(it) }
*  }
*
*
*
*
*
*
* */