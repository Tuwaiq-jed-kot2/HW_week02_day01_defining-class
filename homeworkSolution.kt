fun main() {
    val stu = Student("Ahmed",22,4.50)

    stu.speak(true)
    println(stu.add(89,55))

}

class Student(private val name: String, private val age:Int, private val GPA: Double){
    fun speak(speaking: Boolean){
        if (speaking) {
            println("$name is speaking")
        }else{
            println("$name don't have permission to speak")
        }
    }
    fun add(num1:Int,num2:Int):Int{
        return num1 + num2
    }
}
