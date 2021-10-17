fun main() {
    print("Part I - defining a class")

    println("Plesae enter name student ")
    var name: String? = readLine()!!

    println("Plesae enter age student ")
    var age: Int = readLine()!!.toInt()

    println("Plesae enter GPA student ")
    var GPA: Double = readLine()!!.toDouble()

//call fun to speak
    val stuInfo = Student(name!!, age!!, GPA!!)
    stuInfo.studentSpeak()

    println("Please enter first number")
    val num1 = readLine()!!.toInt()

    println("Please enter socend number")
    val num2 = readLine()!!.toInt()
    println(stuInfo.addNum(num1,num2))
}


class Student(val Name:String, val Age:Int, val GPA:Double){

    fun studentSpeak(){
        println("Hi, My name is $Name I'm $Age years old, and my GPA is $GPA")
    }

    fun addNum(num1:Int,num2:Int):Int{
        return num1 + num2
    }
}