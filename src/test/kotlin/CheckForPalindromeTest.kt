import io.pixelook.dailyProblem.palindrome
import kotlin.test.*

class CheckForPalindromeTest {
    @Test
    fun testCheckForPalindrome() {
        assertEquals("mom", "momo".palindrome())
        assertEquals("mom", "amomo".palindrome())
        assertEquals("momom", "momom".palindrome())
        assertEquals("bb", "abb".palindrome())
        assertEquals("bb", "bba".palindrome())
    }
}