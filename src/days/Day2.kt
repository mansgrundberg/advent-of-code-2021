package days

import common.*

data class Command(val action: String, val units: Int)

data class Submarine(var horizontal: Int = 0, var depth: Int = 0, var aim: Int = 0)

fun partOne(input: List<String>): Int {
    var sub = Submarine();
    input.map { parse(it) }.forEach {
        when (it.action) {
            "forward" -> sub.horizontal += it.units
            "up" -> sub.depth -= it.units
            "down" -> sub.depth += it.units
        }
    }
    return sub.horizontal * sub.depth;
}

fun partTwo(input: List<String>): Int {
    var sub = Submarine();
    input.map { parse(it) }.forEach {
        when (it.action) {
            "forward" -> {
                sub.horizontal += it.units
                sub.depth += sub.aim * it.units
            }
            "up" -> sub.aim -= it.units
            "down" -> sub.aim += it.units
        }
    }
    return sub.horizontal * sub.depth;
}

fun parse(command: String): Command {
    val (a, b) = command.split(" ");
    return Command(a, b.toInt());
}

fun main() {
    val input = Input.asStringList(2);
    println(partOne(input))
    println(partTwo(input))
}