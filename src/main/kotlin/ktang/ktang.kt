package ktang


inline operator fun String.times(times: Int): String = this.repeat(times)

fun <T> time(action: () -> T): Pair<Double, T> {
    val start = System.nanoTime()
    var ret = action()
    val elapsed = (System.nanoTime() - start) / 1000000.0

    println("Elapsed time: $elapsed msecs")

    return Pair(elapsed, ret)
}
