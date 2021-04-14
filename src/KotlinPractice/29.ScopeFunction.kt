fun main() {

    // scope function that are covered below
    //let / run / also / apply
    //it -> let / also
    // this -> run / apply

    //let and run return Result
    //also and apply return same object

    //----------------------------------------------------------
/*
    //it  -> let
    val number = mutableListOf("One","Two","Three","Four", "Five")

    number.map { it.length }.filter { it > 3 }.let {
        println(it)
    }

    //it -> also
    val nullableString : String? = "null"
    nullableString.let { println(it) }
*/
/*
    //this -> run
    val info= Personone("Rahil","Ansari").run {
       address = "XYZ"
        getInfo()
    }
    println(info)
*/
/*
    //this -> apply
    val info = Persontwo("Rahil","Ansari").apply {
        address = "XYZ"
        phoneNumber ="123"
        getinfo()
    }
    //println(info.getinfo())
    println(info.toString())
*/

    //it -> also
    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")

    val finalResult = numbers
        .map { it.length }
        .also { println(it) }
        .filter { it > 3 }

    println(finalResult)

}

//example for run
class Personone(val firstName: String, val lastName: String) {

    var address: String = "unknown"

    fun getInfo() = "first name = $firstName \n last name = $lastName \n address = $address"

}

//example for apply
class Persontwo(val firstName: String, val lastName: String) {
    var address: String = "Unknown"
    var phoneNumber: String = "Unknown"

    fun getinfo() =
        "first name = $firstName \n last name = $lastName \n phone number = $phoneNumber  \n address = $address "

    override fun toString(): String {
        return "$firstName $lastName $phoneNumber $address"
    }

}