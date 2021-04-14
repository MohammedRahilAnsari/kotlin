fun main() {

    //printing 0 to 100
    /*for (number in 0..100)
        println(number)
    */

    //to exclude the last value printing
    /*for (number in 0 until 100)
        println(number)
    */

    //printing number with certain gaps
    /*for (number in 0..100 step 5)
        println(number)

    for (number in 0 until 100 step 2)
        println(number)*/

    //printing number in reverse order
    /*for (num in 20 downTo 0)
        println(num)
        println(" ")

    for (num in 20 downTo 0 step 4)
        println(num)*/

    // loop with list and it's index

    val list = listOf("Minato", "Kakashi", "Itachi", "Naruto", "Sasuke")

   /* for (index in list.indices) {
        print(index )
        // printing items along with the index
        println(" " + list[index])
    }*/

    for ((index, value) in list.withIndex()){
        print(index)
        println(" "+ value)
    }
}