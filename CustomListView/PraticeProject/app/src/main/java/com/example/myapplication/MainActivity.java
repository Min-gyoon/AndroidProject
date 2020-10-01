package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView ;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.listview);
        adapter = new Adapter();
        setData();
        listView.setAdapter(adapter);
    }
    public void setData(){
        TypedArray typedArray = getResources().obtainTypedArray(R.array.picture);
        String[] menu = getResources().getStringArray(R.array.mouse);
        String[] menu2 = getResources().getStringArray(R.array.monitor);


        for(int i = 0 ; i < menu.length; i++){
            Data data = new Data();
            data.setPictureNumber(typedArray.getResourceId(i, 0));
            data.setText1(menu[i]);
            data.setText2(menu2[i]);

            adapter.addItem(data);
        }

    }

}