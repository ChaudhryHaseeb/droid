package com.example.global_td_android.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.global_td_android.R;

import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie>
{
    private List<Movie> movieList;
    private Context context;

    public MovieAdapter(Context ctx, List<Movie> movies) {
        super(ctx, 0, movies);
        this.movieList = movies;
        this.context = ctx;
    }

    @Override
    public View getView(int position, View recup, ViewGroup parent) {
        if (recup == null) {
            // This a new view we inflate the new layout
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            recup = inflater.inflate(R.layout.movie_list, parent, false);
        }

        TextView tvTitre = (TextView) recup.findViewById(R.id.item_titre);
        TextView tvReal = (TextView) recup.findViewById(R.id.item_real);
        TextView tvDate = (TextView) recup.findViewById(R.id.item_date);

        Movie movie = this.movieList.get(position);

        ImageView img = (ImageView) recup.findViewById(R.id.item_imageView);
        if(movie.getImages() != null)
        {
            img.setImageBitmap(movie.getImages());
        }

        tvTitre.setText(movie.getTitre());
        tvReal.setText(movie.getRealisateur());
        tvDate.setText(movie.getDate());

        return recup;
    }


}
