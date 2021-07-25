package io.pixelook.dailyProblem

fun shortestUniquePrefix(words: List<String>): List<String> {
    val sorted = words.sorted()
    val prefixes = MutableList(sorted.size) { "" }

    for ((firstWord, secondWord) in sorted.zipWithNext()) {
        var prefixLength = 1

        for (i in 0..listOf(firstWord, secondWord).minOf { it.length }) {
            if (firstWord[i] == secondWord[i])
                prefixLength++
            else
                break
        }

        if (prefixes[words.indexOf(firstWord)].length < prefixLength)
            prefixes[words.indexOf(firstWord)] = firstWord.substring(0, prefixLength)

        if (prefixes[words.indexOf(secondWord)].length < prefixLength)
            prefixes[words.indexOf(secondWord)] = secondWord.substring(0, prefixLength)
    }

    return prefixes
}