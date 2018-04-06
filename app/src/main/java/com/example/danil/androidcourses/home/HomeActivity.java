package com.example.danil.androidcourses.home;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.danil.androidcourses.R;

public class HomeActivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onTask1Click(View view) {
        Toast.makeText(this, "To Be Done", Toast.LENGTH_SHORT).show();
    }
}
