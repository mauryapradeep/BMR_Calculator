package com.example.bmr_kt_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bmr_kt_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val  binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        binding.mySpinner.

////       FOR MANS BMR CALCUTION
//        val man = (10*edtTextWeight)+ (6.25 * edtTextHeight) - (5 * edtTextAge)+5
//
//
////        FOR WOMANS BMR CALCULATION
//        val woman = (10*edtTextWeight)+ (6.25 * edtTextHeight) - (5 * edtTextAge) - 161





        binding.btnCheck.setOnClickListener{
            val edtTextAge = binding.edtAge.text.toString().toDoubleOrNull() ?: 0.0
            val edtTextWeight = binding.edtWeight.text.toString().toDoubleOrNull() ?: 0.0
            val edtTextHeight = binding.edtHeight.text.toString().toDoubleOrNull() ?: 0.0

            val manCalories = bmrManCal(edtTextWeight, edtTextHeight, edtTextAge);
            binding.results.text="Your Daily Calories need: $manCalories"




        }
    }

    private fun  bmrManCal(weight: Double, height: Double, age:Double):Double
    {
        return ((10*weight)+ (6.25 * height) - (5 * age)+5)
    }

    private fun  bmrWomanCal(weight: Double, height: Double, age:Double):Double
    {
        return ((10*weight)+ (6.25 * height) - (5 * age)+16)
    }



}