package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn, btn2;
    CheckBox chkb1, chkb2, chkb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn_submit);
        btn2 = findViewById(R.id.btn_cancel);
        chkb1 = findViewById(R.id.checkbox1);
        chkb2 = findViewById(R.id.checkbox2);
        chkb3 = findViewById(R.id.checkbox3);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                if(chkb1.isChecked()){
                    result.append(chkb1.getText().toString());
                }
                if(chkb2.isChecked()){
                    result.append(chkb2.getText().toString());
                }
                if(chkb3.isChecked()){
                    result.append(chkb3.getText().toString());
                }
                if(result.length() == 0){
                    Toast.makeText(MainActivity.this, "pls pick one", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this,  "tttt" + result, Toast.LENGTH_SHORT).show();
               // Toast.makeText(MainActivity7.this, "Hello "+ editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkb1.setChecked(false);
                chkb2.setChecked(false);
                chkb3.setChecked(false);
            }
        });


    }
}