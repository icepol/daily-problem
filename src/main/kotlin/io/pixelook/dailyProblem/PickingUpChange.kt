package io.pixelook.dailyProblem

fun maxChange(changeMatrix: List<List<Int>>, i: Int = 0, j: Int = 0): Int {
    return changeMatrix[i][j] + listOf(
        if (i < changeMatrix.lastIndex) maxChange(changeMatrix, i + 1, j) else 0,
        if (j < changeMatrix[i].lastIndex) maxChange(changeMatrix, i, j + 1) else 0,
    ).maxOf { it }
}