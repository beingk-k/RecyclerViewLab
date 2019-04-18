package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //List of Contacts

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla", "9801025252", R.drawable.saugat));
        contactsList.add( new Contacts("Rajesh Hamal", "9845236987", R.drawable.rajesh));
        contactsList.add( new Contacts("Dahyang Rai", "9808912365", R.drawable.dahayang));
        contactsList.add( new Contacts("Bhuwan K.C.", "9857315879", R.drawable.bhuwan));

        //Pass List to Adapter

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
