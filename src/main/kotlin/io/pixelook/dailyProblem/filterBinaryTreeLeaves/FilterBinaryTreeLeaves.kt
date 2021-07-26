package io.pixelook.dailyProblem.filterBinaryTreeLeaves

data class Node(
    val value: Int,
    var left: Node? = null,
    var right: Node? = null,
) {
    override fun toString(): String {
        return "value: $value, left: (${left}), right: (${right})"
    }

    fun filterLeaves(k: Int): Node? {
        left = left?.filterLeaves(k)
        right = right?.filterLeaves(k)

        // last node matches the value
        if (left == null && right == null && value == k)
            return null

        return Node(
            value, left, right
        )
    }
}

