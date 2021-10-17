fun main() {

    val student = Student("Azzam", 26, 2.8)
    student.speake()
    student.TwoNumAdd(5, 4)

}

class Student(var Sname: String, var Sage: Int, var SGPA: Double) {

    fun TwoNumAdd(num1: Int, num2: Int) {
        val sum: Int = num1 + num2
        println("Number 1 + Number 2 = $sum")
    }

    fun speake() {
        println("WELCOME this is your Requested Info:\nName=$Sname\nAge=$Sage\nGPA=$SGPA")
    }

}