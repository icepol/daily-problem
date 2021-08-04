import io.pixelook.dailyProblem.hasCharacterMap
import kotlin.test.*


class CharacterMapTest {
    @Test
    fun testHasCharacterMap() {
        assertTrue(hasCharacterMap("abc", "def"))
        assertFalse(hasCharacterMap("aac", "def"))
    }
}