import io.pixelook.dailyProblem.ListFastSum
import kotlin.test.*

class OptimizedListSum {
    @Test
    fun testOptimizedListSum() {
        assertEquals(12, ListFastSum(listOf(1, 2, 3, 4, 5, 6, 7)).sum(2, 5))
    }
}