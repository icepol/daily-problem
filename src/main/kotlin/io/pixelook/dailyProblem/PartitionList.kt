package io.pixelook.dailyProblem

fun partitionList(numbers: List<Int>, k: Int): List<Int> {
    val (smaller, higher) = numbers.partition { it < k }
    return listOf(smaller, higher).flatten()
}