/*--------Part I--------*/
fun main() {
val Bashayr = StudentClass("Bashayr", 26, 4.00)
Bashayr.printInfo()
Bashayr.changeName("yahya")
Bashayr.changAge(27)
Bashayr.changGPA(4.5)
Bashayr.printInfo()
sum(20, 30)
Bashayr.printInfo()
}

class StudentClass(var name: String, var age: Int, var GPA: Double) {

    fun changeName(newName: String)
    {
        name = newName
        println(" name after edit  :$name")
    }

    fun changAge(newAge:Int)
    {
        age = newAge
        println(" age after edit  :$age")
    }

    fun changGPA(newGPA:Double)
    {
        GPA = newGPA
        println(" GPA after edit is :$GPA")
    }

    fun printInfo()
    {
        println("Your name= $name \nYour age = $age years\nYour GPA = $GPA")
    }
}

fun sum(number1: Int, number2: Int) {
println("$number1 + $number2 = ${number1 + number2}")
}


/*--------Part II--------
Q1 -> what dose Race Conditions mean

when two or more parts of your program try to change the same variable
simultaneously which will cause unpredicted results

Q2 -> is there any Race Conditions in the code

yes  .. in the weapon variable

Q3 -> what's the best way to solve the compiling error in the code using scopeFunction

also, because it is used as a local variable which will not be affected by other parts

*/signment.md) file to get started.