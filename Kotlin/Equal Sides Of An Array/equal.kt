object EqualSidesOfAnArray {
  fun findEvenIndex(arr:IntArray): Int {
    var sumLeft = 0
    var sumRight = 0
    for (i in 0..arr.size - 1){
        for (l in (i + 1)..arr.size - 1) sumRight += arr[l]
        for (k in 0..i-1) sumLeft += arr[k]
        if (sumLeft == sumRight) return i
        sumRight = 0
        sumLeft = 0
    }
    return -1
  }
}
