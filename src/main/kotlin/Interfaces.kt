//Basic example of interface
interface Interfaces {
    fun add(a: Int, b: Int = 5)
    fun print() {
        println("This is the default method defined in the interface.")
    }
}

class Helping : Interfaces {
    override fun add(x: Int, y: Int) {
        val res = x + y
        println("Sum is $res")
    }

    override fun print() {
        super.print()
        println("This is default class")
    }
}

//Multiple inheritance in interface
interface InterfaceProperties {
    val x: Int
    val y: String
        get() = "Hello"

}

interface InterfaceMethods {
    fun print()
}

class MultipleInterface : InterfaceProperties, InterfaceMethods {
    override val x: Int
        get() = 50

    override fun print() {
        println("Multiple Interfaces implemented")
    }
}

fun main(args: Array<String>) {
//    val obj = Helping()
//    obj.add(5)
//    obj.print()
    val obj = MultipleInterface()
    obj.print()
}