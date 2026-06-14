package com.library.school.factory;

public class ElementaryCreator extends RoleCreator {

    @Override
    public Member createMember() {
        return new ElementaryStudent();
    }
}