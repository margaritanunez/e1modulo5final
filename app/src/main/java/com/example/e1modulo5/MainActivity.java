package com.example.e1modulo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.e1modulo5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FirstFragment firstFragment= FirstFragment.newInstance("", "");
        getSupportFragmentManager().beginTransaction().add(R.id.mainFragmentContainerView, firstFragment, "Primerísimo").commit();
    }
}