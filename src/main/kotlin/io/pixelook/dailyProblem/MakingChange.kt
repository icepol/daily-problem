package io.pixelook.dailyProblem

fun makeChange(coins: List<Int>, amount: Int): List<Int> {
    if (coins.isEmpty() || amount == 0) return listOf()

    val coinValue = coins.last()
    val numberOfCoins = amount / coinValue
    val remaining = amount % coinValue

    val change = List(numberOfCoins) { coinValue }.toMutableList()
    change.addAll(
        makeChange(coins.subList(0, coins.size - 1), remaining)
    )

    return change
}