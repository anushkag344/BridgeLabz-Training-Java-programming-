package com.library.school.factory;

public class TeacherAccount extends Member {

    @Override
    public int getLimit() {
        return 25;
    }
}