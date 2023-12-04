import scala.io.StdIn.readInt
object stringOperation extends App{
    var str1="Hello of Scala"
    var str2="Scala"
    var str3=""

    str3=str1.concat(str2)
    println(str3)
    println(str1.endsWith("la"))
    println(str2.indexOf("a"))

    println(str1==str2)
    println(str1.equals(str2))
    println(str1.compareTo(str2))
    println(str1.charAt(5))

}