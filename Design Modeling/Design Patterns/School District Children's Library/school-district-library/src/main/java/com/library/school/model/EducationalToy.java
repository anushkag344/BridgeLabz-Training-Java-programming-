package com.library.school.model;

public class EducationalToy implements SchoolResource {

    private String title;

    public EducationalToy(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}