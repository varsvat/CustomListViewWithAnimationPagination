package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview);

        //Create the Person objects
        com.example.listview.Person varun = new com.example.listview.Person("varun ", "27082001" , "Male");

        //Add the Person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);
        peopleList.add(varun);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.single_item, peopleList);
        mListView.setAdapter(adapter);
    }
}
