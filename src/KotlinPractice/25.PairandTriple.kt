fun main() {

    // Pair = 2 value

    /*

    val pair = Pair<String, Int> ("Rahil", 23)
    val pairtwo = Pair<String, String>("Rahil", "23")

    //destructuring
    val (firstName:String, lastName: String) = Pair("Rahil", "Ansari")

    //assiging list to pair
    val list = pair.toList()

    println(pair)
    println(pair.first)
    println(pair.second)
    println(pairtwo.first)
    println(pairtwo.second)

    println(firstName)
    println(lastName)

    println(list[0])
    println(list[1])

    */

    //Triple = 3 value

    val triple = Triple<String, String, Int>("Rahil","Ansari", 23)

    println(triple.first)
    println(triple.second)
    println(triple.third)

}