package com.example.c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText first;
    EditText second;
    Integer firstChislo = 0;
    Integer secondChislo = 0;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, TwoActivity.class);
        intent.putExtra("firstChislo", firstChislo);
        intent.putExtra("secondNumber", secondChislo);
        first = findViewById(R.id.first);
        second = findViewById(R.id.second);

    }

    public void onClickSum(View view){
        try {
            firstChislo = Integer.parseInt(first.getText().toString());
            secondChislo = Integer.parseInt(second.getText().toString());
            intent.putExtra("firstNumber", firstChislo);
            intent.putExtra("secondNumber", secondChislo);
            startActivity(intent);
        }
        catch (Exception ex){
            Toast.makeText(this, "Попробуйте снова", Toast.LENGTH_LONG).show();
        }
    }
}