/*--------------------------------Part I--------------------------------------*/
fun main() {
    val ahmed = StudentClass("Ahmed", 19, 99.02)
    ahmed.printInfo()
    ahmed.changeName("Mohammed")
    ahmed.changAge(18)
    ahmed.changGPA(99.3)
    ahmed.printInfo()
    sum(12, 33)
    name.printInfo()
}

class StudentClass(var name: String, var age: Int, var GPA: Double) {

    fun changeName(newName: String)
    {
        name = newName
        println("Your name after edit is :$name")
    }

    fun changAge(newAge:Int)
    {
        age = newAge
        println("Your age after edit is :$age")
    }

    fun changGPA(newGPA:Double)
    {
        GPA = newGPA
        println("Your GPA after edit is :$GPA")
    }

    fun printInfo()
    {
        println("Your name= $name \nYour age = $age years\nYour GPA = $GPA")
    }
}

fun sum(number1: Int, number2: Int) {
    println("$number1 + $number2 = ${number1 + number2}")
}

