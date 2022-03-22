fun <T> checkType(args: T): String {
    /** here I use return values to return the type of data values according to the existing parameters.  */
    return when (args){
        is Int -> return "Yes! it's Integer"
        is String -> return "Yes! it's String"
        is Char -> return "Yes! it's Char"
        is Boolean -> return "Yes! it's Boolean"
        is Double -> return "Yes! it's Double"
        is List <*> -> return "Yes! it's List"
        is Map<*, *> -> return "Yes! it's Map"
        else -> "undefined"
    }
}

fun vehicle() = mapOf<String, String>(
    "type" to "motorcycle",
    "maxSpeed" to "230Km/s",
)

fun main() {
    println(
        """
        '[10, 9, 8 , 6]' is List? ${checkType(listOf(10, 9, 8, 6))}
        'Hello Word' is String? ${checkType("Hello Word")}
        'True' is Boolean? ${checkType(true)}
        '10.01' is Double? ${checkType(10.01)}
        '5' is int? ${checkType(5)}
        'D' is Char? ${checkType('D')}
        My Map Result : ${vehicle()} 
        ${checkType(vehicle())}
    """.trimIndent()
    )
}
