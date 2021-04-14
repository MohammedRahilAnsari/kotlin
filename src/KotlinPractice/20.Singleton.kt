fun main() {

    //singleton = same instance through out


    println(UserProfile.toString())
    println(UserProfile.add(1,3))
    println(UserProfile.toString())

}

object UserProfile {

    fun add(num1 :Int , num2:Int)= num1.plus(num2)

}
