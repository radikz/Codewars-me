fun findScreenHeight(width: Int, ratio: String): String {
    val strRatio = ratio.split(":").map{ (it.toInt()) }
    return width.toString().plus("x").plus((width * strRatio[1] / strRatio[0]).toString())
}
