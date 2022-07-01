package com.geektech.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.geektech.animals.databinding.ActivitySecondBinding;
import com.geektech.animals.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_second);
    }
    private void getValue() {
        String extraValue;
        Intent intent = getIntent();
        extraValue = intent.getStringExtra("key");
        binding.tvAnswer.setText(extraValue);
    }
}