package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.kgvalue);
        textView=findViewById(R.id.answer);
        button=findViewById(R.id.chack);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sn=editText.getText().toString();
                int ci=Integer.parseInt(sn);
                double pound=2.205*ci;
                textView.setText("Pound Value is:"+pound);
                Toast.makeText(MainActivity.this, "We successfully calculate your value", Toast.LENGTH_SHORT).show();
            }
        });

    }
}