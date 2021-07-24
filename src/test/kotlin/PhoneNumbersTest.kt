import io.pixelook.dailyProblem.makeWords
import kotlin.test.*

class PhoneNumbersTest {
    @Test
    fun testPhoneBook() {
        assertEquals(listOf("dog", "fog"), makeWords("364"))
    }
}