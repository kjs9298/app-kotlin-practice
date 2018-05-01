import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)

    } catch (e: NumberFormatException) {
        null

    } finally {
        reader.close()

    }

}

fun main(arrays: Array<String>) {
    println(readNumber(BufferedReader(StringReader("not number"))))
    println(readNumber(BufferedReader(StringReader("1234"))))

}