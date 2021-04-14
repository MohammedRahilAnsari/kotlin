fun main() {

    val age = 26

    try {
        getAge(age)
    } catch (e: Exception) {
        println(e)
    } finally {
        println("Finally Called")
    }

}

fun getAge(age: Int) {
    if (age < 30) {
        throw MyAgeException(age)
    }
}

class MyAgeException(val age: Int) : Exception("$age is not valid")