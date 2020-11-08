package com.example.mygallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ActImageView extends AppCompatActivity {

    ImageView imageView;
    String image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_image_view);

        imageView = findViewById(R.id.IdImageSet);

        image = getIntent().getStringExtra("picture");
        Glide.with(this).load(image).into(imageView);

//        Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();



    }
}