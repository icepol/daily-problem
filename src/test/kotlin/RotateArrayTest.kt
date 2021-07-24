import io.pixelook.dailyProblem.rotateArray
import kotlin.test.*

class RotateArrayTest {
    @Test
    fun testRotateArray() {
        assertEquals(listOf(3, 4, 5, 1, 2), rotateArray(mutableListOf(1, 2, 3, 4, 5), 2))
    }
}