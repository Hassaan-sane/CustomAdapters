package com.example.sane.a1customadapters;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.sane.a1customadapters.adapters.ContactAdapter;
import com.example.sane.a1customadapters.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) this.findViewById(R.id.list1);


        ArrayList<Contact> List = new ArrayList<>();

        //INITIALIZING
        String gender;
        for (int i = 0; i <= 999; i++) {
            if (i%2==0)
            {
                gender="male";
            }
            else
            {
                gender="female";
            }
            List.add(new Contact("Name = " + i,  "Phone "+i, gender));
        }

        ContactAdapter contactAdapter = new ContactAdapter(this, List);

        listView.setAdapter(contactAdapter);


    }
}
