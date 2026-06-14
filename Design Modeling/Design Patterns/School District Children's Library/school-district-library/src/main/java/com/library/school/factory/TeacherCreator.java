package com.library.school.factory;

public class TeacherCreator extends RoleCreator {

    @Override
    public Member createMember() {
        return new TeacherAccount();
    }
}