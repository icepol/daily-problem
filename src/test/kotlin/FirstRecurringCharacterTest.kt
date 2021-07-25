import io.pixelook.dailyProblem.firstRecurring
import kotlin.test.*

class FirstRecurringCharacterTest {
    @Test
    fun firstRecurringCharacter() {
        assertEquals('t', "quertty".firstRecurring())
        assertEquals(null, "querty".firstRecurring())
    }
}