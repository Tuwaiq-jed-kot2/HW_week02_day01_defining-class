import com.sun.jdi.IntegerValue

fun main() {
    print("Please type your name: ")
    val name = readLine()
    print("Please type your age: ")
    try {
        val age = readLine()?.toInt()
        print("Please type your GPA: ")
        val GPA = readLine()?.toDouble()

        val student = Student (name , age , GPA  )
        student.speak(name,age,GPA)

        print("please type the first number you want to add: ")
        val num1  = readLine()?.toInt()
        print("please type the second number you want to add: ")
        val num2 = readLine()?.toInt()

        print(student.adding(num1,num2))

    } catch (e : NumberFormatException){
        println("you enter a letter instead of number, please re run the program and type numbers")
    }


}

class Student (name:String? , age :Int? , GPA : Double?) {


    fun speak (name: String?,age: Int?,GPA: Double?){
        println("Hello my name is $name, \n I'm $age years old, \n and my GPA is $GPA")
    }

    fun adding (num1: Int?, num2 :Int?):Int?{
        print("the sum of $num1 , and $num2 is = ")
        return num2?.let { num1?.plus(it) }
    }

}