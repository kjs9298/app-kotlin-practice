fun parsePathAndPrint(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBefore(".")
    val extension = fullName.substringAfter(".")

    println("directory : $directory")
    println("fileName : $fileName, exetension : $extension")

}

fun main(arrays: Array<String>) {
    parsePathAndPrint("/Users/Chicken/Desktop/sample.jpg")

}