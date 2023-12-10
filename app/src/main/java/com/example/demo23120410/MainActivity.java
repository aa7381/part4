package com.example.demo23120410;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int mone=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnx);
    }

    // method that start when button clicked
    public void clicked(View view)
    {
        mone+=1;
        if (mone%7==0){
            btn.setText("BOOM!");
        }
        else {
            btn.setText("This is a click number" + mone);
        }
    }
}