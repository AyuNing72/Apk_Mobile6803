fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20
    val isOpen = now > officeOpen

    /** Boolean Expression
    Greater than (>) */
    println(officeOpen > officeClosed) //return false, karna officeOpen kurang besar dari officeClose
    println(16 > 7) //return true, karna 16 lebih besar dari 7

    /** Equal to (==) */
    println(now == 20) //return true, karna merupakan value now adalah equal 20
    println(20 == 30) //return false, karena 20 bukan equal dari 30

    /** Boolean Disjunction/OR (||) */
    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose ")

    /** Boolean Negation/NOT(!!) */
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}