package com.example.soccernews.domain;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class News {

    @PrimaryKey
    public int id;
    public String title;
    public String description;
    public String image;
    public String url;
    public boolean favorite;
}
