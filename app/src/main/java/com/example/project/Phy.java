package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Phy extends AppCompatActivity {

    Button ampere,decibel,hertz,ohm;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy);
        ampere=findViewById(R.id.Banastre_Tarleton);
        decibel=findViewById(R.id.Roger_Bannister);
        hertz=findViewById(R.id.Roger_Ramjet);
        ohm=findViewById(R.id.Roger_Moore);
        globalv=(Global_Variable) getApplicationContext();

    }

    public void click_amp(View view){
        ampere.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Phy.this,Phy2.class);
        startActivity(intent);
    }
    public void click_dec(View view){
        decibel.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Phy.this,Phy2.class);
        startActivity(intent);
    }
    public void click_hertz(View view){
        hertz.setBackgroundColor(getResources().getColor(R.color.Green));
        int ans =globalv.getCorrect();
        ans++;
        globalv.setCorrect(ans);
        Intent intent = new Intent(Phy.this,Phy2.class);
        startActivity(intent);
    }
    public void click_ohm(View view){
        ohm.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Phy.this,Phy2.class);
        startActivity(intent);

    }
    @Override
    public void onBackPressed() {
        if(globalv.getAll()==1)
            Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();
    }
}