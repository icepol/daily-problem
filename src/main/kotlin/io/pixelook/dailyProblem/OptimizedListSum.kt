package io.pixelook.dailyProblem

class ListFastSum(val numbers: List<Int>) {

    fun sum(start: Int, end: Int): Int {
        var result = 0

        for (i in start until end) {
            result += numbers[i]
        }

        return result
    }
}