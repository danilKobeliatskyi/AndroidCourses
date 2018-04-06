package com.example.danil.androidcourses.firstapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.danil.androidcourses.R;

public class FirstAppActivity extends AppCompatActivity {

    private TextView textChanget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app);
        textChanget = (TextView)findViewById(R.id.text_changed_text);
        Button btnChange1 = (Button) findViewById(R.id.btn_change_text1);

        btnChange1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textChanget.setText(R.string.txt_btn_afterclick1);
            }
        });
    }
    public void doSomething(View view){
        textChanget.setText(R.string.txt_btn_afterclick2);
    }
}
