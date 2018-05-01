package practice.chapter_4_4

class Person (val salary: Int = 0)

// Singleton
// It define a class and make an instance.
object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        var allSalaries:Int = 0
        for (person in allEmployees) {
            allSalaries += person.salary

        }

        println("allSalaries = $allSalaries")

    }

}

fun main(arrays: Array<String>) {
    Payroll.allEmployees.add(Person(salary=100))
    Payroll.allEmployees.add(Person(salary=20))

    Payroll.calculateSalary()

}