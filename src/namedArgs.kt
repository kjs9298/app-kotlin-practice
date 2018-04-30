const val DIRECTION_TO_RIGHT = "->"

fun printWorks(before: String, current: String, after: String) {
    println("$before $DIRECTION_TO_RIGHT $current $DIRECTION_TO_RIGHT $after")

}

fun printWorksWithDefault(before: String = "밥 먹기", current: String, after: String = "커피 마시기") {
    println("$before -> $current -> $after")

}

fun main (args: Array<String>) {
    printWorks("밥 먹기", "영화 보기", "커피 마시기")
    printWorks(after = "커피 마시기", current = "영화 보기", before = "밥 먹기")

    printWorksWithDefault(current = "게임 하기")

}