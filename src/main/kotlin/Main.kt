import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val manipulations = Manipulations()
    val first: Int
    val second: Int
    val operation: String
    val result: Int

    val reader = BufferedReader(InputStreamReader(System.`in`))

    println("Input first value")
    first = reader.readLine().toInt()


    println("Input operations")
    operation = reader.readLine()

    println("Input second value")
    second = reader.readLine().toInt()

    when (operation) {
        "+" -> result = manipulations.plus(first, second)
        "-" -> result = manipulations.minus(first, second)
        "*" -> result = manipulations.umnozit(first, second)
        "/" -> result = manipulations.razdelit(first, second)
        else -> result = 0
    }
    println(result)
}

class Manipulations {
    fun plus(x: Int, y: Int): Int {
        return x + y
    }

    fun minus(x: Int, y: Int): Int {
        return x - y
    }

    fun umnozit(x: Int, y: Int): Int {
        return x * y
    }

    fun razdelit(x: Int, y: Int): Int {
        return x / y
    }
}





