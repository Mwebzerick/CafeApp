package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class three extends AppCompatActivity {
    ListView listView;
    ArrayList<String> array;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        listView = (ListView) findViewById(R.id.list);
        array = new ArrayList<>();

        //adding items to the array
        array.add("chicken pizza");
        array.add("Pancakes");
        array.add("Omlette");
        array.add("Appetizers");
        array.add("salads");
        array.add("Sandwiches");
        array.add("Clear Chicken % Veg Soup");
        array.add("Clear Chicken % Mushroom Soup");
        array.add("Cream of Tomato Soup");
        array.add("Thigh Chicken % Noodle");
        array.add("Chicken Pesto Sandwich");
        array.add("Grilled Vegetable");
        array.add("Tuna Salad Sandwich");
        array.add("Mexican Burger");
        array.add("Beef Burger");
        array.add("Vegeterian Pizza");


        //setting up the adapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);

        //adding onclick listner for the items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getApplicationContext()," "+array.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }
}
