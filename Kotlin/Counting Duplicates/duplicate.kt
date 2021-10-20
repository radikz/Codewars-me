fun duplicateCount(text: String): Int  = text.split("").map{ it.toUpperCase() }.groupingBy { it }.eachCount().filter { it.value > 1 }.size - 1
