package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bio extends AppCompatActivity {
    Button genetics,relativity,biology,phylogeny;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        genetics=findViewById(R.id.Banastre_Tarleton);
        relativity=findViewById(R.id.Roger_Bannister);
        biology=findViewById(R.id.Roger_Ramjet);
        phylogeny=findViewById(R.id.Roger_Moore);
        globalv=(Global_Variable) getApplicationContext();


    }

    public void click_gen(View view){
        genetics.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Bio.this,Bioquiz2.class);
        startActivity(intent);
    }
    public void click_rel(View view){
        relativity.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Bio.this,Bioquiz2.class);
        startActivity(intent);
    }
    public void click_bio(View view){
        biology.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Bio.this,Bioquiz2.class);
        startActivity(intent);
    }
    public void click_phy(View view){
        phylogeny.setBackgroundColor(getResources().getColor(R.color.Green));
        int ans =globalv.getCorrect();
        ans++;
        globalv.setCorrect(ans);
        Intent intent = new Intent(Bio.this,Bioquiz2.class);
        startActivity(intent);

    }

    @Override
    public void onBackPressed() {
        if(globalv.getAll()==1)
            Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();
    }
}