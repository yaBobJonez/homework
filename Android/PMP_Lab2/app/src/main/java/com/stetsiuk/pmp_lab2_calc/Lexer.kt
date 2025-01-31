package com.stetsiuk.pmp_lab2_calc

class Lexer(private val input: String) {
    private var pos: Int = 0;

    private fun peek(): Char? {
        return if (pos < input.length) input[pos] else null
    }
    private fun consume(): Char {
        return input[pos++]
    }

    fun tokenize(): List<Token> {
        val tokens = ArrayList<Token>()
        while (pos < input.length) {
            when (val curr = peek()) {
                '0','1','2','3','4','5','6','7','8','9','.' -> tokens.add(Token("NUMBER", parseNumber()))
                '+' -> { tokens.add(Token("PLUS")); pos++ }
                '-' -> { tokens.add(Token("MINUS")); pos++ }
                '×','*' -> { tokens.add(Token("MULT")); pos++ }
                '÷','/' -> { tokens.add(Token("DIV")); pos++ }
                '(' -> { tokens.add(Token("LPAR")); pos++ }
                ')' -> { tokens.add(Token("RPAR")); pos++ }
                else -> throw IllegalArgumentException("Unexpected character: $curr")
            }
        }
        return tokens
    }

    private fun parseNumber(): Float {
        var number = ""
        while (peek()?.isDigit() == true) number += consume()
        if (peek() != '.') return number.toFloat()
        else number += consume()
        while (peek()?.isDigit() == true) number += consume()
        return number.toFloat()
    }
}