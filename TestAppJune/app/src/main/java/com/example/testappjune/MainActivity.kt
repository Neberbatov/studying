package com.example.testappjune

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.full_layout)
//        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView1)
        textView.text = """
            BuildType = ${BuildConfig.BUILD_TYPE}
            Flavor = ${BuildConfig.FLAVOR}
            Version Name = ${BuildConfig.VERSION_NAME}
        """
    }

}