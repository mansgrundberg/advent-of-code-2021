package days

import common.*

fun partOne(input: List<Int>): Int {
    return input.zipWithNext().count { it.first < it.second };
}

fun partTwo(input: List<Int>): Int {
    return input.windowed(3) { it.sum() }.zipWithNext().count { it.first < it.second };
}

fun main() {
    val input = Input.asIntList(1);
    println(partOne(input));
    println(partTwo(input));
}