package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profilvalidasi3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilvalidasi3);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(profilvalidasi3.this, suksesvalid.class);
        startActivity(intent);
    }
}
