package com.example.week4day3;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageWithFields implements Parcelable {
    String url;
    String name;
    String type;
    String like;

    public ImageWithFields(String url, String name, String type, String like) {
        this.url = url;
        this.name = name;
        this.type = type;
        this.like = like;
    }

    protected ImageWithFields(Parcel in) {
        url = in.readString();
        name = in.readString();
        type = in.readString();
        like = in.readString();
    }

    public static final Creator<ImageWithFields> CREATOR = new Creator<ImageWithFields>() {
        @Override
        public ImageWithFields createFromParcel(Parcel in) {
            return new ImageWithFields(in);
        }

        @Override
        public ImageWithFields[] newArray(int size) {
            return new ImageWithFields[size];
        }
    };

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLike() {
        return like;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(url);
        parcel.writeString(name);
        parcel.writeString(type);
        parcel.writeString(like);
    }
}
