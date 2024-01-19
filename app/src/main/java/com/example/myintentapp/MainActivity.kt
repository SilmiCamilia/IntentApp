package com.example.myintentapp


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)

        val btnBiodata : Button = findViewById(R.id.btn_data_lengkap)
        btnBiodata.setOnClickListener(this)
    }

    override fun onClick(v: View) {
            when (v.id) {
                R.id.btn_move_activity -> {
                    val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                    startActivity(moveIntent)
                }

                R.id.btn_move_activity_data -> {
                    val moveWithDataIntent =
                        Intent(this@MainActivity, MoveWithDataActivity::class.java)
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "chimi")
                    moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 16)
                    startActivity(moveWithDataIntent)
                }
                R.id.btn_data_lengkap -> {
                    val bbio =
                        Intent(this@MainActivity, DataLengkap::class.java)
                    bbio.putExtra(DataLengkap.EXTRA_NAME, "chimi")
                    bbio.putExtra(DataLengkap.EXTRA_AGE, 16)
                    bbio.putExtra(DataLengkap.EXTRA_ADDRES, "malang")
                    startActivity(bbio)
                }
                R.id.btn_dial_number -> {
                    val phoneNumber = "081210841382"
                    val dialPhoneIntent = Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel:$phoneNumber"))
                    startActivity(dialPhoneIntent)
                }
            }
    }
}