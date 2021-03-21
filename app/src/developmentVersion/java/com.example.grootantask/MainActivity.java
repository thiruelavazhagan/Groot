package com.example.grootantask;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private HashMap<Integer,Integer>colors;
    private Button one,two,three,four,five,six,seven,eight,nine,shuff,test;
    private int[] randomSequence;
    private boolean touch,start;
    private int i;
    private int buttonid[]=new int[]{R.id.button,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9};
    private HashMap<Integer,Integer>butcol;
    private int counter;
    private CountDownTimer timer;
    private long millisInFuture = 30000;
    private long countDownInterval = 1000;
    private boolean isCanceled = false;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        butcol = new HashMap<>();


        randomSequence = new int[9];

        touch = false;
        start = false;

        colors = new HashMap<>();
        colors.put(0,-65536);
        colors.put(1,-65536);
        colors.put(2,-65536);
        colors.put(3,-16711936);
        colors.put(4,-16711936);
        colors.put(5,-16711936);
        colors.put(6,-16776961);
        colors.put(7,-16776961);
        colors.put(8,-16776961);

        one = findViewById(R.id.button);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);

        shuff = findViewById(R.id.button10);

        shuff.setOnClickListener(v ->{
            start=true;
            shuffle();
            isCanceled = false;
            timer();
        });

        one.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = one.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    one.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button));
                    butcol.put(v.getId(), color);
                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }

        });
        two.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = two.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    two.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button2));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button2));
                    butcol.put(v.getId(), color);
                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = three.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    three.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button3));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button3));
                    butcol.put(v.getId(), color);
                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        four.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = four.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    four.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button4));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button4));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = five.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    five.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button5));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button5));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = six.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    six.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button6));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button6));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = seven.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    seven.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button7));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button7));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = eight.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    eight.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button8));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button8));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });
        nine.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = nine.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    nine.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button9));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button9));
                    butcol.put(v.getId(), color);

                    result();

                } else {
                    i = v.getId();
                    touch = true;
                }
            }
            else {
                Toast.makeText(getApplicationContext(),"Scramble to start",Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void shuffle() {

        Random randomNumbers = new Random();

        for (int i = 0; i < randomSequence.length; i++ ) {
            if (i == 0) {
                randomSequence[i] = 0;
            } else {

                int pointer = randomNumbers.nextInt(i + 1);
                randomSequence[i] = randomSequence[pointer];
                randomSequence[pointer] = i;

            }
        }
        for(int i=0;i<=randomSequence.length-1;i++){
            test = findViewById(buttonid[i]);
            Drawable buttonDrawable2 = test.getBackground();
            buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
            DrawableCompat.setTint(buttonDrawable2, colors.get(randomSequence[i]));
            test.setBackground(buttonDrawable2);
            butcol.put(buttonid[i],colors.get(randomSequence[i]));
        }

    }

    public String output(){
        int row=0;
        int col=0;
        int b1,b2,b3,b4,b5,b6,b7,b8,b9;
        b1=butcol.get(R.id.button);
        b2=butcol.get(R.id.button2);
        b3=butcol.get(R.id.button3);
        b4=butcol.get(R.id.button4);
        b5=butcol.get(R.id.button5);
        b6=butcol.get(R.id.button6);
        b7=butcol.get(R.id.button7);
        b8=butcol.get(R.id.button8);
        b9=butcol.get(R.id.button9);

        if ((b1 == b2) && (b1 == b3)){
            row++;
        }
        if((b4 == b5) && (b4 == b6)){
            row++;
        }
        if((b1 == b4) && (b1 == b7)){
            col++;
        }
        if((b2 == b5) && (b2 == b8)){
            col++;
        }
        return row+"@"+col;
    }

    public void result(){
        String value[] = output().split("@");
        int row = Integer.parseInt(value[0]);
        int col = Integer.parseInt(value[1]);

        if(row>=2 || col>=2){
            alert("Task Completed Successfully","Successfull");

        }
    }

    public void timer(){
        timer = new CountDownTimer(millisInFuture,countDownInterval){
            public void onTick(long millisUntilFinished){
                if(isCanceled)
                {
                    cancel();
                }

            }
            public void onFinish(){
                alert("Times Up","Faild");

            }
        }.start();
    }

    public void alert(String message,String title){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message) .setTitle(title)
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if(title.equalsIgnoreCase("faild")) {
                            start = true;
                            shuffle();
                            isCanceled = false;
                            timer();
                        }
                        else {
                            isCanceled=true;
                        }
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


}