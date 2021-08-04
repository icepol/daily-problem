package io.pixelook.dailyProblem

fun swapBits(source: Long): Long {
    var sourceBits = source
    var targetBits: Long = 0

    // works for first 32 bits only
    repeat(31) {
        if (sourceBits and 1 == 0.toLong()) {
            targetBits = targetBits or 0x80000000
        }

        targetBits = targetBits.shr(1)
        sourceBits = sourceBits.shr(1)
    }

    return targetBits
}