package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView txt_click;
    private Button btnDecrease;
    private Button btnReset;

    int sayi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDecrease = findViewById(R.id.btn_azalt);
        btnReset = findViewById(R.id.btn_reset);

        txt_click = findViewById(R.id.txt_count);
        txt_click.setText(sayi+"");
        btnClick = findViewById(R.id.btn_click);

        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int temp =  Integer.parseInt(String.valueOf(txt_click.getText()));
                if(temp > 0){
                    sayi--;
                    txt_click.setText(sayi+"");
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sayi = 0;
                txt_click.setText(sayi+"");
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                sayi++;
                txt_click.setText(sayi+"");
            }
        });

    }
}