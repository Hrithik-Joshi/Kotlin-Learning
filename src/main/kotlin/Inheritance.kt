//base class with open keyword
open class BaseClass1 {
    val name = "Learning Kotlin"
    fun a() {
        println("Base Class 1")
    }
}

//By default, primary constructor is there.
class DerivedClass1 : BaseClass1() {
    fun b() {
        println(name)
        println("Derived Class 1")
    }
}

//We initialize the primary constructor and the secondary constructor of the base class in different way
//Primary Constructor is initialize in the derived class with the help of derived class parameters
open class BaseClass2(private var name: String, private var age: Int) {
    fun a() {
        println("My Name is $name, age $age.")
    }
}

class DerivedClass2(name: String, age: Int, salary: Double) : BaseClass2(name, age) {
    init {
        a()
        println("And My Salary is $salary")
    }
}

//Secondary constructor is initialze in the derived class with super keyword using the parameters of the derived class
open class BaseClass3 {
    constructor(name: String, age: Int) {
        println("My name: $name age: $age")
    }
}

class DerivedClass3 : BaseClass3 {
    constructor(name: String, age: Int, salary: Double) : super(name, age) {
        println("Salary: $salary")
    }
}

//Similarly we can override the function of the base class in the derived class
open class BaseClass4 {
    open fun name() {
        println("This is base class.")
    }
}

class DerivedClass4 : BaseClass4() {
    override fun name() {
        println("This is derived class.")
    }
}

//Similarly we can call base class members in derived class using super keyword
open class BaseClass5 {
    var name = "Hrithik"
}

class DerivedClass5 : BaseClass5() {
    fun a() {
        println("My name is " + super.name)
    }
}

//Since the obj is never modified therefore using val
fun main(args: Array<String>) {
//    val obj1 = DerivedClass1()
//    obj1.a()
//    obj1.b()
//    val obj2 = DerivedClass2("Hrithik", 23, 150.00)
//    val obj3= DerivedClass3("Hrithik",23,150.00)
//    val obj4=DerivedClass4()
//    val obj41=BaseClass4()
//    obj4.name()
//    obj41.name()
    val obj5 = DerivedClass5()
    obj5.a()
}