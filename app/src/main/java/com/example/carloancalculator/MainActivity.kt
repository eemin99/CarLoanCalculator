package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate.setOnClickListener() {

            val car = price.text.toString()
            val down = payment.text.toString()
            val carLoan:Double = car.toDouble() - down.toDouble()

            carLoanDis.text = "%.2f".format(carLoan)

            val int = intRate.text.toString()
            val loanP = loan.text.toString()

            val interRate:Double = carLoan.toDouble()*int.toDouble()*loanP.toDouble()

            interest.text = "%.2f".format(interRate)

            val monthPay:Double = (carLoan.toDouble() + int.toDouble()) / loanP.toDouble()/12
            monthlyPay.text = "%.2f".format(monthPay)

        }
    }
}


