import io.pixelook.dailyProblem.filterBinaryTreeLeaves.*
import kotlin.test.*

class FilterBinaryTreeLeavesTest {
    @Test
    fun testFilterBinaryTreeLeaves() {
        val n5 = Node(2)
        val n4 = Node(1)
        val n3 = Node(1, n4)
        val n2 = Node(1, n5)
        val n1 = Node(1, n2, n3)

        var expected = Node(1, Node(1, Node(2, null), null), null)

        assertEquals(
            expected,
            n1.filterLeaves(1)
        )
    }
}