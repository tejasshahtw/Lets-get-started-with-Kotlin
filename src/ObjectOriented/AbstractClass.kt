package ObjectOriented

abstract class EmployeeClass(open var name: String, open var id: Int, open var salary: Int)  {
    init {
        println("Employee object created")
    }

    fun printDetails() {
        println("Name: $name, ID: $id, Salary: $salary")
    }

    abstract fun greet()

}

class PersonClass(override var name: String, override var id: Int,override var salary: Int) :EmployeeClass(name, id, salary) {
    fun getMonthlySalary():Int {
        return salary/12
    }

    override fun greet() {
        println("Hello I'm $name")
    }
}

fun main() {
    var personClass= PersonClass("John", 1, 10000000)
    personClass.printDetails()
    println(personClass.getMonthlySalary())
    personClass.greet()
}