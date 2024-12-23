```kotlin
fun calculate(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Division by zero")
        0 // Or handle it another suitable way
    }
}

fun main() {
    val result = calculate(10, 0)
    println(result) // Prints 0
    val result2 = calculate(10, 2)
    println(result2) // Prints 5
}
```