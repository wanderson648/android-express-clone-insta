package com.wo.cloneinsta.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout
import com.wo.cloneinsta.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<TextInputLayout>(R.id.login_edit_email_input)
            .error = "Esse email é inválido"
    }
}