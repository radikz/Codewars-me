fun persistence(num: Int): Int {
    val str = num.toString().split("").filterNot{number -> number == ""}
    if (str.size == 1) return 0
    var sum = 1
    for (a in str){
        sum *= a.toInt()
    }
    return 1 + persistence(sum)
}
