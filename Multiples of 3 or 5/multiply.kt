fun solution(number: Int): Int {
    var sum = 0
    for (i in 1..number-1) if (i % 3 == 0 || i % 5 == 0) sum += i
    return sum
}
