package io.pixelook.dailyProblem

fun reverse(source: MutableList<Char>, start: Int, end: Int): MutableList<Char> {
    repeat((end - start) / 2) {
        val current = source[start + it]
        source[start + it] = source[end - 1 - it]
        source[end - 1 - it] = current
    }

    return source
}

fun String.reverseWords(): String {
    val letters = this.toCharArray().toMutableList()

    // reverse whole string first
    reverse(letters, 0, letters.size)

    val boundaries = letters.withIndex().filter { it.value == ' ' }.map { it.index }.toMutableList()
    boundaries.add(0, 0)
    boundaries.add(letters.size)

    boundaries.zipWithNext().forEach {
        (first, second) -> reverse(
            letters,
            if (first == 0) first else first + 1,
            second
        )
    }

    return letters.joinToString("")
}
