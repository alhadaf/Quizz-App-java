package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Phy2 extends AppCompatActivity {

    Button temperature,amplitude,loudness,pitch;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy2);
        temperature=findViewById(R.id.Banastre_Tarleton);
        amplitude=findViewById(R.id.Roger_Bannister);
        loudness=findViewById(R.id.Roger_Ramjet);
        pitch=findViewById(R.id.Roger_Moore);
        globalv=(Global_Variable) getApplicationContext();


    }

    public void click_temperature(View view){
        temperature.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Phy2.this,Chem.class));
        else
            startActivity( new Intent(Phy2.this,Score.class));

    }
    public void click_amplitude(View view){
        amplitude.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Phy2.this,Chem.class));
        else
            startActivity( new Intent(Phy2.this,Score.class));

    }
    public void click_loudness(View view){
        if (globalv.getAll()==1) {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            loudness.setBackgroundColor(getResources().getColor(R.color.Green));

            startActivity( new Intent(Phy2.this,Chem.class));
        }
        else {
            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            loudness.setBackgroundColor(getResources().getColor(R.color.Green));
            startActivity(new Intent(Phy2.this, Score.class));
        }


    }
    public void click_pitch(View view){
        pitch.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Phy2.this,Chem.class));
        else
            startActivity( new Intent(Phy2.this,Score.class));



    }
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();

    }
}