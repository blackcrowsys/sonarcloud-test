fun apply(aFunction: () -> String) {
    println(aFunction.invoke())
}

fun something() = "Hello There"

fun main(args : Array<String>) {
    apply { something() }

    println("Last thing")
}