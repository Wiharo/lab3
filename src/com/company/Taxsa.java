package com.company;

public class Taxsa extends Dog{
    public Taxsa(){

    }

    public Taxsa(int Weight) {
        super(Weight);
    }

    protected String getColor() {
        return "Brown";
    }

    public String toString() {
        int var10000 = this.Weight;
        return "Taxsa{weight=" + var10000 + ", color='" + this.getColor() + "'}";
    }
}