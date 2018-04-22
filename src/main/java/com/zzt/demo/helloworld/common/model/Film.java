package com.zzt.demo.helloworld.common.model;

public class Film {
    private Integer id;

    private String filmName;

    private String director;

    private String actor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName == null ? null : filmName.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }
}