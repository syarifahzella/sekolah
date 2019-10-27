package com.example.sekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class suksesedit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suksesedit);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(suksesedit.this, lihatsekolah.class);
        startActivity(intent);
    }
}
