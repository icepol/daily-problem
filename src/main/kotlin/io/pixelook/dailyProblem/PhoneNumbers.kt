package io.pixelook.dailyProblem

val lettersMaps = mapOf(
    1 to listOf(),
    2 to listOf("a", "b", "c"),
    3 to listOf("d", "e", "f"),
    4 to listOf("g", "h", "i"),
    5 to listOf("j", "k", "l"),
    6 to listOf("m", "n", "o"),
    7 to listOf("p", "q", "r", "s"),
    8 to listOf("t", "u", "v"),
    9 to listOf("w", "x", "y", "z"),
    0 to listOf(),
)

val validWords = listOf(
    "dog",
    "fish",
    "cat",
    "fog",
)

fun makeWords(phone: String, current: String = "", validate: Boolean = true): List<String> {
    if (phone.isEmpty()) return listOf(current)

    val finalWords = mutableListOf<String>()

    for (letter in lettersMaps.getOrDefault(phone[0].toString().toInt(), listOf())) {
        finalWords.addAll(
            makeWords(
                current = current + letter,
                phone = phone.substring(1 until phone.length)
            ).filter { !validate || (validate && it in validWords) }
        )
    }

    return finalWords
}