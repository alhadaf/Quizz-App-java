package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    Global_Variable globalv;
    Button back_btn;
    RatingBar ratingBar;
    int ratetimes=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        globalv=(Global_Variable) getApplicationContext();
        TextView s=(TextView)findViewById(R.id.Score);
        ratingBar=findViewById(R.id.ratingBar);
        int score=globalv.getCorrect();
        if(globalv.getAll()==1)
        {
            if (score>=4)
                s.setText("Congrats " +globalv.getUsername().toUpperCase()  +" You Scored " + score + " out of 8 ");
            else
                s.setText("Oh You Failed " +globalv.getUsername().toUpperCase()+" You Scored " + score + " out of 8 ");
        }
        else {
            if (score >= 1)
                s.setText("Congrats " +globalv.getUsername().toUpperCase()  +" You Scored " + score +" out of 2 ");
            else
                s.setText("Oh You Failed " +globalv.getUsername().toUpperCase()+" You Scored " + score + " out of 2 ");
        }

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                if( ratetimes==0)
                {
                    Toast.makeText(getApplicationContext(), "Thanks For Rating " , Toast.LENGTH_SHORT).show();
                    ratetimes++;
                }
            }
        });
    }
    public void back_btn(View view){
        Intent intent=new Intent(Score.this, HomePage.class);
        startActivity(intent);

    }




    @Override
    public void onBackPressed() {
    }

}