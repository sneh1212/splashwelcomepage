package com.medipack.splashwelcomepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    private TextView textView;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.tv);

        imageView = findViewById(R.id.iv);

        // animation coding

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.transition);
        textView.startAnimation(myanim);
        imageView.startAnimation(myanim);

        Thread timer = new Thread(){

            public void run(){

                try{
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                finally {
                    startActivity(new Intent(splash.this,MainActivity.class));
                }
            }
        };

           timer.start();




    }
}
