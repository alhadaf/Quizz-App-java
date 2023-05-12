package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chem extends AppCompatActivity {

    Button Enthalpy,Spontaneous_combustion,Flash_point,Thermokarst;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem);
        Enthalpy=findViewById(R.id.Banastre_Tarleton);
        Spontaneous_combustion=findViewById(R.id.Roger_Bannister);
        Flash_point=findViewById(R.id.Roger_Ramjet);
        Thermokarst=findViewById(R.id.Roger_Moore);
        globalv=(Global_Variable) getApplicationContext();

    }

    public void click_Enthalpy(View view){
        Enthalpy.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Chem.this,Chem2.class);
        startActivity(intent);
    }
    public void click_Flash_point(View view){
        Flash_point.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Chem.this,Chem2.class);
        startActivity(intent);
    }
    public void click_Spontaneous_combustion(View view){
        Spontaneous_combustion.setBackgroundColor(getResources().getColor(R.color.Green));
        int ans =globalv.getCorrect();
        ans++;
        globalv.setCorrect(ans);
        Intent intent = new Intent(Chem.this,Chem2.class);
        startActivity(intent);
    }
    public void click_Thermokarst(View view){
        Thermokarst.setBackgroundColor(getResources().getColor(R.color.Red));
        Intent intent = new Intent(Chem.this,Chem2.class);
        startActivity(intent);

    }
    @Override
    public void onBackPressed() {
        if(globalv.getAll()==1)
            Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();
    }
}