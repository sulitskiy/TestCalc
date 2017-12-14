package com.example.michael.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestSecondActivity extends AppCompatActivity {

    @BindView(R.id.tv_btn_second_view) TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TestSecondActivity", "onCreate()");
        setContentView(R.layout.activity_test_second);

        ButterKnife.bind(this);

        String string = getIntent(). getStringExtra("text");
        tvContent.setText (string);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TestSecondActivity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestSecondActivity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestSecondActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestSecondActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestSecondActivity", "onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("TestSecondActivity", "onPressed()");
    }
}
