package com.example.myapplication;

public class Animales {

   private int Image;
    private   String optionOne;
    private String optionTwo;

    String answer;

    public Animales(int image, String optionOne, String optionTwo, String answer) {
        Image = image;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.answer = answer;
    }
    public Animales(String answer){
        this.answer = answer;
    }

    public static final Animales[] animale ={

        new Animales(R.drawable.wolf,"Wolf","Dog","Wolf"),
        new Animales(R.drawable.tagger,"Cat","tiger","tiger"),
        new Animales(R.drawable.lion,"Lion","Dog","Lion"),
        new Animales(R.drawable.dog,"Dog","Cat","Dog"),
            new Animales(R.drawable.rabet,"rabbit","lizard","rabbit"),
            new Animales(R.drawable.panda,"Bear","Panda","Panda"),
            new Animales(R.drawable.egel,"Eagle","Hawk","Eagle"),
            new Animales(R.drawable.b,"Bird","Donkey","Bird")

    };





    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }





}
