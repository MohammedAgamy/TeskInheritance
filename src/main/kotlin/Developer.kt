
//child class from Employee
class Developer(private var name:String,private var id:Int,private val programmingLanguage: String)
    :Employee(name,id) {

    override var role: String ="Developer"


    override fun work(): String {
        return "$role $name is coding in $programmingLanguage."

    }

    override fun report(): String {
        return "$role $name is reporting to their manager."
    }

}