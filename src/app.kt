import jdk.nashorn.internal.objects.Global.eval
import java.util.*

fun max(a: Int, b: Int) : Int = if (a > b) a else b

fun printValues() {
    val str = "Hello!"
    val num = 10
    val floatNum = 7.5e6
    println(floatNum)

    val num2 : Int
    num2 = 10
    println(num2)

}

fun readProperties(person: Person) {
    println("name : ${person.name}")
    println("isMarried : ${person.isMarried}")

}

fun updateProperties(person: Person) {
    person.isMarried = true

}

fun createRandomRectangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())

}

fun main(args: Array<String>) {

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
    println(max(1, 3))

    printValues()

    val person = Person("Zisu", false)
    readProperties(person)
    updateProperties(person)
    readProperties(person)

    println("isSquare : ${createRandomRectangle().isSquare}")


}