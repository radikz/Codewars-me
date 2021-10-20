fun findMissingLetter(array: CharArray): Char {
    val ascii = array.map{ (it.toInt()) }
    var a: Int = 0
    var char: Char? = null
    for (miss in ascii.first()..ascii.last()){
        if(!miss.equals(ascii[a])) {
            char = miss.toChar()
            break
        }
        a++  
    }
    return char!!
}
