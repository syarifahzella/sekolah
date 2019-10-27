package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class suksestambah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suksestambah);
    }
    public void Pindah4(View view) {
        Intent intent = new Intent(suksestambah.this, profilsekolah.class);
        startActivity(intent);
    }
}
