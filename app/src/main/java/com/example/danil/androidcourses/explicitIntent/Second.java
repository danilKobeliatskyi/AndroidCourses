package com.example.danil.androidcourses.explicitIntent;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.example.danil.androidcourses.R;

public class Second extends Activity {

    private TextView textData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textData = (TextView)findViewById(R.id.text_result);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            setText(bundle);
        }
    }

    private void setText(Bundle bundle) {
        String s = bundle.getString(ExplicitActivity.KEY);
        if (!TextUtils.isEmpty(s))
            textData.setText(s);
    }
}
