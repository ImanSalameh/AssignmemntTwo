package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.gson.Gson;

public class MainActivity2 extends AppCompatActivity {
    private  Apapter adapter;
    private RecyclerView recycler ;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        Gson gson = new Gson();
        String str = prefs.getString("animalesString", "");
        Animales[] anim = gson.fromJson(str, Animales[].class);

        recycler = findViewById(R.id.pizza_recycler);
        int[] Image = new int[anim.length];
        String[] optionOne = new String[anim.length];
        String[] optionTwo = new String[anim.length];
        String[] answer = new String[anim.length];

        for (int i = 0; i < anim.length; i++) {
            Image[i] = anim[i].getImage();
            optionOne[i] = anim[i].getOptionOne();
            optionTwo[i] = anim[i].getOptionTwo();
            answer[i] = anim[i].getAnswer();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Apapter(Image, optionOne, optionTwo, answer);
        recycler.setAdapter(adapter);


    }

    public void finish(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}