package KotlinPractice

fun main() {
//nullable in kotlin
    /*  val name = "rahil"
      var fname:String? = "Rahil" // To String or other data type if we add ?after specifying datatype
                                  // then it will be nullable DataType
      println(fname)
      fname = null
      println(fname)*/

    var fullname: String? = "Rahil"
    /* println(fullname?.length) //to know the length of the nullable object
                              // we need to add ? to the object to perform task
     fullname = null
     println(fullname?.length) // even if the object is null as it's defined as nullable we need to add ?to perform task
     */

    //another way to check if object is null or not

   /* if (fullname != null) println("not null")
    else println("null")
    */

    //elvis operator
    //kotlin way to check the object is  null or not
    val length = fullname?.length ?:0
    println(length)

}