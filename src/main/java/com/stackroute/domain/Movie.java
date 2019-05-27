package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    private int id;
    private String movieName;
    private Actor actor1;

    public Movie() {
    }

    public Movie(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public Movie(int id, String movieName, Actor actor1) {
        this.id = id;
        this.movieName = movieName;
        this.actor1 = actor1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor1() {
        return actor1;
    }

    @Autowired
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actor=" + actor1 +
                '}';
    }
}
