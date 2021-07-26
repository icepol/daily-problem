import io.pixelook.dailyProblem.reverseBits
import kotlin.test.*

class ReverseBitsTest {
    @Test
    fun testReverseBits() {
        assertEquals(1260388352, 1234L.reverseBits())
    }
}