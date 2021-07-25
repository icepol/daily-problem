import io.pixelook.dailyProblem.maxChange
import kotlin.test.*

class PickingUpChangeTest {
    @Test
    fun testMaxChange() {
        val changeMatrix = listOf(
            listOf(0, 3, 0, 2),
            listOf(1, 2, 3, 3),
            listOf(6, 0, 3, 2),
        )

        assertEquals(13, maxChange(changeMatrix))
    }
}