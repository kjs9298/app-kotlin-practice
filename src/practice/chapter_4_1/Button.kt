package practice.chapter_4_1

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")
    // override is required.

    override fun showOff() {
        super<Focusable>.showOff()
    }

}