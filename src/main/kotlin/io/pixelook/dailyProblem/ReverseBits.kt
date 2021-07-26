package io.pixelook.dailyProblem

const val MOST_LEFT_BIT = 0x80000000

fun Long.reverseBits(): Long {
    var current = this
    var reversed = 0L

    for (i in 1 until 32) {
        if (current and MOST_LEFT_BIT == MOST_LEFT_BIT)
            reversed = reversed or MOST_LEFT_BIT

        current = current.shl(1)
        reversed = reversed.shr(1)
    }

    return reversed
}