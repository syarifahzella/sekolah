package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profilsekolah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilsekolah);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(profilsekolah.this, profiltambah.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(profilsekolah.this, lihatsekolah.class);
        startActivity(intent);
    }
}
