package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ImageView img;
    private android.view.animation.Animation Animation , Animation2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save();
        btn = findViewById(R.id.lets);
        img = findViewById(R.id.imageView);
        Animation = AnimationUtils.loadAnimation(this, R.anim.image_anim);
        Animation2 = AnimationUtils.loadAnimation(this, R.anim.butn_anim);
        img.setAnimation(Animation);
        btn.setAnimation(Animation2);




    }

    public void lets(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void save(){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        Animales[] animales = Animales.animale;


        String animalesString = gson.toJson(animales);

        editor.putString("animalesString", animalesString);

        editor.commit();

        Toast.makeText(this, "Data Saved:\n" ,
                Toast.LENGTH_SHORT).show();


    }


}