package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class validasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validasi);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(validasi.this, profilvalidasi.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(validasi.this, profilvalidasi2.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(validasi.this, profilvalidasi3.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(validasi.this, profilvalidasi4.class);
        startActivity(intent);
    }
}
