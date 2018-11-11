package io.github.vstollen.math

fun binomialkoeffizient(n: Int, k: Int): Int {
    if (n == 0) {
        if (k == 0) return 1
        else return 0
    } else {
        return binomialkoeffizient(n-1, k) + binomialkoeffizient(n-1, k-1)
    }
}

fun main(args: Array<String>) {
    println(binomialkoeffizient(5, 2))
}