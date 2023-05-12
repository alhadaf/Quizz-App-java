package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sports extends AppCompatActivity {

    Button op2,op4,op1,op3 ;
    Global_Variable globalv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        op2 = findViewById(R.id.Roger_Moore);
        op4=findViewById(R.id.Banastre_Tarleton);
        op1=findViewById(R.id.Roger_Bannister);
        op3=findViewById(R.id.Roger_Ramjet);
        globalv=(Global_Variable)getApplicationContext();


    }

    public void click_op1(View view){
        op1.setBackgroundColor(getResources().getColor(R.color.Red));
        if (globalv.getAll()==1)
            startActivity( new Intent(Sports.this,Sport2.class));
        else
            startActivity( new Intent(Sports.this,Sport2.class));

    }
    public void click_op3(View view){
        op3.setBackgroundColor(getResources().getColor(R.color.Red));

            startActivity( new Intent(Sports.this,Sport2.class));


    }
    public void click_op2(View view){

            int ans = globalv.getCorrect();
            ans++;
            globalv.setCorrect(ans);
            op2.setBackgroundColor(getResources().getColor(R.color.Green));

            startActivity( new Intent(Sports.this,Sport2.class));


    }
    public void click_op4(View view){
        op4.setBackgroundColor(getResources().getColor(R.color.Red));
            startActivity( new Intent(Sports.this,Sport2.class));



    }
    @Override


    public void onBackPressed() {
        if(globalv.getAll()==1)
            Toast.makeText(getApplicationContext(), "That Is Cheating ", Toast.LENGTH_SHORT ).show();



    }
}