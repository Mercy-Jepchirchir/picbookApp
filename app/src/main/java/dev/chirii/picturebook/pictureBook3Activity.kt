package dev.chirii.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook3Activity : AppCompatActivity() {
    lateinit var btnBack2 : Button
    lateinit var btnNext2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)

        btnBack2= findViewById(R.id.btnBack2)
        btnNext2 = findViewById(R.id.btnNext2)

        btnBack2.setOnClickListener {
            val intent = Intent(this, pictureBook2Activity::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            val intent = Intent(this, pictureBook4Activity::class.java)
            startActivity(intent)
        }
    }
}