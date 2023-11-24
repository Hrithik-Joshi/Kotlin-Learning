data class DataClass(var name: String, var company: String) {
    var age: Int = 0
}

fun main(args: Array<String>) {
    var obj = DataClass("Hrithik", "Nagarro")
    obj.age = 23

    //toString() return string of all parameter defined in primary constructor but not of the class body
    println(obj.toString())
    println(obj.age)

    //copy() copy all the parameters that are used and we can modify the parametrs as well.
    var obj2 = obj.copy("Srishti")
    println(obj2.toString())

    //equals() return true if the two object contain the same content or not
    //if two objects are equals then there hashcode will also wbe equal
    var obj3 = obj.copy()
    val hash1 = obj.hashCode()
    val hash2 = obj.hashCode()
    println("Hash1 = $hash1 Hash2 = $hash2")
    println("hash1 == hash2 ${hash1 == hash2}")
}


