package com.example.passdatafragmenttofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentCommunicationListener{

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        launchFragmentA();
    }

    private void launchFragmentA() {
        FragmentA fragmentA=new FragmentA();
        fragmentA.setListener(this);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flContainer, fragmentA,"fragmentA").commit();
    }

    @Override
    public void launchFragmentByPassingData(String data) {
        FragmentB fragmentB=new FragmentB();
        Bundle bundle=new Bundle();
        bundle.putString("data", data);
        fragmentB.setArguments(bundle);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer,fragmentB,"fragmentB").addToBackStack("fragmentB").commit();

    }
}