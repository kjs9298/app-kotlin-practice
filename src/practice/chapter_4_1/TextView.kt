package practice.chapter_4_1

class TextView: View {
    override fun getCurrentState(): State = TextViewState()

    override fun restoreState(state: State) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // Nested class : It doesn't save the reference of outer class.
    class TextViewState : State {

    }

}