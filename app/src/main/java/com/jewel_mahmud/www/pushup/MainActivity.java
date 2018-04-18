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

        Log.e("Updated", "Completed.");

    }

    private void SampleMethod(int i){
        i = i + 1;
        i = 100;
        i = i + 1;
        i = i + 1;


    }
}
