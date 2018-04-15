import java.util.*

fun printMap() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary

    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")

    }

}

fun printList() {
    val list = arrayListOf("치킨", "삼겹살", "피자")
    for((index, element) in list.withIndex()) {
        println("$index : $element")

    }

}

fun isLetter(c: Char) = c in 'a'..'z'|| c in 'A'..'Z'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "숫자"
    in 'A'..'Z' -> "대문자"
    in 'a'..'z' -> "소문자"
    else -> "머임?"

}

fun main(args: Array<String>) {
    printMap()
    printList()

    val specialLetter = '^'
    val letter = 'a'
    println("$specialLetter : ${isLetter(specialLetter)}")
    println("$letter : ${isLetter(letter)}")

    println("k는 ${recognize('k')}")
    println("K는 ${recognize('K')}")
    println("3는 ${recognize('3')}")
    println("*는 ${recognize('*')}")

}