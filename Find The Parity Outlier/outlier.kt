fun find(integers: Array<Int>): Int {
    val even = integers.count { it % 2 == 0 }      
    return if (even > 1) integers.find { it % 2 != 0 }!! else integers.find { it % 2 == 0 }!! 
}
