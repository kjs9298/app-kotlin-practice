package practice.chapter_4_1

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State)

}