package io.pixelook.dailyProblem

fun hasCharacterMap(first: String, second: String): Boolean {
    // different size, mapping is not possible
    if (first.length != second.length) return false

    // same key, mapping is not possible
    if (first.length != first.toSet().size) return false

    return true
}