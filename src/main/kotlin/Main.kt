const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    var money = 10
    println(money)

    money = 5
    println(money)

    val name = "Maria"
    println(name)

    println(PI)

    val boolean = true
    val longNumber = 3L
    val double = 2.718
    val float = 1.1f

    val firstValue = 20
    val secondValue = 10
    val thirdValue = firstValue -secondValue
    println(thirdValue)

    val surname = "Azul"
    val nameT = "Cielo"
    val fullName = "My name is $nameT $surname"
    println(fullName)


}