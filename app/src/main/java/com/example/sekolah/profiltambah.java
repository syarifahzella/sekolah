package com.example.sekolah;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class profiltambah extends AppCompatActivity {

    ImageView img1;
    Button btn1;

    final int kodeGallery = 100;
    Uri imageUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiltambah);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        img1 = (ImageView) findViewById(R.id.gambar1);
        btn1 = (Button) findViewById(R.id.buttonupload);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intentGallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intentGallery, kodeGallery);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == kodeGallery && resultCode == RESULT_OK) {
            imageUri = data.getData();
            img1.setImageURI(imageUri);
        }
    }

    public void Pindah3(View view) {
        Intent intent = new Intent(profiltambah.this, suksestambah.class);
        startActivity(intent);
    }
}
