package com.example.myapplicationcalculator

import android.annotation.SuppressLint
import android.content.pm.ModuleInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etinput = findViewById<EditText>(R.id.etinput)
        var etoutput = findViewById<EditText>(R.id.etoutput)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnMultiply = findViewById<Button>(R.id.buttonMultiply)
        var btnmodulus = findViewById<Button>(R.id.buttonModulus)
        var btnsubstration = findViewById<Button>(R.id.buttonSub)
        var tvTotal = findViewById<TextView>(R.id.tvTotal)
        btnAdd.setOnClickListener {
            if (etinput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else if (etoutput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var input = etinput.text.toString().toInt()
                var output = etoutput.text.toString().toInt()
                var addTotal =input + output
                tvTotal.text = "Answer:${addTotal}"
            }
        }
        btnsubstration.setOnClickListener {
            if (etinput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else if (etoutput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var input = etinput.text.toString().toInt()
                var output = etoutput.text.toString().toInt()
                var SubTotal = input + output
                tvTotal.text = "Answer:${SubTotal}"

            }

        }
        btnMultiply.setOnClickListener {
            if (etinput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else if (etoutput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var input = etinput.text.toString().toInt()
                var output = etoutput.text.toString().toInt()
                var multiplyTotal = input + output
                tvTotal.text = "Answer:${multiplyTotal}"
            }

        }
        btnmodulus.setOnClickListener {
            if (etinput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else if (etoutput.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var input = etinput.text.toString().toInt()
                var output = etoutput.text.toString().toInt()
                var moduleTotal = input + output
                tvTotal.text = "Answer:${moduleTotal}"
            }}}}