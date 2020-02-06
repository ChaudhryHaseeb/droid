package com.example.global_td_android.model;

import android.graphics.Bitmap;

public class Movie
{
    private String titre;
    private String date;
    private String realisateur;
    private Bitmap images;

    public Movie(String titre, String date, String realisateur, Bitmap images) {
        this.titre = titre;
        this.date = date;
        this.realisateur = realisateur;
        this.images = images;
    }

    public String getTitre() {
        return titre;
    }

    public String getDate() {
        return date;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public Bitmap getImages() {
        return images;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public void setImages(Bitmap images) {
        this.images = images;
    }
}
