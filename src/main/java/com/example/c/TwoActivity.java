package com.example.c;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle arguments = getIntent().getExtras();
        TextView textView2 = findViewById(R.id.textView2);
        String firstChislo;
        String secondChislo;
        int result = arguments.getInt("firstChislo")+arguments.getInt("secondChislo");

        firstChislo = arguments.get("firstChislo").toString();

        if(arguments.getInt("secondNumber")<0){
            secondChislo = "("+arguments.get("secondChislo").toString()+")";
        }
        else {
            secondChislo = arguments.get("secondChislo").toString();
        }
        textView2.setText(firstChislo+" + "+secondChislo+" = "+result);
    }
    public void onClickReturn(View view){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}