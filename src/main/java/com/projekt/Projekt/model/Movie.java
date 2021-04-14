package com.projekt.Projekt.model;
import javax.persistence.*;


@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_generator")
    @SequenceGenerator(name="movie_generator", sequenceName = "movie_seq")
    @Column(name = "id")
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="MovieDetails_ID", referencedColumnName = "id")
    private MovieDetails movieDetails;


    public Movie() {}

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public MovieDetails getMovieDetails(){
        return movieDetails;
    }

    public void setMovieDetail(MovieDetails movieDetails){
        this.movieDetails=movieDetails;
    }

}
