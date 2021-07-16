package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ContactInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_information)
        var name = intent.getStringExtra("name")
        Toast.makeText(baseContext, name,Toast.LENGTH_LONG).show()

        var phone= intent.getStringExtra("PhoneNumber")
        Toast.makeText(baseContext, phone,Toast.LENGTH_LONG).show()

        var email = intent.getStringExtra("Email")
        Toast.makeText(baseContext, email,Toast.LENGTH_LONG).show()
    }
}