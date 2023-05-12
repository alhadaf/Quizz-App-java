package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pgae_Sign_in extends AppCompatActivity {
    Button btn_begin;
    EditText name;
    Global_Variable globalv;
    AlertDialog.Builder alertDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pgae_sign_in);
        btn_begin=findViewById(R.id.btn_1_begin);
        name=findViewById(R.id.Name);
        globalv= (Global_Variable)getApplicationContext();

    }
    public void click_begin(View view){
        String s=name.getText().toString();
        if (s.isEmpty())
        {
            name.setHint("Name Is Required");

        }
        else
        {
            Intent intent=new Intent(Pgae_Sign_in.this, HomePage.class);
            startActivity(intent);
            globalv.setUsername(s);
        }

    }

    @Override
    public void onBackPressed() {
        alertDialog = new AlertDialog.Builder(Pgae_Sign_in.this);
        alertDialog.setTitle("Quit?");
        alertDialog.setMessage(" are you sure?");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
                System.exit(0);
            }
        });
        alertDialog.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog Dialog = alertDialog.create();
        alertDialog.show();



    }
}