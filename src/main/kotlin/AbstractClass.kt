open class ParentClass{
    open fun helper(){
        println("This is parent open class")
    }
}
abstract class AbstractClass: ParentClass() {
    override fun helper(){
        println("This is abstract class override the open class method")
    }
}

class ChildClass:AbstractClass(){
    override fun helper() {
        println("This is child class override the abstract class")
    }
}

fun main(){
    var parent = ParentClass()
    parent.helper()
    var child=ChildClass()
    child.helper()
}