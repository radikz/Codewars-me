package countdig

fun nbDig(n: Int, d: Int): Int {
    var index: Int = 0
    var count = 0

    while (index <= n){
        var square = index * index
        val letters = square.toString().split("")
    
        for (letter in letters){
            if (letter.contains(d.toString())){
                count += 1
            }
        }
        index += 1
    }
    return count
}
