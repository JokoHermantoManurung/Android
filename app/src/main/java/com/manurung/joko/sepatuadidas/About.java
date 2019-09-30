package com.manurung.joko.sepatuadidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends AppCompatActivity {
    //private ImageView imageView;
    //private TextView tvNama, tvEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        imageView = findViewById(R.id.img_profile);
//        tvNama = findViewById(R.id.tv_name);
//        tvEmail = findViewById(R.id.tv_email);
    }
}
