package com.example.acer.tripmaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.acer.tripmaker.Models.AddContactsActivity;
import com.example.acer.tripmaker.Models.CheckpPoints;
import com.example.acer.tripmaker.Models.ViewContacts;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void AddContacts(View v)
    {
        Intent intent = new Intent(this, AddContactsActivity.class);
        startActivity(intent);
    }
    public void viewContacts(View v){
        Intent intent = new Intent(this, ViewContacts.class);
        startActivity(intent);
    }
    public void openmapsActivity(View v){
        Intent intent = new Intent(this, CheckpPoints.class);
        startActivity(intent);
    }
}
