# Kotlin MutableMap removeIf Unexpected Behavior

This repository demonstrates an uncommon error related to the `removeIf` function in Kotlin when applied to `MutableMap` objects.  While `removeIf` works intuitively with `MutableList` and `MutableSet`, its behavior with maps is nuanced.

The core issue is understanding how `removeIf` interacts with the map's iterator.  The predicate function (`it`) receives a `Map.Entry`, not just the key or value.  If the condition evaluates to `true`, the entire entry (key-value pair) is removed.

**See `Bug.kt` for the buggy code and `BugSolution.kt` for the correct usage.**