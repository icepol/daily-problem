package io.pixelook.dailyProblem.nearesPoints

data class Point(
    val x: Int,
    val y: Int,
) {
    override fun toString(): String {
        return "($x, $y)"
    }

    val vector: Int
        get() = x + y
}

fun closestPoints(points: List<Point>, k: Int, p: Point): List<Point> {
    return points.sortedBy { it.vector - p.vector }.subList(0, k)
}