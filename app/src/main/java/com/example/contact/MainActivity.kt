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
        var contactList= listOf(
            Contacts("Albert Asiimwe","+14144008481","albertkabura@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Kisseka Richard","+256706772817","richardkisseka@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Brain Kabura","+256722676997","brainkabura@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Eddie Male","+25676656557","eddiemale@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Irene Kabura","+25670178788","irenekabura@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Ambson","+2567677877","ambson@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Angella ","+254701474997","angella@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Emma","+2567567890","emma@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Esther","+25678999997","esther@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),
            Contacts("Eunice Atieno","+256798987777","euniceateino@gmail.com","https://unsplash.com/photos/Jvw3pxgeiZw"),

            )
        rvContact=findViewById(R.id.rvContacts)
        var contactAdapter= ContactsRvAdapter(contactList,baseContext)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=contactAdapter
    }
}