package com.learning.tmdbapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName("id")
    private Integer id;

    @SerializedName("vote_count")
    private Integer voteCount;

    @SerializedName("video")
    private boolean video;

    @SerializedName("vote_average")
    private Double voteAverage;

    @SerializedName("title")
    private String title;

    @SerializedName("popularity")
    private Double popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<>();

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("adult")
    private Boolean adult;

    @SerializedName("overview")
    private String overview;

    @SerializedName("release_date")
    private String release_date;

    public Movie(Integer id, Integer voteCount, boolean video, Double voteAverage, String title,
                 Double popularity, String posterPath, String originalLanguage, String originalTitle,
                 List<Integer> genreIds, String backdropPath, boolean adult, String overview,
                 String release_date) {
        this.id = id;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage = voteAverage;
        this.title = title;
        this.popularity = popularity;
        this.posterPath = posterPath;
        this.originalLanguage = originalLanguage;
        this.originalTitle = originalTitle;
        this.genreIds = genreIds;
        this.backdropPath = backdropPath;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public boolean isVideo() {
        return video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public Double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Boolean getAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getReleaseDate() {
        return release_date;
    }
}
