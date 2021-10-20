package growth

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int): Int {
    var count = 0
    var p0 = pp0.toDouble()
    while(p0 < p){
        p0 = p0 + p0 * percent / 100 + aug
        count++
    }
    return count  
}
