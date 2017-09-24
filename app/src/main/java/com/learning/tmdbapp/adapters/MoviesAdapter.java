package com.learning.tmdbapp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.learning.tmdbapp.R;
import com.learning.tmdbapp.models.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {
    public static final String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/w640//";
    private List<Movie> movies;
    private int rowLayout;
    private Context context;

    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        ImageView moviePoster;

        public MovieViewHolder(View v) {
            super(v);
            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            movieTitle = (TextView) v.findViewById(R.id.title);
            moviePoster = (ImageView) v.findViewById(R.id.poster);
        }
    }

    public MoviesAdapter(List<Movie> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewtype) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        String posterPath = IMAGE_BASE_URL + movies.get(position).getPosterPath();
        Picasso.with(context).load(posterPath).into(holder.moviePoster);
        holder.movieTitle.setText(movies.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }
}
