package com.example.cuahangquanao;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cuahangquanao.Activity.DangNhapActivity;

import org.lucasr.twowayview.TwoWayView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(getApplicationContext(), DangNhapActivity.class));
        finish();
    }
}