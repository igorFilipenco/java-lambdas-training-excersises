package com.lambda;

import com.lambda.Album;

import java.util.List;


public class Artist {
    private String name;
    private String location;
    private List<String> members;
    private List<Album> albums;

    public Artist(String name, String location, List<Album> albums) {
        this.name = name;
        this.location = location;
        this.albums = albums;
    }

    public Artist(String name, String location, List<String> members, List<Album> albums) {
        this.name = name;
        this.location = location;
        this.members = members;
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
