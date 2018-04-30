open class View {
    open fun click() = println("View clicked !")

}

class Button: View() {
    override fun click() = println("Button clicked !")

}

fun View.showOff() = println("View show off!") // static function

fun Button.showOff() = println("Button show off!")

val String.lastChar: Char
    get() = get(length - 1)

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
    view.showOff()

    println("abcde".lastChar)

}