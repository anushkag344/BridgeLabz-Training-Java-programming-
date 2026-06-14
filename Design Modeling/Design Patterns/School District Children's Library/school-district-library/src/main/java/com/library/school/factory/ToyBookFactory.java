package com.library.school.factory;

import com.library.school.model.ComicBook;
import com.library.school.model.EducationalToy;
import com.library.school.model.SchoolResource;

public class ToyBookFactory {

    public static SchoolResource createResource(String type, String title) {

        if (type.equalsIgnoreCase("comic")) {
            return new ComicBook(title);
        }

        if (type.equalsIgnoreCase("toy")) {
            return new EducationalToy(title);
        }

        throw new IllegalArgumentException("Invalid Type");
    }
}