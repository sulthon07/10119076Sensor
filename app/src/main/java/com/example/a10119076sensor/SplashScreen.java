package com.example.a10119076sensor;
//  NIM     : 10119076
//  Nama    : Sulthon Naufal Akmal
//  Kelas   : IF2
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.a10119076sensor.ui.home.HomeFragment;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread(){

            public void run() {
                try{
                    sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally{
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}