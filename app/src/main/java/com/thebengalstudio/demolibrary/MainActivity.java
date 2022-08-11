package com.thebengalstudio.demolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.thebengalstudio.toastt.Toasterr;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toasterr.SmplToadt(this,"hhyy hhgg");
    }
}