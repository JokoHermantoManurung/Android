package com.manurung.joko.sepatuadidas;

import android.os.Parcel;
import android.os.Parcelable;

public class Sepatu implements Parcelable {
    private String namaSepatu;
    private String hargaSepatu;
    private String descSepatu;
    private String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNamaSepatu() {
        return namaSepatu;
    }

    public void setNamaSepatu(String namaSepatu) {
        this.namaSepatu = namaSepatu;
    }

    public String getHargaSepatu() {
        return hargaSepatu;
    }

    public void setHargaSepatu(String hargaSepatu) {
        this.hargaSepatu = hargaSepatu;
    }

    public String getDescSepatu() {
        return descSepatu;
    }

    public void setDescSepatu(String descSepatu) {
        this.descSepatu = descSepatu;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.namaSepatu);
        dest.writeString(this.hargaSepatu);
        dest.writeString(this.descSepatu);
        dest.writeString(this.photo);
    }

    public Sepatu() {
    }

    protected Sepatu(Parcel in) {
        this.namaSepatu = in.readString();
        this.hargaSepatu = in.readString();
        this.descSepatu = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Sepatu> CREATOR = new Parcelable.Creator<Sepatu>() {
        @Override
        public Sepatu createFromParcel(Parcel source) {
            return new Sepatu(source);
        }

        @Override
        public Sepatu[] newArray(int size) {
            return new Sepatu[size];
        }
    };
}
