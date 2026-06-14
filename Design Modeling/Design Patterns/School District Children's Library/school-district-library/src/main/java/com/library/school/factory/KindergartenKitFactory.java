package com.library.school.factory;

public class KindergartenKitFactory implements GradeCurriculumFactory {

    @Override
    public String createBook() {
        return "AlphabetBook";
    }

    @Override
    public String createDigitalTool() {
        return "PhonicsApp";
    }
}