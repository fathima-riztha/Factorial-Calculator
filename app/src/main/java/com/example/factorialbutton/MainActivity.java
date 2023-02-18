package com.example.factorialbutton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    Button btn;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        edt = (EditText) findViewById(R.id.editTextTextPersonName);

    /*
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,second.class);
                intent.putExtra("Fac", edt.getText().toString());
                startActivity(intent);
            }

     });

     */
}

public void send(View view){
    Intent intent = new Intent(context,MainActivity2.class);
    intent.putExtra("Fac", edt.getText().toString());
    startActivity(intent);
}


}