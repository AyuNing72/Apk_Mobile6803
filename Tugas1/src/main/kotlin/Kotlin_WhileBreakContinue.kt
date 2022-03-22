fun main() {
    var i = 1
    var a = 0
    var x = 1
    /** WHILE & BREAK */
    while (i < 5) {
        println(i)
        i++
        if (i == 3) {
            break
        }
    }

        /** Do While */
        do {
            println("Ayu")
            a++
        }
        while (a < 4)

    /** WHILE & CONTINUE */
        while (x < 6) {
        if (x == 4) {
            x++
            continue
        }
        println(x)
        x++
    }
}