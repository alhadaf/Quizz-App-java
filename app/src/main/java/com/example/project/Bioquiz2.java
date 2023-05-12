package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bioquiz2 extends AppCompatActivity {
    Button tryptophan,tyrosine,glycine,alanine;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioquiz2);
        tryptophan=findViewById(R.id.Banastre_Tarleton);
        tyrosine=findViewById(R.id.Roger_Bannister);
        glycine=findViewById(R.id.Roger_Ramjet);
        alanine=findViewById(R.id.Roger_Moore);
        globalv=(Global_Variable) getApplicationContext();


    }

    public void click_try(View view){
        tryptophan.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
        startActivity( new Intent(Bioquiz2.this,Phy.class));
        else
            startActivity( new Intent(Bioquiz2.this,Score.class));

    }
    public void click_tyr(View view){
        tyrosine.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Bioquiz2.this,Phy.class));
        else
            startActivity( new Intent(Bioquiz2.this,Score.class));

    }
    public void click_gly(View view){
        if (globalv.getAll()==1) {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            glycine.setBackgroundColor(getResources().getColor(R.color.Green));

            startActivity(new Intent(Bioquiz2.this, Phy.class));
        }
        else {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            glycine.setBackgroundColor(getResources().getColor(R.color.Green));
            startActivity(new Intent(Bioquiz2.this, Score.class));
        }


    }
    public void click_ala(View view){
        alanine.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Bioquiz2.this,Phy.class));
        else
            startActivity( new Intent(Bioquiz2.this,Score.class));



    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();

    }
}