import io.pixelook.dailyProblem.partitionList
import kotlin.test.*

class PartitionListTest {
    @Test
    fun testPartitionList() {
        assertEquals(
            listOf(2, 2, 2, 2, 2, 2, 2, 5, 5),
            partitionList(listOf(2, 2, 2, 5, 2, 2, 2, 2, 5), 3)
        )
    }
}