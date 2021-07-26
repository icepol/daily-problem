import io.pixelook.dailyProblem.nearesPoints.*
import kotlin.test.*

class NearestPointsTest {
    @Test
    fun testNearestPoints() {
        val points = listOf(
            Point(0, 0),
            Point(1, 1),
            Point(2, 2),
            Point(3, 3),
        )

        assertEquals(
            listOf(
                Point(0, 0),
                Point(1, 1),
            ),
            closestPoints(points, 2, Point(0, 2))
        )
    }
}