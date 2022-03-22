fun main() {
    val number1 = 6
    val mixArray = arrayOf(1,3,5,7, "ApkMobile", true)
    val s = "Array result = "
    val o = ","

    /** When Expression */
    val stringOfValue = when (number1) {
        6 -> {
            println(" \'When Expression\' \nSix")
            "value is 6"
        }
        7 -> {
            println("'When Expression' \nSeven")
            "value is 7"
        }
        8 -> {
            println("'When Expression' \nEight")
            "value is 8"
        }
        else -> {
            println("'When Expression' \nundefined")
            "value cannot be reached"
        }
    }
    println(stringOfValue)

    /** Array Element */
    println("\n 'Array Expression' \n"+ s + mixArray[4])
    println(s + mixArray.size) //Array length/size

    /** Check if an Element Exists */
    if ("ApkMobile" in mixArray){
        println(s + "It exists!\n\n \'For Loop & Range Expression\'")
    }else {
        println("It does not exist")
    }

    /** Loop/range Through an Array break/continue for */
    for (x in 22.rangeTo(28)){
        if (x == 25){
            break
        }
        println(x)
    }
    /** Continue range/loop array */
    for (y in 16.downTo(12)) {
        if (y == 14) {
            continue
        }
        print( o + y)
    }
}