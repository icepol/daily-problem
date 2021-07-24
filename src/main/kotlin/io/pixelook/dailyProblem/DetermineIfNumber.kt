package io.pixelook.dailyProblem

const val allowed = "-0123456789e."
const val onceOnly = "-e."

fun String.isNumber(): Boolean {
    if (this.any { it !in allowed }) return false

    if (this.filter { it in onceOnly }.groupBy { it }.any { it.value.count() > 1 }) return false

    if ("-" in this && this.indexOf("-") != 0) return false

    if ("e" in this && this.indexOf(".") > this.indexOf("e")) return false

    return true
}