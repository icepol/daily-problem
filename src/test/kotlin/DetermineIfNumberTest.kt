import io.pixelook.dailyProblem.isNumber
import kotlin.test.*

class DetermineIfNumberTest {
    @Test
    fun testDetermineIfNumberValid() {
        assertTrue("123".isNumber())
        assertTrue("12.3".isNumber())
        assertTrue("-123".isNumber())
        assertTrue("-.3".isNumber())
        assertTrue("1.5e5".isNumber())
    }

    @Test
    fun testDetermineIfNumberInvalid() {
        assertTrue(!"12a".isNumber())
        assertTrue(!"1 2".isNumber())
        assertTrue(!"1e1.2".isNumber())
    }
}