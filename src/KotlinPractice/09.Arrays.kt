package KotlinPractice

fun main() {

    //arrays in kotlin
    //collection of similar type of data
    //contain string , int , etc
    //fixed size

/*
    //int array
    val array: Array<Any> = arrayOf(1, 2, 3, 4, "Rahil")
    println(Arrays.toString(array))
    /* println(array[3])
     println(array[2])
     array[0] = 10
     println(Arrays.toString(array))*/

    //print 1st value and last value of array
    /* println(array.first())
     println(array.last())
 */
    //update value in array
    array[0] = 10
    //or we can use
    array.set(1, 20)
    println(Arrays.toString(array))

    //index of the position of value (mostly string)

    //println(array.indexOf("Rahil"))
    */

    /*
    //int array with operations
    val array: IntArray = intArrayOf(1,2,3,4)
    //sum of array
   /* val sumOfArray : Int= array.sum()
    println(sumOfArray)
*/
    //min and max value in array
    println(array.min())
    println(array.max())
    println(array.count())
    */

    //sort an array
    val array: IntArray = intArrayOf(1,2,3,400,566,6444,788,845,901)
    val sortedArray : IntArray = array.sortedArray()

   // println(Arrays.toString(sortedArray))

    // find an element which is divisible by 100

    val number:Int? = array.find {
        it % 100 ==0
    }

    println(number)

}