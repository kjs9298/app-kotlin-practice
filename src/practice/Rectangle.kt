package practice

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

}

fun createRandomRectangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())

}

fun main(args: Array<String>) {
    println("isSquare : ${createRandomRectangle().isSquare}")

}