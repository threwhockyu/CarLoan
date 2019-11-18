package com.example.carloan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<View>(R.id.buttonCalculate).setOnClickListener(){
            Calculate(it)
        }
    }
    private fun Calculate(view:View){
        val CarPrice = editTextCarPrice.text.toString()
        val carprice:Double = CarPrice.toDouble()
        val DownPayment = editTextDownPayment.text.toString()
        val downpayment = DownPayment.toDouble()
        val LoanPeriod = editTextLoanPeriod.text.toString()
        val loanperiod = LoanPeriod.toDouble()
        val InterestRate = editTextInterestRate.text.toString()
        val interstrate = InterestRate.toDouble()

       val textview2:Double
        val textview3:Double
        val textview4:Double
        textview2 = carprice - downpayment
        textview3 = textview2 * interstrate * loanperiod
        textview4 = (textview2 + textview3)/loanperiod/12
        textView2.text = "%.2f".format(textview2)
        textView3.text  = "%.2f".format(textview3)
        textView4.text  = "%.2f".format(textview4)
     }

}
