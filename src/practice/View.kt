package practice

open class View {
    open fun click() = println("practice.View clicked !")

}

class Button: View() {
    override fun click() = println("practice.chapter_4_1.Button clicked !")

}

fun View.showOff() = println("practice.View show off!") // static function

fun Button.showOff() = println("practice.chapter_4_1.Button show off!")

val String.lastChar: Char
    get() = get(length - 1)

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()

    println("abcde".lastChar)

}