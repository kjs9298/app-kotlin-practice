package practice.chapter_4_2

interface Student {
    val email: String
    val nickname: String
        get() = email.substringBefore('@')

}

class AStudent(override val email: String) : Student {
    override fun toString() = "AStudent(email=$email, nickname=$nickname)"

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is AStudent) {
            return false

        }
        return email == other.email

    }

}

fun main(arrays: Array<String>) {
    val student = AStudent("zisu@naver.com")
    println("email : ${student.email}")
    println("nickname : ${student.nickname}")

    println(student.toString())

    val otherStudent = AStudent("zisu@naver.com")
    println(student == otherStudent) // operator == is same as equals()

}