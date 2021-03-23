package com.example.grootantask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private HashMap<Integer,Integer> colors;
    private Button one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,shuff,test;
    private int[] randomSequence;
    private boolean touch,start;
    private int i;
    private int buttonid[]=new int[]{R.id.button,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button10,R.id.button11,R.id.button12,R.id.button13,R.id.button14,R.id.button15,R.id.button16};
    private HashMap<Integer,Integer>butcol;
    private int counter;
    private CountDownTimer timer;
    private long millisInFuture = 60000;
    private long countDownInterval = 1000;
    private boolean isCanceled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        shuff = findViewById(R.id.button27);

        one = findViewById(R.id.button);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        ten = findViewById(R.id.button10);
        eleven = findViewById(R.id.button11);
        twelve = findViewById(R.id.button12);
        thirteen = findViewById(R.id.button13);
        fourteen = findViewById(R.id.button14);
        fifteen = findViewById(R.id.button15);
        sixteen = findViewById(R.id.button16);


        butcol = new HashMap<>();


        randomSequence = new int[16];

        touch = false;
        start = false;

        colors = new HashMap<>();
        colors.put(0,-65536);
        colors.put(1,-65536);
        colors.put(2,-65536);
        colors.put(3,-65536);
        colors.put(4,-16711936);
        colors.put(5,-16711936);
        colors.put(6,-16711936);
        colors.put(7,-16711936);
        colors.put(8,-16776961);
        colors.put(9,-16776961);
        colors.put(10,-16776961);
        colors.put(11,-16776961);
        colors.put(12,-256);
        colors.put(13,-256);
        colors.put(14,-256);
        colors.put(15,-256);


        shuff.setOnClickListener(v->{
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

        ten.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = ten.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    ten.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button10));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button10));
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

        eleven.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = eleven.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    eleven.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button11));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button11));
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

        twelve.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = twelve.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    twelve.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button12));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button12));
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

        thirteen.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = thirteen.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    thirteen.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button13));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button13));
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

        fourteen.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = fourteen.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    fourteen.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button14));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button14));
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

        fifteen.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = fifteen.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    fifteen.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button15));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button15));
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

        sixteen.setOnClickListener(v->{
            if(start) {
                if (touch) {
                    test = findViewById(i);
                    int color = butcol.get(i);

                    Drawable buttonDrawable2 = sixteen.getBackground();
                    buttonDrawable2 = DrawableCompat.wrap(buttonDrawable2);
                    DrawableCompat.setTint(buttonDrawable2, color);
                    sixteen.setBackground(buttonDrawable2);

                    Drawable buttonDrawable = test.getBackground();
                    buttonDrawable = DrawableCompat.wrap(buttonDrawable);
                    DrawableCompat.setTint(buttonDrawable, butcol.get(R.id.button16));
                    test.setBackground(buttonDrawable);
                    touch = false;

                    butcol.put(i, butcol.get(R.id.button16));
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
        int b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
        b1=butcol.get(R.id.button);
        b2=butcol.get(R.id.button2);
        b3=butcol.get(R.id.button3);
        b4=butcol.get(R.id.button4);
        b5=butcol.get(R.id.button5);
        b6=butcol.get(R.id.button6);
        b7=butcol.get(R.id.button7);
        b8=butcol.get(R.id.button8);
        b9=butcol.get(R.id.button9);
        b10=butcol.get(R.id.button10);
        b11=butcol.get(R.id.button11);
        b12=butcol.get(R.id.button12);
        b13=butcol.get(R.id.button13);
        b14=butcol.get(R.id.button14);
        b15=butcol.get(R.id.button15);
        b16=butcol.get(R.id.button16);

        if ((b1 == b2) && (b2 == b3) && (b3 == b4)){
            row++;
            Log.e("tes",row+"@"+col);
        }
        if((b5 == b6) && (b6 == b7) && (b7 == b8)){
            row++;
            Log.e("tes",row+"@"+col);
        }
        if((b9 == b10) && (b10 == b11) && (b11 == b12)){
            row++;
            Log.e("tes",row+"@"+col);
        }
        if((b1 == b5) && (b5 == b9) && (b9 == b13)){
            col++;
            Log.e("tes",row+"@"+col);
        }
        if((b2 == b6) && (b6 == b10) && (b10 == b14)){
            col++;
            Log.e("tes",row+"@"+col);
        }
        if((b3 == b7) && (b7 == b11) && (b11 == b15)){
            col++;
            Log.e("tes",row+"@"+col);
        }
        Log.e("tes",row+"@"+col);

        return row+"@"+col;
    }

    public void result(){
        String value[] = output().split("@");
        int row = Integer.parseInt(value[0]);
        int col = Integer.parseInt(value[1]);

        if(row>=3 || col>=3){
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