Answer Q1


fun main() {


    println(" name student ")
    var name: String? = readLine()!!

    println(" age student ")
    var age: Int = readLine()!!.toInt()

    println("GPA student ")
    var GPA: Double = readLine()!!.toDouble()


    class Student(val Name: String, val Age: Int, val GPA: Double) {




        fun speakStu (name: String?,age: Int?,GPA: Double?){
            println("Hi my name is $name, \n I'm $age years old, \n  my GPA : $GPA")
        }

        fun add (num1: Int?, num2 :Int?):Int?{
            print("the sum of $num1 , and $num2 is = ")
            return num2?.let { num1?.plus(it) }
        }

    }
}
///Answer Q2
Race conditions occur when two threads interact in
a negatve way depending on the exact order
that their different instruction are executed
Answer Q3///
Yes, In the <<println(weapon.name)
Answer Q4//
we must use a scope function, maybe in this situation use also

