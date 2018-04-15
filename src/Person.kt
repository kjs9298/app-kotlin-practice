class Person (

        val name: String,     // read-only
        var isMarried: Boolean // writable

)

fun readProperties(person: Person) {
    println("name : ${person.name}")
    println("isMarried : ${person.isMarried}")

}

fun updateProperties(person: Person) {
    person.isMarried = true

}

fun main(args: Array<String>) {
    val person = Person("Zisu", false)
    readProperties(person)
    updateProperties(person)
    readProperties(person)

}