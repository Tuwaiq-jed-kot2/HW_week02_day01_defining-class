//part1
fun main() {

    val qussai = Student("Qussai", 21, 3.5)

    qussai.Speak()
    println(qussai.add(10, 20))
}

class Student( val name: String, val age: Int, val GPA: Double) {
    fun Speak() {
        println("my name $name and I am $age years old and my GPA $GPA ")
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}



//part//Q1type of concurrency bug that occurs when two or more threads access shared data and try to change it at the same time


//Q2 yes