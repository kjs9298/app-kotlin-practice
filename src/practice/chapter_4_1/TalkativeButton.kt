package practice.chapter_4_1

class TalkativeButton : Focusable {
    private fun yell() = println("HEY!!!!")

    private fun whisper() = println("hey.....")

    fun giveSpeeach() {
        yell()

        whisper()

    }

}
