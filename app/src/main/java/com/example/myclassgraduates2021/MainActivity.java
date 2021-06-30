package com.example.myclassgraduates2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
        button = findViewById(R.id.button);

        Random random = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int rand = random.nextInt(35)+1;

                if (rand == 1){
                    imageView.setImageResource(R.mipmap.one);
                }else if (rand == 2){
                    imageView.setImageResource(R.mipmap.two);
                }else if (rand == 3){
                    imageView.setImageResource(R.mipmap.three);
                }else if (rand == 4){
                    imageView.setImageResource(R.mipmap.four);
                }else if (rand == 5){
                    imageView.setImageResource(R.mipmap.five);
                }else if (rand == 6){
                    imageView.setImageResource(R.mipmap.six);
                }else if (rand == 7){
                    imageView.setImageResource(R.mipmap.seven);
                }else if (rand == 8){
                    imageView.setImageResource(R.mipmap.eight);
                }else if (rand == 9){
                    imageView.setImageResource(R.mipmap.nine);
                }else if (rand == 10){
                    imageView.setImageResource(R.mipmap.ten);
                }else if (rand == 11){
                    imageView.setImageResource(R.mipmap.eleven);
                }else if (rand == 12){
                    imageView.setImageResource(R.mipmap.twelve);
                }else if (rand == 13){
                    imageView.setImageResource(R.mipmap.thirteen);
                }else if (rand == 14){
                    imageView.setImageResource(R.mipmap.fourteen);
                }else if (rand == 15){
                    imageView.setImageResource(R.mipmap.fiveteen);
                }else if (rand == 16){
                    imageView.setImageResource(R.mipmap.sixteen);
                }else if (rand == 17){
                    imageView.setImageResource(R.mipmap.seventeen);
                }else if (rand == 18){
                    imageView.setImageResource(R.mipmap.eighteen);
                }else if (rand == 19){
                    imageView.setImageResource(R.mipmap.nineteen);
                }else if (rand == 20){
                    imageView.setImageResource(R.mipmap.twenty);
                }else if (rand == 21){
                    imageView.setImageResource(R.mipmap.twenty_one);
                }else if (rand == 22){
                    imageView.setImageResource(R.mipmap.twenty_two);
                }else if (rand == 23){
                    imageView.setImageResource(R.mipmap.twenty_three);
                }else if (rand == 24){
                    imageView.setImageResource(R.mipmap.twenty_four);
                }else if (rand == 25){
                    imageView.setImageResource(R.mipmap.twenty_five);
                }else if (rand == 26){
                    imageView.setImageResource(R.mipmap.twenty_six);
                }else if (rand == 27){
                    imageView.setImageResource(R.mipmap.twenty_seven);
                }else if (rand == 28){
                    imageView.setImageResource(R.mipmap.twenty_eight);
                }else if (rand == 29){
                    imageView.setImageResource(R.mipmap.twenty_nine);
                }else if (rand == 30){
                    imageView.setImageResource(R.mipmap.thirty);
                }else if (rand == 31){
                    imageView.setImageResource(R.mipmap.thirty_one);
                }else if (rand == 32){
                    imageView.setImageResource(R.mipmap.thirty_two);
                }else if (rand == 33){
                    imageView.setImageResource(R.mipmap.thirty_three);
                }else if (rand == 34){
                    imageView.setImageResource(R.mipmap.thirty_four);
                }else {
                    imageView.setImageResource(R.mipmap.thirty_five);
                }

            }
        });

    }
}