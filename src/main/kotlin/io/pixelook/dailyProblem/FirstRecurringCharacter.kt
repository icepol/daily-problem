package io.pixelook.dailyProblem

fun String.firstRecurring(): Char? {
    return this.zipWithNext { a, b -> if (a == b) a else null  }.firstOrNull { it != null }
}