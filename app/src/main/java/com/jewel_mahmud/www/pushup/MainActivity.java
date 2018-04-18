package com.jewel_mahmud.www.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Updated", "");


    }

    public void testMethode(){
        Log.e("Updated", "Completed.");
    }

    public void testMethode1(){
        Log.e("Updated1", "Completed1 we ewqe.");
    }

    public void testMethode2(){
        Log.e("Updated2", "Completed2. Weccc");
    }
}
