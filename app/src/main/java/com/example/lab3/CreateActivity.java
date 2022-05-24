package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CreateActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        Button fact3 =(Button)findViewById(R.id.button2);

        EditText name = (EditText)findViewById(R.id.textView);
        EditText info = (EditText)findViewById(R.id.textView2);
        EditText img = (EditText)findViewById(R.id.textView3);
        fact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names = name.getText().toString();

                String infos = info.getText().toString();

                String imgs = img.getText().toString();

                if(((names.equals("")) || ((infos.equals(""))))){

                    Toast.makeText(getApplicationContext(), "ОШИБКА: ОДНО ИЗ ПОЛЕЙ ПУСТОЕ ",
                            Toast.LENGTH_SHORT).show();
                    finishActivity(1);
                    Intent intent = new Intent();
                    intent.setClass(CreateActivity.this, CreateActivity.class);
                    startActivity(intent);
                    finish();

                }else{

                    setInitialData(names,infos,imgs);
                    finish();

                }


            }
        });
    }
    private void setInitialData(String name,String info, String img)  {
        System.out.println(img);
        switch (img) {
            case ("java"):
                MainActivity.states.add(new State(name, info, R.drawable.java));
                System.out.println(1);
                break;
            case ("html"):
                MainActivity.states.add(new State(name, info, R.drawable.html_5));
                break;
            case ("css"):
                MainActivity.states.add(new State(name, info, R.drawable.css_3));
                break;
            case ("bootstrap"):
                MainActivity.states.add(new State(name, info, R.drawable.bootstrap));
                break;
            case ("ruby on rails"):
                MainActivity.states.add(new State(name, info, R.drawable.ruby));
                break;
            default:
                MainActivity.states.add(new State(name, info, R.drawable.no_image_14596));
        }
            Intent intent = new Intent();
            intent.setClass(CreateActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
