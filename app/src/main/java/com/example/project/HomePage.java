package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {
    Button phy_btn, chem_btn,sports_btn,bio_btn,all_btn;
    Global_Variable globalv;
    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        phy_btn=findViewById(R.id.phy_btn);
        chem_btn=findViewById(R.id.chem_btn);
        sports_btn=findViewById(R.id.bio_btn);
        bio_btn=findViewById(R.id.bio_btn);
        all_btn=findViewById(R.id.all_btn);
        globalv=(Global_Variable)getApplicationContext();
        globalv.setCorrect(0);
        globalv.setAll(0);

    }




    public void phyclicked(View view){
        Intent intent=new Intent(HomePage.this,Phy.class);
        startActivity(intent);


    }
    public void bioclicked(View view){
        Intent intent=new Intent(HomePage.this,Bio.class);
        startActivity(intent);


    }
    public void sportsclicked(View view){
        Intent intent=new Intent(HomePage.this,Sports.class);
        startActivity(intent);


    }
    public void chemclicked(View view){
        Intent intent=new Intent(HomePage.this,Chem.class);
        startActivity(intent);


    }
    public void Allclicked(View view){
        Intent intent=new Intent(HomePage.this,Bio.class);
        startActivity(intent);
        globalv.setAll(1);

    }
    @Override
    public void onBackPressed() {

        alertDialog=new AlertDialog.Builder(HomePage.this);
        alertDialog.setTitle("Change Username or Quit");
        alertDialog.setPositiveButton("Change username", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent=new Intent(HomePage.this,Pgae_Sign_in.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("Quit App", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
                System.exit(0);
            }
        });
        alertDialog.create();
        alertDialog.show();





    }
}