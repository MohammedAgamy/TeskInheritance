<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>
<body>

<h1>Employee Management System</h1>

<p>This repository contains a basic implementation of an employee management system in Kotlin. It demonstrates object-oriented programming concepts using a parent class <code>Employee</code> and two child classes: <code>Manager</code> and <code>Developer</code>.</p>

<h2>Overview</h2>
<p>The system consists of:</p>
<ul>
    <li><strong>Employee:</strong> A base class representing a general employee with basic attributes and methods.</li>
    <li><strong>Manager:</strong> A subclass of <code>Employee</code> with additional functionality specific to managers.</li>
    <li><strong>Developer:</strong> A subclass of <code>Employee</code> with additional functionality specific to developers.</li>
</ul>

<h2>Classes</h2>

<h3>Employee</h3>
<p>The <code>Employee</code> class is the parent class with the following properties and methods:</p>
<ul>
    <li><strong>Properties:</strong>
        <ul>
            <li><code>name</code>: A private property representing the employee's name.</li>
            <li><code>id</code>: A private property representing the employee's ID.</li>
            <li><code>role</code>: An open property that is initialized to "Employee".</li>
        </ul>
    </li>
    <li><strong>Methods:</strong>
        <ul>
            <li><code>work()</code>: Returns a string indicating what work the employee is doing. This method uses the <code>role</code> property in its return value.</li>
            <li><code>report()</code>: Returns a string indicating to whom the employee is reporting.</li>
        </ul>
    </li>
</ul>

# 

  ```kotlin
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
```

# 

<h3>Manager</h3>
<p>The <code>Manager</code> class extends <code>Employee</code> and provides additional functionality specific to managers:</p>
<ul>
    <li><strong>Additional Property:</strong>
        <ul>
            <li><code>department</code>: A private property representing the department managed by the manager.</li>
        </ul>
    </li>
    <li><strong>Overrides:</strong>
        <ul>
            <li><code>role</code>: Overrides the role to "Manager".</li>
            <li><code>work()</code>: Returns a string indicating that the manager is managing their department.</li>
            <li><code>report()</code>: Returns a string indicating that the manager is reporting to the company board.</li>
        </ul>
    </li>
</ul>

# 

  ```kotlin
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
```

#

<h3>Developer</h3>
<p>The <code>Developer</code> class extends <code>Employee</code> and provides additional functionality specific to developers:</p>
<ul>
    <li><strong>Additional Property:</strong>
        <ul>
            <li><code>programmingLanguage</code>: A private property representing the programming language the developer uses.</li>
        </ul>
    </li>
    <li><strong>Overrides:</strong>
        <ul>
            <li><code>role</code>: Overrides the role to "Developer".</li>
            <li><code>work()</code>: Returns a string indicating that the developer is coding in a specific programming language.</li>
            <li><code>report()</code>: Returns a string indicating that the developer is reporting to their manager.</li>
        </ul>
    </li>
</ul>


# 

  ```kotlin
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
```
#

<h2>Usage</h2>
<p>To use these classes, create instances of <code>Manager</code> and <code>Developer</code> and call their methods to see how they work.</p>

<h3>Example</h3>

```Kotlin
fun main() {
    val manager = Manager("Alice", 1, "Engineering")
    val developer = Developer("Bob", 2, "Kotlin")

    println(manager.work())   // Outputs: role Manager name Alice id 1 is managing the Engineering department.
    println(manager.report()) // Outputs: role Manager name Alice id 1 is reporting to the company board.

    println(developer.work()) // Outputs: Developer Bob is coding in Kotlin.
    println(developer.report()) // Outputs: Developer Bob is reporting to their manager.
}

```
#

<h2>Contributing</h2>
<p>Feel free to contribute to this project by submitting pull requests or opening issues.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>

</body>
</html>
