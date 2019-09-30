package com.manurung.joko.sepatuadidas;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class SepatuAdapter extends RecyclerView.Adapter<SepatuAdapter.SepatuHolder> {
    private ArrayList<Sepatu> listSepatu;
    private Context context;

    public SepatuAdapter(ArrayList<Sepatu> list){
        this.listSepatu = list;
    }

    @NonNull
    @Override
    public SepatuHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sepatu, viewGroup, false);
        return new SepatuHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final SepatuHolder sepatuHolder, int i) {
    Sepatu sepatu = listSepatu.get(i);

        Glide.with(sepatuHolder.itemView.getContext())
                .load(sepatu.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(sepatuHolder.imgPhoto);

        sepatuHolder.tvName.setText(sepatu.getNamaSepatu());
        sepatuHolder.tvHarga.setText(sepatu.getHargaSepatu());
        sepatuHolder.tvDesc.setText(sepatu.getDescSepatu());

        sepatuHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = v.getContext();
                Intent intent = new Intent(context, Detail.class);
                intent.putExtra(Detail.SEPATU_EXTRA, listSepatu.get(sepatuHolder.getAdapterPosition()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSepatu.size();
    }

    public class SepatuHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvHarga, tvDesc;

        public SepatuHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_nama_sepatu);
            tvHarga = itemView.findViewById(R.id.tv_harga_sepatu);
            tvDesc = itemView.findViewById(R.id.tv_desc_sepatu);
        }
    }
}
