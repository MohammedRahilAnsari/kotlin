fun main() {

    //constructor
    val value = Constructor("Rahil Ansari")
    // println(value.myAge)
   // println(value.userName)

    var value2 = classs("Rahil Ansari")
    value2 = classs(23)
    value2 = classs("Rahil","Mira Road")
    println(value2)


}

//multiple constructor in single classs
class classs {

    constructor(fullName: String) {
        println(fullName)
    }
    constructor(age: Int) {
        println(age)
    }
    constructor(userName: String, address: String) {
        println(userName +" " + address)
    }


}

class Constructor(age: Int, val fName: String, val lName: String) {

    //Secondary constructor
    constructor(fullName: String) : this(0, fullName, "") {
        userName = fullName

    }

    //property
    var myAge = age

    var userName = "$fName $lName"


}