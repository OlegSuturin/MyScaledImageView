package com.oliverst.myscaledimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ScalingImage scalingImage;
    String url = "http://www.philately.ru/rus/images/2181.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scalingImage = findViewById(R.id.scalingImage);
        // Picasso.get().load(url).placeholder(R.drawable.placeholder).into(holder.imageViewBigStamp);
        Picasso.get().load(url).placeholder(R.drawable.placeholder).into(scalingImage);

    }
}