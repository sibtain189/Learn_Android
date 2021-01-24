package com.example.fragment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Button mBtnOne, mBtnTwo;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnOne = findViewById(R.id.btnOne);
        mBtnTwo = findViewById(R.id.btnTwo);
        fragmentManager = getSupportFragmentManager();
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentA fragmentA = new FragmentA();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame, fragmentA, "fragment A").commit();
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentB fragmentB = new FragmentB();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.add(R.id.frame, fragmentB, "fragment B").commit();
            }
        });
    }
}