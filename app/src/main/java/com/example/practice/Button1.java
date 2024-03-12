package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Button1 extends AppCompatActivity
{
  Button bt;
ImageView i1;
RadioButton rd1,rd2,rd3;
ToggleButton tg1;
CheckBox ch1,ch2,ch3,ch4;
Switch sw1;

LinearLayout layout1,iv2,sw2;

CameraManager cameraManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
            bt=findViewById(R.id.bt);
            rd1=findViewById(R.id.rd1);
            tg1=findViewById(R.id.tg1);
            ch1=findViewById(R.id.ch1);
            ch2=findViewById(R.id.ch2);
            sw1=findViewById(R.id.sw1);
            i1=findViewById(R.id.i1);
            layout1 =(LinearLayout)findViewById(R.id.l1);


            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   if (rd1.isChecked()){

                    }
                }
            });
            i1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT);
                    layout1.setBackgroundColor(Color.BLUE);

                }
            });
            cameraManager=(CameraManager) getSystemService(getApplicationContext().CAMERA_SERVICE);
            tg1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (tg1.isChecked()){
                        try {
                            cameraManager.setTorchMode(cameraManager.getCameraIdList()[0],true);
                        } catch (CameraAccessException e) {
                            throw new RuntimeException(e);
                        }


                        Toast.makeText(getApplicationContext(),"Click",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        try {
                            cameraManager.setTorchMode(cameraManager.getCameraIdList()[0],false);
                        } catch (CameraAccessException e) {
                            throw new RuntimeException(e);
                        }
                        Toast.makeText(getApplicationContext(),"No click",Toast.LENGTH_SHORT).show();
                    }
                }
            });
            sw1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (sw1.isChecked()){
                        Toast.makeText(getApplicationContext(),"I feel proud",Toast.LENGTH_SHORT).show();


                    }else {
                        Toast.makeText(getApplicationContext(),"I feel proud,I am Indian",Toast.LENGTH_SHORT).show();
                    }
                }
            });

    }
}