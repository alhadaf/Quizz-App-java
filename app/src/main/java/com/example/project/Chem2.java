package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chem2 extends AppCompatActivity {

    Button Sn,Au,Pb,Ti ;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem2);
        Ti = findViewById(R.id.Roger_Moore);
        Sn=findViewById(R.id.Banastre_Tarleton);
        Au=findViewById(R.id.Roger_Bannister);
        Pb=findViewById(R.id.Roger_Ramjet);
        globalv=(Global_Variable)getApplicationContext();


    }

    public void click_Ti(View view){
        Ti.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Chem2.this,Sports.class));
        else
            startActivity( new Intent(Chem2.this,Score.class));

    }
    public void click_Pb(View view){
        Pb.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Chem2.this,Sports.class));
        else
            startActivity( new Intent(Chem2.this,Score.class));

    }
    public void click_Sn(View view){
        if (globalv.getAll()==1) {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            Sn.setBackgroundColor(getResources().getColor(R.color.Green));

            startActivity( new Intent(Chem2.this,Sports.class));
        }
        else {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            Sn.setBackgroundColor(getResources().getColor(R.color.Green));
            startActivity(new Intent(Chem2.this, Score.class));
        }


    }
    public void click_Au(View view){
        Au.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Chem2.this,Sports.class));
        else
            startActivity( new Intent(Chem2.this,Score.class));



    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();

    }
}