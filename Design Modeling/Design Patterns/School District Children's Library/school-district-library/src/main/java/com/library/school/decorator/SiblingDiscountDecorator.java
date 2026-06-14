package com.library.school.decorator;

public class SiblingDiscountDecorator implements FineCalculator {
     //Ye wrapped object ko store karta hai
    private FineCalculator decorated;

    public SiblingDiscountDecorator(FineCalculator decorated) {
        this.decorated = decorated;
    }

    @Override
    public double calculateFine(int daysOverdue) {

        double fine = decorated.calculateFine(daysOverdue);

        return fine * 0.5;
    }
}