import io.pixelook.dailyProblem.reverseWords
import kotlin.test.*

class ReverseWordsTest {
    @Test
    fun testReverseWords() {
        assertEquals("this read you can", "can you read this".reverseWords())
    }
}