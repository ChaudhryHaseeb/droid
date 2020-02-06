package com.example.global_td_android.model;

import com.example.global_td_android.model.Rating;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class MovieOMDB implements Serializable
{

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Year")
    @Expose
    private String year;
    @SerializedName("Rated")
    @Expose
    private String rated;
    @SerializedName("Released")
    @Expose
    private String released;
    @SerializedName("Runtime")
    @Expose
    private String runtime;
    @SerializedName("Genre")
    @Expose
    private String genre;
    @SerializedName("Director")
    @Expose
    private String director;
    @SerializedName("Writer")
    @Expose
    private String writer;
    @SerializedName("Actors")
    @Expose
    private String actors;
    @SerializedName("Plot")
    @Expose
    private String plot;
    @SerializedName("Language")
    @Expose
    private String language;
    @SerializedName("Country")
    @Expose
    private String country;
    @SerializedName("Awards")
    @Expose
    private String awards;
    @SerializedName("Poster")
    @Expose
    private String poster;
    @SerializedName("Ratings")
    @Expose
    private List<Rating> ratings = null;
    @SerializedName("Metascore")
    @Expose
    private String metascore;
    @SerializedName("imdbRating")
    @Expose
    private String imdbRating;
    @SerializedName("imdbVotes")
    @Expose
    private String imdbVotes;
    @SerializedName("imdbID")
    @Expose
    private String imdbID;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("DVD")
    @Expose
    private String dVD;
    @SerializedName("BoxOffice")
    @Expose
    private String boxOffice;
    @SerializedName("Production")
    @Expose
    private String production;
    @SerializedName("Website")
    @Expose
    private String website;
    @SerializedName("Response")
    @Expose
    private String response;
    private final static long serialVersionUID = -4788607493768122466L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MovieOMDB() {
    }

    /**
     * 
     * @param country
     * @param year
     * @param production
     * @param language
     * @param imdbRating
     * @param title
     * @param imdbVotes
     * @param type
     * @param dVD
     * @param plot
     * @param ratings
     * @param genre
     * @param released
     * @param website
     * @param director
     * @param imdbID
     * @param runtime
     * @param rated
     * @param actors
     * @param awards
     * @param response
     * @param writer
     * @param metascore
     * @param boxOffice
     * @param poster
     */
    public MovieOMDB(String title, String year, String rated, String released, String runtime, String genre, String director, String writer, String actors, String plot, String language, String country, String awards, String poster, List<Rating> ratings, String metascore, String imdbRating, String imdbVotes, String imdbID, String type, String dVD, String boxOffice, String production, String website, String response) {
        super();
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.released = released;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.writer = writer;
        this.actors = actors;
        this.plot = plot;
        this.language = language;
        this.country = country;
        this.awards = awards;
        this.poster = poster;
        this.ratings = ratings;
        this.metascore = metascore;
        this.imdbRating = imdbRating;
        this.imdbVotes = imdbVotes;
        this.imdbID = imdbID;
        this.type = type;
        this.dVD = dVD;
        this.boxOffice = boxOffice;
        this.production = production;
        this.website = website;
        this.response = response;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDVD() {
        return dVD;
    }

    public void setDVD(String dVD) {
        this.dVD = dVD;
    }

    public String getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(String boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("year", year).append("rated", rated).append("released", released).append("runtime", runtime).append("genre", genre).append("director", director).append("writer", writer).append("actors", actors).append("plot", plot).append("language", language).append("country", country).append("awards", awards).append("poster", poster).append("ratings", ratings).append("metascore", metascore).append("imdbRating", imdbRating).append("imdbVotes", imdbVotes).append("imdbID", imdbID).append("type", type).append("dVD", dVD).append("boxOffice", boxOffice).append("production", production).append("website", website).append("response", response).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(year).append(production).append(language).append(imdbRating).append(title).append(imdbVotes).append(type).append(dVD).append(plot).append(ratings).append(genre).append(released).append(website).append(director).append(imdbID).append(runtime).append(rated).append(actors).append(awards).append(response).append(writer).append(metascore).append(boxOffice).append(poster).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MovieOMDB) == false) {
            return false;
        }
        MovieOMDB rhs = ((MovieOMDB) other);
        return new EqualsBuilder().append(country, rhs.country).append(year, rhs.year).append(production, rhs.production).append(language, rhs.language).append(imdbRating, rhs.imdbRating).append(title, rhs.title).append(imdbVotes, rhs.imdbVotes).append(type, rhs.type).append(dVD, rhs.dVD).append(plot, rhs.plot).append(ratings, rhs.ratings).append(genre, rhs.genre).append(released, rhs.released).append(website, rhs.website).append(director, rhs.director).append(imdbID, rhs.imdbID).append(runtime, rhs.runtime).append(rated, rhs.rated).append(actors, rhs.actors).append(awards, rhs.awards).append(response, rhs.response).append(writer, rhs.writer).append(metascore, rhs.metascore).append(boxOffice, rhs.boxOffice).append(poster, rhs.poster).isEquals();
    }

}
