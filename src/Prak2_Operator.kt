fun main(args: Array<String>) {
   /*
    var maybeNumber: Int? = 15
    maybeNumber = null
    //println(maybeNumber * 2)

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    //println(s2.length)

    */
    /*
    //Null safety
    //The !! operator
    var maybeNumber: Int? = 15
    println(maybeNumber!! * 2)

    maybeNumber = null
    println(maybeNumber!! * 2)

     */
    /*
    //Conditions
    var maybeNumber: Int? = 15
    if (maybeNumber != null)
        println(maybeNumber * 2)
    else
        println("The entered value isn't a number")

     */
    //Pemanggilan yang aman (Safe Calls)
    //Safe calling
//?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
//The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}