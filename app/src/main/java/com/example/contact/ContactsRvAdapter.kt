package com.example.contact

import android.content.Context
import android.content.Intent
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsRvAdapter(var contactList:List<Contacts>, var context: Context):RecyclerView.Adapter<ContactViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_items,parent,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.tvName
        holder.tvPhoneNumber.text=currentContact.tvPhoneNumber
        holder.tvEmail.text=currentContact.tvEmail
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)

            .into(holder.ivContact)
        holder.cvContact.setOnClickListener {
             var intent = Intent(context,ContactInformation::class.java)
            intent.putExtra("NAME",currentContact.imageUrl)
            intent.putExtra("PhoneNumber",currentContact.tvPhoneNumber)
            intent.putExtra("Email",currentContact.tvEmail)



        }

    }

    override fun getItemCount(): Int {
     return contactList.size

    }

}
class ContactViewHolder(itemsview:View):RecyclerView.ViewHolder(itemsview){
    var tvName = itemsview.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemsview.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemsview.findViewById<TextView>(R.id.tvEmail)
    var ivContact = itemsview.findViewById<ImageView>(R.id.ivContact)
    var cvContact = itemsview.findViewById<CardView>(R.id.cvContacts)

}