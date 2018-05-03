package com.example.danil.androidcourses.explicitintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.danil.androidcourses.R;

public class ExplicitActivity extends Activity implements View.OnClickListener{

    public final static String KEY = "user";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        editText = (EditText)findViewById(R.id.text_data);
        ((Button) findViewById(R.id.btn_next)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ExplicitActivity.this, Second.class);
        intent.putExtra(KEY, editText.getText().toString());
        startActivity(intent);
    }
}
