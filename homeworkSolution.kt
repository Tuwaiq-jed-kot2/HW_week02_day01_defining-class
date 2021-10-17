fun main() {
    //write a kotlin program with student class that has three proprty "name" and "age" and "GPA"
    //and give the student abilty to (speake hint:use print ) and the abilty to add two numbers
    val str=Student("FAISAL",26,4.50)
    if (str.studentGPA>5.00 || str.studentAge<=5){
        println("the value can't be true ")
    }

    else{
        str.abiltyToSpeake()
        str.abiltyToAddTwoNumbers(30,50)
    }}
class Student ( val studentName:String,val studentAge:Int, val studentGPA:Double){


    fun abiltyToSpeake(){
        println("Hi \n my name is $studentName \n I am $studentAge years old \n my GPA is $studentGPA")
    }
    fun  abiltyToAddTwoNumbers (num1:Int,num2:Int) {
        val Result=num1+num2
        println("\n$num1 + $num2 = $Result")
    }}




/*
part2:
read the code below and answer the questions
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
}
Q1 = what dose Race Conditions mean
A1 =  race condition is an undesirable situation that occurs when a device
or system attempts to perform two or more operations at the same time
 like when some other part of your program simultaneously modifies the
  state of your code in a manner that leads to unpredictable results.

Q2 = is there any Race Conditions in the code
A2 = yes, I Think is about the line  if (weapon != null) { println(weapon.name)}

Q3 = what's the best way to solve the compiling error in the code using scopeFunction
A3 = we must use a scope function, maybe in this situation use also


class Weapon(val name: String)
class Player {
var weapon: Weapon? = Weapon("Ebony Kris")
fun printWeaponName() {
   weapon?.also {
       println(it.name)
   }
   fun main() {
       Player().printWeaponName()
   }

}}



*/

