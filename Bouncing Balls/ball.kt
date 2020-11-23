package bouncing

fun bouncingBall(h:Double, bounce:Double, window:Double): Int {
    if (h > 0 && (bounce > 0 && bounce < 1) && window < h){
        if (h < window) return -1 else return 2 + bouncingBall((h * bounce), bounce, window)
    }
    return -1
}
