fun toCamelCase(str:String): String {
    val strSplit = str.split("_", "-")
    var comb = ""
    for (index in 0..strSplit.size-1) if (index == 0) comb += strSplit[index] else comb += strSplit[index].capitalize()
    return comb
}
