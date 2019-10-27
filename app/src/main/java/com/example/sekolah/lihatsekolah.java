package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lihatsekolah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatsekolah);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(lihatsekolah.this, editprofil.class);
        startActivity(intent);
    }
}
