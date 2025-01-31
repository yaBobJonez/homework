package com.stetsiuk.pmp_lab2_calc

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var exprEdit: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        exprEdit = findViewById(R.id.expr_edit);
    }

    fun actionAddSymbol(view: View) {
        if (view !is Button) return
        exprEdit.append(view.text)
    }

    fun actionClear(view: View) {
        exprEdit.setText("")
    }
    fun actionBackspace(view: View) {
        if (exprEdit.length() > 0) {
            exprEdit.setText(exprEdit.text.substring(0, exprEdit.length() - 1))
        }
    }

    fun actionEvaluate(view: View) {
        if (exprEdit.length() == 0) return
        try {
            val tokens = Lexer(exprEdit.text.toString()).tokenize()
            val result = Parser(tokens).parse()
            exprEdit.setText(result.toString())
        } catch (e: Exception) {
            exprEdit.setText(getString(R.string.syntax_error))
        }
    }
}