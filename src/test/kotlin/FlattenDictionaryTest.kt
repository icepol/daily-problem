import io.pixelook.dailyProblem.flattenDictionary
import kotlin.test.*

class FlattenDictionaryTest {
    @Test
    fun testFlattedDictionary() {
        val source = mapOf(
            "a" to 1,
            "b" to mapOf(
                "c" to 2,
                "d" to mapOf(
                    "e" to 3
                )
            )
        )

        val expected = mapOf(
            "a" to 1,
            "b.c" to 2,
            "b.d.e" to 3
        )

        assertEquals(expected, flattenDictionary(source))
    }
}