package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Apapter
        extends RecyclerView.Adapter<Apapter.ViewHolder>{
    private int Image[];
    private   String optionOne[];
    private String optionTwo[];

    String answer[];

    public Apapter(int Image[], String optionOne[], String optionTwo[], String answer[]){
        this.Image = Image;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.answer = answer;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,  int position) {

        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), Image[position]);
        imageView.setImageDrawable(drawable);
        Spinner spinner = (Spinner)cardView.findViewById(R.id.spinner);
        spinner.setSelection(0);
        ArrayAdapter<String> adapterd= new ArrayAdapter<String>(cardView.getContext(),android.R.layout.simple_spinner_item,answer);
        adapterd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterd);
        spinner.setTag(position);
//        // add the first item in the spinner please select an answer
//
//
//
//        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                String selected = spinner.getSelectedItem().toString();
//                if(selected.equals(answer[position])){
//                    Toast.makeText(parent.getContext(), "Correct", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(parent.getContext(), "Incorrect", Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return Image.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
