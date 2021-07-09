package com.example.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsRvAdapter(var contactList:List<Contacts>):RecyclerView.Adapter<ContactViewHolder> (){
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

    }

    override fun getItemCount(): Int {
     return contactList.size

    }

}
class ContactViewHolder(itemsview:View):RecyclerView.ViewHolder(itemsview){
    var tvName = itemsview.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemsview.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmail = itemsview.findViewById<TextView>(R.id.tvEmail)

}