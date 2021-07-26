package io.pixelook.dailyProblem

fun pathsThroughMaze(maze: List<List<Int>>, x: Int = 0, y: Int = 0): Int {
    // we have one valid path
    if (y == maze.lastIndex && x == maze.last().lastIndex) return 1

    // we are out of the maze
    if (y > maze.lastIndex || x > maze.last().lastIndex) return 0

    // there is a wall
    if (maze[y][x] == 1) return 0

    return listOf(
        pathsThroughMaze(maze,x + 1, y),
        pathsThroughMaze(maze, x, y + 1),
    ).sum()
}