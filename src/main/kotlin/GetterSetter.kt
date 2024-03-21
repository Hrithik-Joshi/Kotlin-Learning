import java.util.*

class GetterSetter(var name: String, var age: Int, var salary: Int) {

    //custom getter and setter
    var emp_name: String = name
        get() {
            return field.uppercase()
        }
    var emp_age: Int = age
        set(value) {
            field = value
        }
    var emp_salary: Int = salary
        set(value) {
            field = value
        }
}

fun main(args: Array<String>) {
    var obj = GetterSetter("Hrithik", 20, 10000)
    println(obj.name)
    println(obj.emp_name)
    obj.emp_name = "Srishti"
    obj.age = 27
    obj.emp_salary = 20000
    println("Employee name is ${obj.emp_name} age is ${obj.emp_age} and salary is ${obj.emp_salary}")
}