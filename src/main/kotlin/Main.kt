fun main(args: Array<String>) {


    //create an instance of either Manager , but store it in a variable of type Employee
    val typeOfDeveloper:Employee =Developer("Mohamed" , 255 , "Java")

    // Call the work() and report() methods
    println("print work from Dev ${typeOfDeveloper.work()}")
    println("print report from Dev ${typeOfDeveloper.report()}")


}