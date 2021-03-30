package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private AnimationDrawable diceAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setBackgroundResource(R.drawable.dice_rolling);
        diceAnimation = (AnimationDrawable) imageViewDice.getBackground();
        diceAnimation.start();
        imageViewDice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(diceAnimation.isRunning()){
                    diceAnimation.stop();
                }else{
                    diceAnimation.start();
                }
            }
        });
    }

}