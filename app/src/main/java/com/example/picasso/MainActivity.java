package com.example.picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    private String URL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.imgView);
        URL = "https://cdn.pixabay.com/photo/2017/01/11/08/31/icon-1971128_960_720.png";
        Picasso.get().load(URL).placeholder(R.drawable.ic_launcher_background).into(imgView);
        }
}
