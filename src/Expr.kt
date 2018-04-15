interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr


fun eval(e: Expr) : Int {
    if(e is Num) {
        return e.value

    }

    if(e is Sum) {
        return eval(e.left) + eval(e.right)

    }
    throw IllegalArgumentException("Unknown expression.")

}

fun evalWithLogging(e: Expr): Int = when(e) {
    is Num -> {
        println("num : ${e.value}")
        e.value

    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum : $left + $right")

        left + right

    }
    else -> throw IllegalArgumentException("Unknown expression.")

}

fun main(args: Array<String>) {
    println("eval : ${eval(Sum(Num(1), Num(2)))}")
    println("evalWithLogging : ${evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4)))}")

}