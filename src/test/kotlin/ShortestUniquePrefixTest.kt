import io.pixelook.dailyProblem.shortestUniquePrefix
import kotlin.test.*

class ShortestUniquePrefixTest {
    @Test
    fun testShortestUniquePrefix() {
        assertEquals(
            listOf("jom", "joh", "ja", "t"),
            shortestUniquePrefix(listOf("joma", "john", "jack", "techlead"))
        )
    }
}