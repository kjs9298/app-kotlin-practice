package practice.chapter_4_2

class User constructor(_nickname:String = "Pig") {
    val nickname = _nickname

    /*val nickname: String

    init {
        nickname = _nickname
    }*/
}

fun main(arrays: Array<String>) {
    val user = User("Chicken")
    println(user.nickname)

    val user2 = User()
    println(user2.nickname)

}