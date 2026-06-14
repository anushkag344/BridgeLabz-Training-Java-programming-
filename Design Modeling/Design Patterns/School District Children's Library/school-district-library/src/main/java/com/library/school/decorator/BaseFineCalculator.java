package com.library.school.decorator;

public class BaseFineCalculator implements FineCalculator {

    @Override
    public double calculateFine(int daysOverdue) {

        return daysOverdue * 0.50;
    }
}