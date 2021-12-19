package com.company;

public abstract class Dog {
    protected int Weight;
    protected String Color;

    Dog() {
    }

    public Dog(int Weight) {
        this.Weight = Weight;
    }

    public int getWeight() {
        return this.Weight;
    }

    protected abstract String getColor();
}

