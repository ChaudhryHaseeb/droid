package com.example.global_td_android.threading;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import com.example.global_td_android.model.Movie;
import com.example.global_td_android.model.MovieAdapter;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class RetrieveImages extends AsyncTask<String, Void, Bitmap>
{

    private Movie m;
    private MovieAdapter ma;

    public RetrieveImages(Movie m, MovieAdapter ma) {
        this.m = m;
        this.ma = ma;
    }

    @Override
    protected Bitmap doInBackground(String... urls)
    {
        System.out.println(urls[0]);
        try
        {
            URL url = new URL(urls[0]);
            URLConnection conn = url.openConnection();
            conn.connect();
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            Bitmap bm = BitmapFactory.decodeStream(bis);
            bis.close();
            return bm;

        }
        catch (IOException e)
        {
            System.out.println("---------------\n" + e);
            return null;
        }

    }

    @Override
    protected void onPostExecute(Bitmap img)
    {
        System.out.println("imageees : "+img);
        super.onPostExecute(img);
        m.setImages(img);
        ma.notifyDataSetChanged();
    }
}
