package practice

// Local Function : It can reduce duplicate code
class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${this.id}: empty $fieldName")

        }

    }

    validate(this.name, "Name")
    validate(this.address, "Address")

}

fun saveUser(user: User) {
    user.validateBeforeSave()

}

fun main(arrays: Array<String>) {
    saveUser(User(1, "Jisu", "Here"))
    saveUser(User(2, "Jisu", ""))

}