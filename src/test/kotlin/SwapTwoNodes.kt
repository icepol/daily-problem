import io.pixelook.dailyProblem.Node
import io.pixelook.dailyProblem.swapEveryTwo
import kotlin.test.*

class SwapTwoNodes {
    @Test
    fun testSwapTwoNodes() {
        assertEquals(
            Node(2, Node(1, Node(4, Node(3, Node(5))))),
            swapEveryTwo(Node(1, Node(2, Node(3, Node(4, Node(5))))))
        )
    }
}