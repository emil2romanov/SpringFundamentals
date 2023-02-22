package com.softuni.pathfinder.domain.dto.models;

import com.softuni.pathfinder.domain.entities.User;

public class PictureModel {

    private Long id;
    private String title;
    private String url;
    private User author;
    private RouteModel route;

    public PictureModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public RouteModel getRoute() {
        return route;
    }

    public void setRoute(RouteModel route) {
        this.route = route;
    }
}
