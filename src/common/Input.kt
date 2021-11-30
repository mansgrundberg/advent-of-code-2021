package common

import java.io.File

class Input {
    companion object {

        fun asCharMatrix(day: Int): List<List<Char>> {
            return asStringList(day).map { row -> row.toCharArray().map { it.toChar() } }
        }

        fun asIntList(day: Int): List<Int> = asStringList(day).map { it.toInt() };

        fun asStringList(day: Int): List<String> = readInput(day).lines();

        fun asString(day: Int) = readInput(day);

        private fun readInput(day: Int): String {
            val file: String = "resources/$day.txt"
            return File(file).readText();
        }
    }

}