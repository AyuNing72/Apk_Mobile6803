import java.util.*

/** Kotlin Variable Var & Val */
fun main(){
    var name = "Hello " // String (text)
    val nim = 112201906284 // String (Number)
    println(" \'Variables\' \n" + name + "Dewi Putri Ayuningsih") //print the value of name
    println(nim) //print the value of nim

    /** Kotlin STRING */
    val txt = "Teh Pucuk Harum menyegarkan"
    val txt1 = "Aqua Mineral"
    val txt2 = "Aqua Mineral"
    val txt4 = "Aqua"
    val txt3 = "Teh Pucuk 'Harum' Menyegarkan! "

    /** Kotlin String Length */
    println("\n \'String\' \nThe Length of the txt string is : " + txt.length)

    /** Kotlin String Functions */
    println(txt1.uppercase(Locale.getDefault()))
    println(txt1.lowercase(Locale.getDefault()))

    /** Kotlin String Comparing Strings */
    println(txt1.compareTo(txt))
    println(txt1.compareTo(txt2))

    /** Kotlin Finding a String in a String */
    println(txt3.indexOf("Harum"))

    /** Kotlin String Concatenation */
    println(name + " " + txt1)
    println(name.plus(txt4))

    /** Kotlin String Templates/Interpolation */
    println("My Name is $name")

}