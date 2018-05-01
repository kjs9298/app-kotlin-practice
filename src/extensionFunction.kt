import java.util.*

// extension class
fun String.lastChar() : Char = this.get(this.length - 1)

fun <T> Collection<T>.joinToString(separator: String =":", prefix: String = "", postfix: String = ""): String {
    // initialize it with prefix
    val result = StringBuilder(prefix)

    // append separator
    for((index, element) in this.withIndex()) {
        if(index > 0) result.append(separator)
        result.append(element)

    }
    // append postfix
    result.append(postfix)
    return result.toString()

}

fun Collection<String>.join(separator:String = ",") = this.joinToString(separator)

fun main(arrays: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(";", "(", ")"))
    println(list.joinToString(prefix = "(", separator = ";", postfix = ")"))
    // If you invoke this function in java, You can be comfortable by using @JvmOverloads
    println(list.joinToString(prefix="(", postfix = ")"))

    val stringList = listOf("치킨", "피자", "고기")
    println(stringList.join(", "))

    println("Chicken".lastChar())

}