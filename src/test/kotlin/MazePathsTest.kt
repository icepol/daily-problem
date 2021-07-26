import io.pixelook.dailyProblem.pathsThroughMaze
import kotlin.test.*

class MazePathsTest {
    @Test
    fun testMazePaths() {
        val maze = listOf(
            listOf(0, 1, 0),
            listOf(0, 0, 1),
            listOf(0, 0, 0),
        )

        assertEquals(2, pathsThroughMaze(maze))
    }
}