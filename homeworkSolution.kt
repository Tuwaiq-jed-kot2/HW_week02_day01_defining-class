# Kotlin Programming 
---
fun main() {
    val studentIt= Student("Bashayer",29,2.5)
    studentIt.printInfo()
    studentIt.speack()
    studentIt.sum()



}
class Student (val name:String ,val age:Int, val GPA:Double ){


    fun speack(){
        println("welcome $name,here you can write a comment to your teacher!! ")
        val comment= readLine()
        println("thank you, for taking time to leave this comment.")
    }
    fun sum(){
        try {
            println("welcome $name Enter 2 number to add!")
            val num1 = readLine()?.toInt()
            println("Enter the second number!")
            val num2 = readLine()?.toInt()
            val result = num1!! + num2!!
            println("the Result = $result")
        }catch (e:NumberFormatException){
            println("litter not allowed only numbers")
        }
    }

    fun printInfo(){
        println("$name, your age is $age , and your GPA $GPA")
    }
}