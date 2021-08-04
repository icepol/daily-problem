package io.pixelook.dailyProblem

fun flattenDictionary(source: Map<String, Any>, keyPrefix: String? = null): MutableMap<String, Int> {
    val flatDictionary = mutableMapOf<String, Int>()

    for ((key, value) in source) {
        val flatKey = listOfNotNull(keyPrefix, key).joinToString(".")

        if (value is Int)
            flatDictionary[flatKey] = value
        else
            flatDictionary.putAll(flattenDictionary(value as Map<String, Any>, flatKey))
    }

    return flatDictionary
}
