package com.example.wprowadzenie3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void wypisz(View view) {
        Toast.makeText( MainActivity.this,"Wyświetlany tekst" ,Toast.LENGTH_SHORT).show();
    }

    public void zmienTekst(View view) {
        TextView textView = findViewById(R.id.napisTextView);
        textView.setText("Inny tekst");
    }
}