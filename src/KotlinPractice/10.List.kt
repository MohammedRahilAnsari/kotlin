fun main() {
    //list are like dynamic arrays
    //increase / decrease size

    //mutable - immutable
    //var val

    val listOne = listOf(1, 2, 3, 4)
    //listOne.add()

    val listTwo = mutableListOf(5, 6, 7, 8,9,10,11,12,13,14,15)
    //listTwo.add(9)
    //listTwo.add(10)
    //listTwo.remove(10)

    //replace value in the list
    listTwo[0] = 50

    //check the value is present in the list or not
    println(listTwo.contains(50))

    /*println(listOne[0])
    println(listTwo)*/

    //finding first and last position
    /*println(listTwo.first())
    println(listTwo.last())*/

    //finding element in the list

    //val element = listTwo.find { it % 2 == 0 }

    //to see all the number visible by 2
    //val element = listTwo.filter { it % 2 == 0 }
    //println(element)

    /*val newlist = listTwo.map{ it * it }
    print(newlist)
*/
/*
    val evenlist = listTwo.filter {
        it % 2 == 0
    }
    println(evenlist)

    val oddlist = listTwo.filterNot {
        it % 2 ==0
    }

    println(oddlist)
*/
/*
    // creating sublist from the listtwo values
    //slice and sublist
    // define position or index of listtwo

    //will include all the index within given range
    val slicelist = listTwo.slice(0..3)
    println(slicelist)

    //specific index in parameter
    // won't add the last index within the given range
    val sublist = listTwo.subList(0,3)
    println(sublist)
*/

/*
    //first 4 elements
    //from beginning
    val list = listTwo.take(5)
    println(list)

    //from last
    val llist = listTwo.takeLast(5)
    println(llist)
*/
/*
    //if the list position is not exist but you want your code to continue instead of stopping it
    println(listTwo.elementAtOrNull(12))
    println(listTwo[0])
*/
/*
    //checking if the list is empty or not
    val emptylist = emptyList<Int>()
    println(emptylist.isEmpty())
    println(listTwo.isEmpty())
*/
    //sorting list value
    val sortedlist = listTwo.sort()
    println(sortedlist)

}