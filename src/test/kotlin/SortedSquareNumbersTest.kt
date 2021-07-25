import io.pixelook.dailyProblem.squareNumbers
import kotlin.test.*

class SortedSquareNumbersTest {
    @Test
    fun testSortedSquareNumbers() {
        assertEquals(
            listOf(0, 1, 1, 9, 16, 25, 25),
            squareNumbers(listOf(-5, -3, -1, 0, 1, 4, 5))
        )
    }
}