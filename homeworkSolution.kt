fun main() {

    val students = Students("Hind Zaki", 1133901703, 4.7)
    students.printInfo()
    students.speak("")
    println(students.adding(9, 8))
}

open class Students(private var name: String, private var ID: Int, private var GPA: Double) {


    fun printInfo() {

        println("Hi = $name \n Your ID =$ID \n Your GPA =$GPA ")

    }

    fun speak(massage: String) {
        println(massage)
    }

    fun adding(number1: Int, number2: Int): Int {
        return number1 + number2
    }


}
