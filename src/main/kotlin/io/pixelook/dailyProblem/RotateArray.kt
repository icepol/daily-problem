package io.pixelook.dailyProblem

fun shiftByOne(source: MutableList<Int>): MutableList<Int> {
    val first = source[0]

    for (i in 1 until source.size) {
        source[i - 1] = source[i]
    }

    source[source.size - 1] = first

    return source
}

fun rotateArray(source: MutableList<Int>, rotateBy: Int): MutableList<Int> {
    for (i in 0 until rotateBy) {
        shiftByOne(source)
    }

    return source
}
