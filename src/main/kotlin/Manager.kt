//child class from Employee
class Manager(private var name:String,private var id:Int,private val department: String)
    :Employee(name , id) {
    override var role: String = "Manager"

    //
    override fun work(): String {
        return "role $role name $name id $id iis managing the $department department.."
    }

    override fun report(): String {
        return "role $role name $name id $id is reporting to the company board.."

    }



}