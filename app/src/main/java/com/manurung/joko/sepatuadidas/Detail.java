package com.manurung.joko.sepatuadidas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    public static final String SEPATU_EXTRA = "sepatu_extra";
    ImageView imgSepatu;
    TextView tvNamaSepatu, tvHargaSepatu, tvDescSepatu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Sepatu sepatu = getIntent().getParcelableExtra(SEPATU_EXTRA);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgSepatu = findViewById(R.id.img_item_photo);
        tvNamaSepatu = findViewById(R.id.tv_nama_sepatu);
        tvHargaSepatu = findViewById(R.id.tv_harga_sepatu);
        tvDescSepatu = findViewById(R.id.tv_desc_sepatu);

        Glide.with(this).load(sepatu.getPhoto()).into(imgSepatu);
        tvNamaSepatu.setText(sepatu.getNamaSepatu());
        tvHargaSepatu.setText(sepatu.getHargaSepatu());
        tvDescSepatu.setText(sepatu.getDescSepatu());
    }

    public boolean onSupportNavigationUp(){
        onBackPressed();
        return true;
    }

}
