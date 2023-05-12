package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sport2 extends AppCompatActivity {

    Button Roger_Moore,Banastre_Tarleton,Roger_Bannister,Roger_Ramjet ;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport2);
        Roger_Moore = findViewById(R.id.Roger_Moore);
        Banastre_Tarleton=findViewById(R.id.Banastre_Tarleton);
        Roger_Bannister=findViewById(R.id.Roger_Bannister);
        Roger_Ramjet=findViewById(R.id.Roger_Ramjet);
        globalv=(Global_Variable)getApplicationContext();


    }

    public void click_Roger_Moore(View view){
        Roger_Moore.setBackgroundColor(getResources().getColor(R.color.Red));

            startActivity( new Intent(Sport2.this,Score.class));

    }
    public void click_Banastre_Tarleton(View view){
        Banastre_Tarleton.setBackgroundColor(getResources().getColor(R.color.Red));

            startActivity( new Intent(Sport2.this,Score.class));

    }
    public void click_Roger_Bannister(View view){

            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            Roger_Bannister.setBackgroundColor(getResources().getColor(R.color.Green));
            startActivity(new Intent(Sport2.this, Score.class));
        }



    public void click_Roger_Ramjet(View view){
        Roger_Ramjet.setBackgroundColor(getResources().getColor(R.color.Red));

            startActivity( new Intent(Sport2.this,Score.class));



    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();

    }
}