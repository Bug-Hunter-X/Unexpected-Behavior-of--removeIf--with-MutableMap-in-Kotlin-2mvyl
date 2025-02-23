The `removeIf` function on a `MutableMap` should not be used directly.  It is designed to work on collections and iterators; using it directly with a `Map` might result in unexpected behaviour. Instead, use the `entries` property to create an iterator of `Map.Entry` and removeIf should be applied to this iterator.

fun main() {
    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    map.entries.removeIf { it.key % 2 == 0 }
    println(map) // Correct Output: {1=one, 3=three}
} 