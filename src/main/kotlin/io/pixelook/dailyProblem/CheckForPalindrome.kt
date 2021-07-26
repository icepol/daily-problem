package io.pixelook.dailyProblem

fun String.palindrome(): String? {
    if (this.length <= 1) return null

    if (this == this.reversed()) return this

    return listOf(
        this.substring(0, this.length - 1).palindrome(),
        this.substring(1, this.length).palindrome(),
    ).firstOrNull { it != null }
}