//Parent Class
open class Employee(private var name: String, private var id: Int) {
    open var role: String = "Employee"

    //A method that returns a String indicating what work the employee is doing.
    //This method should use the role property in its return value
    open fun work(): String {
        return "role $role name $name id $id is working."
    }

    //A method that returns a String indicating to whom the employee is reporting.
    open fun report(): String {
        return "role $role name $name id $id is reporting to their supervisor."
    }
}