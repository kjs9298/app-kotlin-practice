package practice.chapter_4_1

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")

    fun showOff() = println("I'm focusable !")

}