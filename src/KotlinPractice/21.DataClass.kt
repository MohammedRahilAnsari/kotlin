fun main() {

    /*val userOne = User("Rahil")
    val userTwo = User("Rahil")

    println(userOne)
    println(userTwo)
    println(userOne == userTwo)
    println(userOne.userName)
*/
    val userThree = NewUser("Rahil", 23)

    println(userThree.component1())
    println(userThree.component2())

    val userFour = userThree.copy( age = 24)
    println(userFour)

    //destructure data class
    val (uName,age) = userThree
    println(uName)
    println(age)



}
data class User (val userName: String)

data class NewUser ( val Name: String, val age:Int )