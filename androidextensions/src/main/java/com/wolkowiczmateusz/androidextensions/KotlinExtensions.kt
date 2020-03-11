package com.wolkowiczmateusz.androidextensions

inline fun <T> Iterable<T>.only(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return false
    for (element in this) if (!predicate(element)) return false
    return true
}