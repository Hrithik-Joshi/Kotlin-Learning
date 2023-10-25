import java.util.*

fun main(args: Array<String>) {
//    val input1= Scanner(System.`in`).nextInt()
//    println("Enter Integer: $input1")
//    val str= readln()
//    println(str)
//    println(myFirstFunc("Hrithik"))
    var obj= OuterClass(5,3);

}

//Primary Constructor
//fun myFirstFunc(fName:String):Int {
//    println(fName)
//    return 1
//}

//Secondary Constructor
 class OuterClass {

     constructor(a:Int,b:Int){
        println(func(a,b))
     }
     private fun func(x:Int, y:Int):Int{
         return x+y;
     }
}
