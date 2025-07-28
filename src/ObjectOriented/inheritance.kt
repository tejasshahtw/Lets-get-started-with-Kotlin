package ObjectOriented

open class Employee(open var name: String, open var id: Int, open var salary: Int)  {
    init {
        println("Employee object created")
    }

    fun printDetails() {
        println("Name: $name, ID: $id, Salary: $salary")
    }
}

class Person(override var name: String, override var id: Int,override var salary: Int) :Employee(name, id, salary) {
    fun getMonthlySalary():Int {
        return salary/12
    }
}

fun main() {
    var person=Person("John", 1, 10000000)
    person.printDetails()
    println(person.getMonthlySalary())
}