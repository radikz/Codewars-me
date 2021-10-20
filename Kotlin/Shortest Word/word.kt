fun findShort(s: String): Int {
    val strSplit = s.split(" ")
    var shortest: Int =  strSplit[0].length
    for (str in strSplit) if (str.length < shortest) shortest = str.length
    return shortest
}
