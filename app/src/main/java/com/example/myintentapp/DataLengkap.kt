package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataLengkap : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_lengkap)
        val biodata: TextView = findViewById(R.id.btn_biodata)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val address = intent.getStringExtra(EXTRA_ADDRES)
        val text = "Name : $name, Age : $age, Address : $address "
        biodata.text = text
    }

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ADDRES = "extra_adres"
    }
    }
