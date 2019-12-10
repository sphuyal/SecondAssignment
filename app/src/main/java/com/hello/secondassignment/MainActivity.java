package com.hello.secondassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.Area;
import fragments.Armstrong;
import fragments.Automorphic;
import fragments.Palindrome;
import fragments.SimpleInterest;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea;
    private Button btnPalindrome;
    private Button btnSI;
    private Button btnArmstrong;
    private Button btnAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea=findViewById(R.id.btnarea);
        btnPalindrome=findViewById(R.id.btnpalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnArmstrong = findViewById(R.id.btnarmstrong);
        btnAutomorphic = findViewById(R.id.btnautomorphic);


        btnArea.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (v.getId()){


            case R.id.btnarea:
                Area area = new Area();
                fragmentTransaction.replace(R.id.fragmentContainer,area);
                fragmentTransaction.commit();
                break;


            case R.id.btnpalindrome:
                Palindrome palindrome = new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.btnSI:
                SimpleInterest simpleInterest = new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterest);
                fragmentTransaction.commit();
                break;

            case R.id.btnarmstrong:
                Armstrong armstrong = new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrong);
                fragmentTransaction.commit();
                break;

            case R.id.btnautomorphic:
                Automorphic automorphic = new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
                fragmentTransaction.commit();
                break;

        }
    }
}
