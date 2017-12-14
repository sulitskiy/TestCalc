package com.example.michael.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestFirstActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TestFirstActivity", "onCreate()");
        setContentView(R.layout.activity_test_first);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TestFirstActivity", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TestFirstActivity", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TestFirstActivity", "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TestFirstActivity", "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TestFirstActivity", "onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d("TestFirstActivity", "onPressed()");
    }

    @OnClick(R.id.btn_first_view)
    public void btn(){
        Intent intent = new Intent(TestFirstActivity.this, TestSecondActivity.class);
        intent.putExtra("text", "Hello from first activity");
        TestFirstActivity.this.startActivity(intent);

    }

}
