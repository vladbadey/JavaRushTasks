package com.javarush.task.task14.task1417;

class  Hryvnia extends Money {
    public Hryvnia(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 10;
    }

    @Override
    public String getCurrencyName() {
        return "UAH";
    }
}
