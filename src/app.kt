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

fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
    println(max(1, 3))

    printValues()

}