package com.library.school.model;

public class ComicBook implements SchoolResource {

    private String title;

    public ComicBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}