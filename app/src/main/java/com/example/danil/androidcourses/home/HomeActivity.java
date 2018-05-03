package com.example.danil.androidcourses.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.danil.androidcourses.R;
import com.example.danil.androidcourses.explicitintent.ExplicitActivity;
import com.example.danil.androidcourses.textviewandscrollview.TextVieActivity;
import com.example.danil.androidcourses.firstapp.FirstAppActivity;

public class HomeActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnTask1 = (Button)findViewById(R.id.btn_app_1);
        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, FirstAppActivity.class);
                startActivity(intent);
            }
        });

        Button btnTask2 = (Button)findViewById(R.id.btn_app_2);
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, TextVieActivity.class);
                startActivity(intent);
            }
        });
        
        Button btnTask3 = (Button)findViewById(R.id.btn_app_3);
        btnTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ExplicitActivity.class);
                startActivity(intent);
            }
        });
    }
}
