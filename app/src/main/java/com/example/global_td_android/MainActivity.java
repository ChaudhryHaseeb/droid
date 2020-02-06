package com.example.global_td_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import com.example.global_td_android.model.Movie;
import com.example.global_td_android.model.MovieAdapter;
import com.example.global_td_android.threading.RetrieveImages;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ArrayList<Movie> movies = new ArrayList<Movie>();
    MovieAdapter myAdapter;

    public Movie[] initdata = new Movie[]{
            new Movie("Back to the futur 1","Spielberg", "1985", null),
            new Movie("Back to the futur 2","Spielberg", "1985", null),
            new Movie("Back to the futur 3","Spielberg", "1985", null),
            new Movie("Back to the futur 4","Spielberg", "1985", null)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (Movie movie: initdata)
        {
            movies.add(movie);
        }

        ListView lv = (ListView) findViewById(R.id.myList);
        myAdapter = new MovieAdapter(this.getBaseContext(), movies);
        lv.setAdapter(myAdapter);


        Button badd = findViewById(R.id.btn_add);
        Button bclear = findViewById(R.id.btn_clear);
        Button bload = findViewById(R.id.btn_load);
        Button bcert = findViewById(R.id.btn_certif);

        badd.setOnClickListener(this);
        bclear.setOnClickListener(this);
        bload.setOnClickListener(this);
        bcert.setOnClickListener(this);


    }


    @Override
    public void onClick(View v)
    {

        if(v.getId() == R.id.btn_load)
        {
            for(Movie m : movies)
            {
                RetrieveImages rt = new RetrieveImages(m, myAdapter);
                rt.execute("https://picsum.photos/80/80");
            }
        }

        if(v.getId() == R.id.btn_add)
        {
            movies.add(new Movie("Back to the future 6", "1985", "spielberg", null));
            myAdapter.notifyDataSetChanged();
        }


        if(v.getId() == R.id.btn_clear)
        {
            movies.clear();
            myAdapter.notifyDataSetChanged();
        }

        if(v.getId() == R.id.btn_certif)
        {
            Intent intent = new Intent(getApplicationContext(), CertifActivity.class);
            startActivity(intent);
        }
    }
}
