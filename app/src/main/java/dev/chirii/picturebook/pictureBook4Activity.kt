package dev.chirii.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook4Activity : AppCompatActivity() {
    lateinit var btnLEDsBack: Button
    lateinit var btnLEDSNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book4)

        btnLEDsBack = findViewById(R.id.btnLEDsBack)
        btnLEDSNext = findViewById(R.id.btnLEDSNext)

        btnLEDsBack.setOnClickListener {
            val intent = Intent(this, pictureBook3Activity::class.java)
            startActivity(intent)
        }
        btnLEDSNext.setOnClickListener {
            val intent = Intent(this, pictureBook5Activity::class.java)
            startActivity(intent)
        }
    }
}