fun main() {

    val sum = comObject.add(5,10)
    print(sum)

}
class comObject{

    //companion object is similar like static methods in java

    companion object{
        fun add(num1:Int , num2:Int) = num1.plus(num2)
    }

}