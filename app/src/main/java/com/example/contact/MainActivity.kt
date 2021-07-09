package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contacts()
    }
    fun contacts(){
        var contactList= listOf<Contacts>(
            Contacts("Albert Asiimwe","+14144008481","albertkabura@gmail.com"),
            Contacts("Kisseka Richard","+256706772817","richardkisseka@gmail.com"),
            Contacts("Brain Kabura","+256722676997","brainkabura@gmail.com"),
            Contacts("Eddie Male","+25676656557","eddiemale@gmail.com"),
            Contacts("Irene Kabura","+25670178788","irenekabura@gmail.com"),
            Contacts("Ambson","+2567677877","ambson@gmail.com"),
            Contacts("Angella ","+254701474997","angella@gmail.com"),
            Contacts("Emma","+2567567890","emma@gmail.com"),
            Contacts("Esther","+25678999997","esther@gmail.com"),
            Contacts("Eunice Atieno","+256798987777","euniceateino@gmail.com"),

            )
        rvContact=findViewById(R.id.rvContacts)
        var contactAdapter= ContactsRvAdapter(contactList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter
    }
}