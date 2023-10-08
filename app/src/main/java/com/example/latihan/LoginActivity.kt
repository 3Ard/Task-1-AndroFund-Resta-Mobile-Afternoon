package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.password)

        val bundle = intent.extras
        if (bundle != null){
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }
        val btnlogin: Button = findViewById(R.id.button)
        btnlogin.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("user", user(etUsername.text.toString(),etPassword.text.toString()))
                startActivity(intent)
                }
            }
        }
    }