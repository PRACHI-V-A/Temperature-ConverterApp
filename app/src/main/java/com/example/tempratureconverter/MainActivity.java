package com.example.tempratureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textview);
        EditText editText = findViewById(R.id.editText);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView textcon1 = findViewById(R.id.textViewcon1);
        TextView textcon2 = findViewById(R.id.textViewcon2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double temp = Double.parseDouble(s);

                double con1 = (temp * 9/5) + 32;
                textView.setText("The Corresponding Value in °F is:" + con1 + "°F");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                double temp2 = Double.parseDouble(s);
                double con2 = ( temp2 - 32 ) * 5/9 ;
                textView.setText("The Corresponding Value in °C is:" + con2 + "°C");
            }
        });

    }
}