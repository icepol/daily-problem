package io.pixelook.dailyProblem

data class Node(
    val value: Int,
    var next: Node? = null
) {
    override fun toString(): String {
        return "$value, ${next?.toString()}"
    }
}

fun swapEveryTwo(linkedList: Node?): Node? {
    val firstNode = linkedList ?: linkedList
    val secondNode = firstNode?.next ?: return linkedList

    firstNode.next = secondNode.next
    secondNode.next = firstNode

    firstNode.next = swapEveryTwo(firstNode.next)

    return secondNode
}
