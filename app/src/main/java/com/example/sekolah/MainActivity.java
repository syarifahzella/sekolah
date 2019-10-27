package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(MainActivity.this, lihatsekolah.class);
        startActivity(intent);
    }

    public void Pindah2(View view) {
        Intent intent = new Intent(MainActivity.this, lihatsekolah.class);
        startActivity(intent);
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(MainActivity.this, suksestambah.class);
        startActivity(intent);
    }

    public void Pindah4(View view) {
        Intent intent = new Intent(MainActivity.this, profilsekolah.class);
        startActivity(intent);
    }

    public void Pindah5(View view) {
        Intent intent = new Intent(MainActivity.this, lihatsekolah.class);
        startActivity(intent);
    }

    public void Pindah6(View view) {
        Intent intent = new Intent(MainActivity.this, editprofil.class);
        startActivity(intent);
    }

    public void Pindah7(View view) {
        Intent intent = new Intent(MainActivity.this, suksestambah.class);
        startActivity(intent);
    }

    public void Pindah8(View view) {
        Intent intent = new Intent(MainActivity.this, suksesedit.class);
        startActivity(intent);
    }

    public void Pindah9(View view) {
    }

    public void Pindah10(View view) {
    }

    public void Pindah11(View view) {
    }

    public void Pindah12(View view) {
    }

    public void Pindah13(View view) {
    }

    public void Pindah14(View view) {
    }

    public void Pindah15(View view) {
    }

    public void Pindah16(View view) {
    }

    public void Pindah17(View view) {
    }

    public void Pindah18(View view) {
        Intent intent = new Intent(MainActivity.this, validasi.class);
        startActivity(intent);
    }
}
