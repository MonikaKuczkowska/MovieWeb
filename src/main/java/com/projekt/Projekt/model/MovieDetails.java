package com.projekt.Projekt.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MOVIE_DETAILS")

public class MovieDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movied_generator")
    @SequenceGenerator(name="movied_generator", sequenceName = "movied_seq")
    @Column(name = "id")
    private int id;

    @Column(name="Year")
    private int year;

    @ManyToMany
    private List<Genre> genre =new ArrayList<>();

    @ManyToMany
    private List<Country> country=new ArrayList<>();

    @ManyToMany
    private List<Actor> actor =new ArrayList<>();

    @ManyToMany
    private List<Director> director =new ArrayList<>();


    public MovieDetails() {}

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear( int year ) {
        this.year = year;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Director> getDirector() {
        return director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

}
