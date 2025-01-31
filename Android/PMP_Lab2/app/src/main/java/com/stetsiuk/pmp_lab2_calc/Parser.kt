package com.stetsiuk.pmp_lab2_calc

class Parser(private val tokens: List<Token>) {
    private var pos = 0

    private fun peek(position: Int = 0): Token? {
        return if (pos + position < tokens.size) tokens[pos + position] else null
    }
    private fun match(type: String): Boolean {
        val check = peek()?.type == type
        if (check) pos++
        return check
    }
    private fun consume(type: String): Token {
        val curr = tokens[pos++]
        if (curr.type != type)
            throw IllegalArgumentException("Unexpected token: ${curr.type}")
        return curr
    }

    // expr
    //  : expr (MULT | DIV) expr    # multiplication
    //  | expr (PLUS | MINUS) expr  # addition
    //  | (PLUS | MINUS)* expr      # unary
    //  | LPAR expr RPAR            # factor
    //  | number                    # factor
    //  ;
    fun parse(): Float {
        return expr()
    }

    private fun expr(): Float {
        return addition()
    }
    private fun addition(): Float {
        val left = multiplication()
        if (match("PLUS")) return left + multiplication()
        else if (match("MINUS")) return left - multiplication()
        return left
    }
    private fun multiplication(): Float {
        val left = unary()
        if (match("MULT")) return left * unary()
        else if (match("DIV")) return left / unary()
        return left
    }
    private fun unary(): Float {
        if (match("PLUS")) return unary()
        else if (match("MINUS")) return - unary()
        return factor()
    }
    private fun factor(): Float {
        if (match("LPAR")) {
            val expr = expr()
            consume("RPAR")
            return expr
        }
        return consume("NUMBER").value as Float
    }
}