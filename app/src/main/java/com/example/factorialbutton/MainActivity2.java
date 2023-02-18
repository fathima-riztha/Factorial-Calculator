package com.example.factorialbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();

        txt1 = findViewById(R.id.textView);

        int val = Integer.parseInt(extras.getString("Fac"));
        int fac=1;

        for (int i = 1;i<val+1;i++)
            fac = fac * i;

        txt1.setText("Factorial  "  +val+ " = "  +fac);

    }
}