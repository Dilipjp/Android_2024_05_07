package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.radio_group);
        btn1 = findViewById(R.id.submit);
        btn2 = findViewById(R.id.cancel);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtoId = radioGroup.getCheckedRadioButtonId();
                if(selectedRadioButtoId != -1){
                    radioButton  =findViewById(selectedRadioButtoId);
                   String result =  radioButton.getText().toString();
                    Toast.makeText(MainActivity2.this, "You are " +result, Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity2.this, "not selected" , Toast.LENGTH_SHORT).show();
                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               radioGroup.clearCheck();
            }
        });




    }
}