package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Practice2 extends AppCompatActivity {
    TextView t2;
    ProgressBar p1;
    Button bt1;
    int progresscount=0;
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);
         t2=findViewById(R.id.t1);
         p1=findViewById(R.id.p1);
         bt1=findViewById(R.id.bt1);
         bt1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 handler=new Handler();
                 handler.postDelayed(new Runnable() {
                     @Override
                     public void run() {
                         if (p1.getProgress()<100){
                             p1.setProgress(progresscount);
                             progresscount++;
                             handler.postDelayed(this,100);
                             bt1.setText("Plz wait....");}
                                 else{
                                 bt1.setText("Completed");
                             }
                             }
                         },100);
                     }
                 });


        }
        }