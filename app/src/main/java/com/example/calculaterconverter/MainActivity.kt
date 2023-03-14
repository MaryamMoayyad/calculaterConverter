package com.example.calculaterconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
   lateinit var textNum : TextView
    val inputType=""
    val inputNumber=""


    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initvalu()
    }

    private fun initvalu() {
     textNum =findViewById(R.id.input)   }

    private fun onClickNumber(y: View) {
        val newDigit=(y as Button).text.toString()
        val oldDigit=textNum.text.toString()
        val newTextNum=oldDigit+newDigit
        textNum.text=newTextNum
    }


    fun hexToBinary(hexa: String) = hexa.toInt(16).toString(2)

    fun octalToBinary(octal: String) = octal.toInt(8).toString(2)

    fun convertAndDisplayResult(binaryConverter: (String) -> String,
                                octalConverter: (String) -> String,
                                decimalConverter: (String) -> String,
                                hexConverter: (String) -> String) {
        val binary = findViewById<TextView>(R.id.txtBin)
        val octal = findViewById<TextView>(R.id.txtOct)
        val decimal = findViewById<TextView>(R.id.txtDis)
        val hexa = findViewById<TextView>(R.id.txtHex)

        binary.text = binaryConverter(inputNumber)
        octal.text = octalConverter(inputNumber)
        decimal.text = decimalConverter(inputNumber)
        hexa.text = hexConverter(inputNumber)
    }
        }


//     fun onClickNumber(view: View) {
//         val inputNumberTextView: TextView = findViewById(R.id.input)
//        inputNumberTextView.text = "${inputNumberTextView.text}${view.id.toString().last()}"
//            }

        fun binaryToOctal(binary: String): String? {
        val decimal = binary.toIntOrNull(2)
            return decimal?.toString(8)
            }


    fun decimalToOctal(decimalNumber: Int): String {
        return Integer.toString(decimalNumber, 8)
    }
    fun hexToOct(hex: String): String {
        return Integer.parseInt(hex, 16).toString(8)
    }

    fun inputType(view: View){
        Log.i("massed", inputType)
        inputType=(view as TextView).text.toString()
    }

    fun decimalToHex(decimal: Int) = decimal.toString(16).uppercase()

    fun octalToHex(octal: String): String {
        return octal.toIntOrNull(8)?.let { decimal ->
            decimal.toString(16).uppercase()
        } ?: throw IllegalArgumentException("Invalid octal input: $octal")
    }

    fun hexaToOct(hex: String) {
        val decimal = hex.toLong(16)
    }
    fun octTodecimal(octal: String): String {
        return  octal.toInt(8).toString()
    }
    fun hexatodecimal(hex: String): String {
        return hex.toInt(16).toString()
    }
    fun binaryToDecimal(binary: String):String {
        return binary.toInt(2).toString()
    }
    fun binaryToHex(binary: String): String {
        val decimal = binary.toInt(2)
        return decimal.toString(16).uppercase()
    }


}