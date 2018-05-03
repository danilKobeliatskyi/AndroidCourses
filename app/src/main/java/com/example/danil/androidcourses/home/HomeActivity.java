package com.example.danil.androidcourses.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.danil.androidcourses.R;
import com.example.danil.androidcourses.explicitIntent.ExplicitActivity;
import com.example.danil.androidcourses.textviewandscrollview.TextVieActivity;
import com.example.danil.androidcourses.firstapp.FirstAppActivity;

public class HomeActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onTask1Click(View view) {
        Intent intent = new Intent(this, FirstAppActivity.class);
        startActivity(intent);
    }


    public void onTask2Click(View view) {
        Intent intent = new Intent(this, TextVieActivity.class);
        startActivity(intent);
    }

    public void onTask3Click(View view) {
        Intent intent = new Intent(this, ExplicitActivity.class);
        startActivity(intent);
    }
}
