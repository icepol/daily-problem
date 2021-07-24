import io.pixelook.dailyProblem.makeChange
import kotlin.test.*

class MakingChangeTest {
    @Test
    fun makingChangeTest() {
        assertEquals(listOf(25, 10, 1), makeChange(listOf(1, 5, 10, 25), 36))
    }
}