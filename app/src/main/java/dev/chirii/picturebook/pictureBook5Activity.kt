package dev.chirii.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pictureBook5Activity : AppCompatActivity() {
    lateinit var btnBack5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book5)

        btnBack5 = findViewById(R.id.btnBack5)

        btnBack5.setOnClickListener {
            val intent = Intent(this, pictureBook4Activity::class.java)
            startActivity(intent)
        }
    }
}