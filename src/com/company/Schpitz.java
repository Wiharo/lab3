package com.company;

public class Schpitz extends Dog {
    public Schpitz() {
    }

    public Schpitz(int Weight) {
        super(Weight);
    }

    protected String getColor() {
        return "White";
    }

    public String toString() {
        int var10000 = this.Weight;
        return "Schpitz{weight=" + var10000 + ", color='" + this.getColor() + "'}";
    }
}
