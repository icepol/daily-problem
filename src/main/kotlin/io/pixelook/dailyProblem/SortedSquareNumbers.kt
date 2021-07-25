package io.pixelook.dailyProblem

import kotlin.math.abs

fun squareNumbers(source: List<Int>): List<Int> {
    var negativeIndex = 0
    var positiveIndex = 0

    for (i in 0 until source.size - 1) {
        if (abs(source[i]) < source[i + 1]) {
            negativeIndex = i
            positiveIndex = i + 1

            break
        }
    }

    val final = mutableListOf<Int>()

    while (true) {
        if (negativeIndex < 0 || (positiveIndex <= source.size - 1 && source[positiveIndex] < abs(source[negativeIndex]))) {
            // element on the right side must go now
            final.add(source[positiveIndex] * source[positiveIndex])
            positiveIndex++
        }
        else if (negativeIndex >= 0) {
            final.add(source[negativeIndex] * source[negativeIndex])
            negativeIndex--
        }

        if (negativeIndex < 0 && positiveIndex >= source.size)
            break
    }

    return final
}