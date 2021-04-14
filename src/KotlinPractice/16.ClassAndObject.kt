fun main() {
    //class = blueprint
    //object = implementation of the blue print


    //class object
    val var1 = Person()
    val var2 = Person()


    println(var1.age)
    var1.myAge(23)
    println(var1.age)
    println(var2.age)


}

//class
class Person {

    //property
    var age = 0

    //function
    fun myAge(myAge: Int) {

        age = myAge

    }
}